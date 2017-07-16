package lindan.nyspd.orm;

import java.util.List;


import lindan.nyspd.orm.engine.LFileWriter;
import lindan.nyspd.orm.engine.Language;

import lindan.nyspd.orm.engine.php5.IPhpClassToString;
import lindan.nyspd.orm.engine.php5.Php5Mapper;
import lindan.nyspd.orm.engine.php5.PhpClassToString;

import lindan.nyspd.orm.engine.php5.models.PhpNameSpace;

import lindan.nyspd.orm.models.visualParadigm.DBTable;

public class AppPhp {
	public static void main(String[] args) {
		System.out.println( "Hello Daniel, this is your firt xml reader program" );
	      //  new ReadXML().readXML("C:/Users/daniel/workspace/eclipseNeon/orm/resources/xmlP.xml");
			// creamos una lista  que ocontenga cada tabla:
	      List<DBTable> scheme=  new ReadXML().generateSchemeFromXML("C:/Users/daniel/workspace/eclipseNeon/orm/resources/xmlP.xml");
	      
	      //convierte el xml en modelos de php
	      Php5Mapper php5Mapper= new Php5Mapper(scheme);
	      
	      PhpNameSpace phpPackage=php5Mapper.createModels();
	      
	      //convertimos la defincion de modelos php y creamos y seteamos su toString()
	      IPhpClassToString phpWriter = new PhpClassToString();
	      phpWriter.setStringToPackage(phpPackage);
	      
	      LFileWriter fileWriter= new LFileWriter(Language.PHP5);
	      fileWriter.WriteClases(phpPackage.getClasses());
	}
}
