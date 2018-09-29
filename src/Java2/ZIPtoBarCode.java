package Java2;

public class ZIPtoBarCode {
	if(zipcode.length<5) 
		return "invalid";
	int sum=0;
	for(int i=0;i<5;i++)
		sum+=zipcode[i];
	int checkDight=0;
	while((checkDight+sum)%10!=0)
		checkDight++;
	String barcode="1";
	for(int i=0;i<5;i++)
	{
		barcode+=encode(zipcode[i]);
	}
	barcode+=encode(checkDigit);
	barcode+="1";
	public static int[] converBarcode(Stringbarcode) {
		int[] code=new int[] {0,0,0,0,0};
		if(barcode.length()<32)
			return code;
		barcode[0]=decode(barcode.substring(1,5));
		barcode[1]=decode(barcode.substring(6,10));
		barcode[2]=decode(barcode.substring(11,15));
		barcode[3]=decode(barcode.substring(16,20));
		barcode[4]=decode(barcode.substring(21,5));
	}
}
