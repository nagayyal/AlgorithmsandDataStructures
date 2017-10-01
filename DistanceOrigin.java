import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class DistanceOrigin {
	static ArrayList<xandyclass> data = new ArrayList<>();
	static TreeMap<Double,xandyclass> tmap=new TreeMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		datacreation();
		System.out.println("x\ty");
//		System.out.println(data.get(0).getX()+"\t"+data.get(0).getY());
//        for(int i=0;i< 10;i++ )
//        {
//        	System.out.println(data.get(i).getX()+"\t"+data.get(i).getY());
//        }
        datasort();
        System.out.println("x\ty\tDistance");
        int count=0;
        for(Map.Entry<Double,xandyclass> entry:tmap.entrySet())
        {
            if(count>10)
            	break;
            System.out.println(entry.getValue().getX()+"\t"+entry.getValue().getY()+"\t"+entry.getKey());
             count++;
        }
        
	}

	private static void datasort() {
		// TODO Auto-generated method stub
		for(int i=0;i<data.size();i++)
		{
			tmap.put(data.get(i).distancecalculation(), data.get(i));
		}
		
	}

	private static void datacreation() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		xandyclass pt1=null;
		for (int i = 0; i < 200; i++) {
			int x = rand.nextInt(10 + 1 + 10) - 10;
			if (x == 0) {
				x = x + 1;
			}
			int y = rand.nextInt(10 + 1 + 10) - 10;
			if (y == 0) {
				y = y + 1;
			}
			pt1=new xandyclass();
			pt1.setX(x);
			pt1.setY(y);
			pt1.distancecalculation();
			data.add(pt1);
			
			
		}
	}
}
