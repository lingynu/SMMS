package Java2;

public class BandBooster {
       private String name;
       private int boxesSold;
       BandBooster(String newName){
    	    name=newName;
    	    boxesSold=0;
       }
       public void getName() {
    	   this.name=name;
       }
       public void updateSales(int add) {
    	   boxesSold=add+boxesSold;
       }
        public String toString() {
    	   return name+":"+boxesSold+" boxes";
       }
public static void main(String[] args) {
	   BandBooster bst=new BandBooster("Joe");
	   bst.toString();
	   bst.getName();
	   bst.updateSales(16);
	   System.out.println(bst);
}
}
