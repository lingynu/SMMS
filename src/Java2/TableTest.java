package Java2;

public class TableTest {
	public static void main(String[] args) {
		Table table=new Table();
		table.addLine("\"Jone Jacob \"\"Jakey\"\"Astor VI\",1912,1992");
		System.out.println(table.rows());
		System.out.println("Expected:1");
		System.out.println(table.columns());
		System.out.println("Eepected:3");
		System.out.println(table.getEntry(row:0, col:0));
	}
}
