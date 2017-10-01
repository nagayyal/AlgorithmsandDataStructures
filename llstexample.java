import java.util.Scanner;

public class llstexample {
	 static Scanner s=new Scanner(System.in);
	 static double s1=s.nextDouble();
	 static double i1=s.nextDouble();
	 static double e1=s.nextDouble();
	 static double s2=s.nextDouble();
	 static double i2=s.nextDouble();
	 static double e2=s.nextDouble();
	 static double s3=s.nextDouble();
	 static double i3=s.nextDouble();
	 static double e3=s.nextDouble();
	
	static llstexample ll=new llstexample();

	 
	public static void main(String[]args)
	{
		incomedetails a=new incomedetails(i1,e1,s1);
		incomedetails b=new incomedetails(i2,e2,s2);
		incomedetails c=new incomedetails(i3,e3,s3);
		ll.cretingnodes( a, b, c);
	}
	public void cretingnodes(incomedetails a,incomedetails b,incomedetails c)
	{
		
		
		
		//Linking of nodes
		a.next=b;
		b.next=c;
		 a.next.printall();
	}
	public boolean isEmpty(incomedetails a)
	{
		return a.next==null;  
		
	}
	
	public void addafter
	
	

}
