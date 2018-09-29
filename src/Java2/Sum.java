package Java2;
public class Sum {
	public static void main(String[] args) {
            int sum=0;
            int j;
    		for(int i=1;i<=10000;i++) {
    			for(j=2;j<i/2+1;j++) {
    				if(i%j==0)
    				break;
    			}
    			if(i%j!=0)
    			{
    				sum=sum+i;
    			}
    	     }
    		System.out.println(sum);
	   }
}
