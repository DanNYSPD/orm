package lindan.nyspd.orm;

import java.io.File;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;
//import java.util.function.Consumer;

//import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import lindan.nyspd.orm.models.visualParadigm.DBColumn;
import lindan.nyspd.orm.models.visualParadigm.DBTable;
import lindan.nyspd.orm.models.visualParadigm.Enums;
import lindan.nyspd.util.function.Consumer;
/**
 * clase core, se encarga de leer un archivo xml de visual paradigm 
 * y extraer las tablas y atriburos que contiene.
 * La logica esta basada en cmo visualParadimg guarda los xml de los modelos ERM en su version 14.0
 * @author daniel
 *
 */
public class ReadXML {
	
	
	public Document readXML(String path){
	
		Document doc=null;
		  try {

				File fXmlFile = new File( path);
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				doc = dBuilder.parse(fXmlFile);

				//optional, but recommended
				//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
				doc.getDocumentElement().normalize();

				System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				
				
		  } catch (Exception e) {
				e.printStackTrace();
			    }
		 return doc;
		
	}
	/*
	 * metodo que recibe el path del xml para leerlo y generar la lista de tablas
	 */
	public List<DBTable> generateSchemeFromXML(String path) {
		List<DBTable> scheme= new ArrayList<>();
		Document doc=readXML(path);
		if(doc==null)
			return scheme;
		// en base al analisis del xml solo el prime tag models es el relevante
		Node modelsNode = doc.getElementsByTagName(Enums.TAGS.Models).item(0);
		System.out.println("--------------------------lenf de models--"+doc.getElementsByTagName(Enums.TAGS.Models).getLength());
		//hacemos el casting para poder extraer los elementos con el metoodo getElementsByTagName();
		Element modelsElement=(Element)modelsNode;
		

		//obtenemos todas las tablas
		NodeList nList = modelsElement.getElementsByTagName(Enums.TAGS.DBTable);
	
		//System.out.println(modelsElement.hasAttributes());
		//System.out.println("----------------------------"+nList.getLength());
	
		scheme = crearEsquema(nList);	
		
		imprimirTablas(scheme);
		return scheme;
		
		
	}
	public void imprimirTablas(List<DBTable> scheme){
		//scheme.forEach(System.out::println);		
	}
	/**
	 * Recibe una lista de nodos de tipo (que representan una tabla en el xml)
	 * @param nList
	 * @return colleciion de tipo DBTABLE que representa el esquema
	 */
	public List<DBTable> crearEsquema(NodeList nList){
		List<DBTable> scheme= new ArrayList<>();
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);

			//System.out.println("\nCurrent Element :" + nNode.getNodeName());

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					
				Element eElement = (Element) nNode;
				// si tiene el atributi "Idref" lo saltamos 
				if(eElement.hasAttribute("Idref")){ 
					continue;
				}
				DBTable dbTable=crearTabla(eElement);
				if(dbTable!=null){
					scheme.add(dbTable);
				}				
				//System.out.println("TBTAble name : " + eElement.getAttribute("Name")+" "+temp);
			}
		}
		return scheme;
		
	}
	public DBTable crearTabla(Element eElement) {
		DBTable dbTable = new DBTable();
		
		NodeList nodeList=eElement.getElementsByTagName(Enums.TAGS.DBColumn);
		
		String id=eElement.getAttribute(Enums.DBTableAttributes.Id);
		String name=eElement.getAttribute(Enums.DBTableAttributes.Name);
		dbTable.setId(id);
		dbTable.setName(name);
		
		
		List<DBColumn> columns=dbTable.getModelChildren().getDBColumn();
	
		for(int i=0;i<nodeList.getLength();i++){
			DBColumn dbColumn=crearColumna(nodeList.item(i));
			if(dbColumn!=null){
				columns.add(dbColumn);
			}
		}
		return dbTable;
		
	}
	public DBColumn crearColumna(Node nNode) {
		DBColumn dbColumn = new DBColumn();
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) nNode;
			String id=element.getAttribute(Enums.DBColumnAttributes.Id);
			String name=element.getAttribute(Enums.DBColumnAttributes.Name);
			String type=element.getAttribute(Enums.DBColumnAttributes.Type);
			
			dbColumn.setId(id);
			dbColumn.setName(name);
			dbColumn.setType(type);
			//dbColumn.setName
			//dbColumn.setType(ElementType);
			return dbColumn;
			
		}
		return null;
	}
	public void Recorrer(NodeList nodeList,Consumer<Node,DBColumn> ite) {
		for(int i=0;i<nodeList.getLength();i++){
			ite.accept(nodeList.item(i));
		}
		
	}

	public List<Node> recastar(Element modelsElement){
		NodeList nodeList=  modelsElement.getChildNodes();
		List<Node> list=new ArrayList();
		int l=nodeList.getLength();
	for(int i=0;i<l;i++){
		
		Node nNode = nodeList.item(i);
		Element eElement = (Element) nNode;
		if(eElement.hasAttributes()){
			if(eElement.getAttribute("DataModel")!=""){
				list.add(nNode);				
			}
		}
	}
		  return list;
	  }
}
