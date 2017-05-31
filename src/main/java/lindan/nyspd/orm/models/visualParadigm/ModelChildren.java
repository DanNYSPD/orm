package lindan.nyspd.orm.models.visualParadigm;

import java.util.ArrayList;
import java.util.List;

public class ModelChildren {
	List<DBColumn> DBColumns= new ArrayList<DBColumn>();

	public ModelChildren(){
		//DBColumn= new ArrayList<DBColumn>();
		
	}
	public List<DBColumn> getDBColumn() {
		return DBColumns;
	}

	public void setDBColumn(List<DBColumn> dBColumn) {
		DBColumns = dBColumn;
	}
	public String toString() {
		String msj="";
		List<DBColumn> columns =getDBColumn();
		if(columns!=null){
			for(DBColumn dbColumn : columns){
				msj+="\n"+dbColumn.toString();
			}
			
		}
		
		return msj;
	}
}
