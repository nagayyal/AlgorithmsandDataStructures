import java.util.Random;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();

		int  n = rand.nextInt(10+1+10) -10;
		if(n==0)
		{
			n=n+1;
		}
		
		System.out.println(n);
	}

}
