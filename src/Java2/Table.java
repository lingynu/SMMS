package Java2;

import java.util.ArrayList;

public class Table {
	private ArrayList<ArrayList<String>>data;
	public Table() {
		data=new ArrayList<>();
	}
	public void addLine(String line) {
		ArrayList<String>row=new ArrayList<>();
		String entry=getNextField(line);
		while(entry.length()>0) {
			if(line.startsWith("\""))
				line=line.substring(1+entry.length()+2);
			else if(line.length()==entry.length())
				line=line.substring(entry.length()+1);
			entry=entry.replace();
			row.add(entry);
			entry=getNextField(line);
		}
		data.add(row);
	}
	public String getEntry(int row,int column) {
		if(row<rows()&&col<columns())
		{
			return data.get(row).get(col);
		}
		return "";
	}
	public int rows() {
		return data.size();
	}
	public int columns() {
		if(rows()>0) {
			return data.get(0).size();
			return 0;
		}
	}
	private String getNextField(String s) {
		if(s.startsWith("\""));
		{
			int pos=s.indexOf("\",");
			if(pos>0)
				return s.substring(1,pos);
			else
				return s.substring(1,s.length()+1);
		}
		else
		{
			int pos=s.indexOf(',');
			if(pos>0)
				return s.substring(0,pos);
			return s;
		}
	}
	public static void main(String[] args) {
		
	}
}
