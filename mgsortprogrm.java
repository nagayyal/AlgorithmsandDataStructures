import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class mgsortprogrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		
		a=arraylistgeneration();
		System.out.print("Before Sorting\n");
		for(int i=0;i<100;i++)
		{
			
		// a[i] =arraylistgeneration();
		 System.out.print(a[i]+"\t");
		}
		
		System.out.println();
		dividethearray(a);
		System.out.println("after sorting:");
		for(int i=0;i<100;i++)
		{
		// a[i] =arraylistgeneration();
		 System.out.print(a[i]+"\t");
		}
		
		
	}
	

	private static void dividethearray(int arraytaken[]) {
		// TODO Auto-generated method stub
		if(arraytaken.length<2)
			return ;
		int lengthoftherandomarray=arraytaken.length;
		int midsize=lengthoftherandomarray/2;
		int leftarray[]=new int[midsize];
		int rightarray[]=new int[lengthoftherandomarray-midsize];
		for(int i=0;i<midsize;i++)
		{
			leftarray[i]=arraytaken[i];
			//System.out.print(leftarray[i]+"\t");
		}
		for(int i=midsize;i<lengthoftherandomarray;i++)
		{
			rightarray[i-midsize]=arraytaken[i];
		}
		dividethearray(leftarray);
		dividethearray(rightarray);
		mergethearrays(leftarray,rightarray,arraytaken);
		
				
		
	}


	private static void mergethearrays(int[] leftarray, int[] rightarray, int[] arraytaken) {
		// TODO Auto-generated method stub
		int lengthleftarray=leftarray.length;
		int lengthrightarray=rightarray.length;
		int i=0,j=0,k=0;
		while(i<lengthleftarray && j<lengthrightarray)
		{
			if(leftarray[i]<=rightarray[j])
			{
				arraytaken[k]=leftarray[i];
			//	k++;
				i++;
			}
			else
			{
				arraytaken[k]=rightarray[j];
				//k++;
				j++;
			}
			k++;
			
		}
		while(i<lengthleftarray)
		{
			arraytaken[k]=leftarray[i];
			k++;
			i++;
		}
		while(j<lengthrightarray)
		{
			arraytaken[k]=rightarray[j];
			k++;
			j++;
		}
	}


	private static int[] arrayforthesize(int i) {
		// TODO Auto-generated method stub
		int a[]=new int[i];
		return a;
	}


	private static int[] arraylistgeneration() {
		// TODO Auto-generated method stub
		
		double randNumber=Math.random();
		Set<Integer> value=new LinkedHashSet<Integer>();
		double d = randNumber*100;
		int randomInt=(int)d+1;
		Random r=new Random();
		while(value.size()<100)
		{
			//int n=Random.nextInt(20);
		value.add(r.nextInt(100)+1);
		}
		int i=0;
		int a[]=new int[value.size()];
		for(Integer val:value)
		{
			//System.out.println(val);
			a[i]=val;
			i++;
			
		}
		return a;
	

}
	public Integer[] generateRandomList()
	{	 
		 Integer[] rand=new Integer[100];
	for(int i=0;i<rand.length;i++)
	{
		rand[i]=i;
	}
	rand[0]=100;
	Collections.shuffle(Arrays.asList(rand));
	
	return rand;
	
	}
}
