import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

public class top3srudents {
	public static void main(String args[]) throws IOException
	{
		String FileName="C:\\Users\\sravy\\Desktop\\JavaPractice\\PracticeJava\\StudentData.csv";
		TreeMap<Float,String> result=getTopThreeStudentNames(FileName);
		//System.out.println(result);
		/*int count=0;
		Map <Float,String> startValues;  
		Iterator<Float> iterator = result.descendingKeySet().iterator();
		for (int i1 = 0; iterator.hasNext() && i1 < 5; i1++) {
		   
		}*/
	//	TreeMap<Float,String> result1= new TreeMap<Float,String>();
		
		ArrayList<Map.Entry<Float, String>> putTreeMapintoArraList=new ArrayList<>();
		for(Map.Entry<Float, String> entry:result.entrySet())
		{
//			Float mapKey=entry.getKey();
//			String mapVal=entry.getValue();
			putTreeMapintoArraList.add(entry);
			
		}
		for(int i=putTreeMapintoArraList.size()-1;i>putTreeMapintoArraList.size()-4;i--)
		{
			Map.Entry<Float, String> eachentry=putTreeMapintoArraList.get(i);
			System.out.println("Studnet name:"+eachentry.getValue()+"Grade is:"+eachentry.getKey());
		}
//		int count=0;
//		for(Map.Entry<Float, String> entry:result.entrySet())
//		{
//			if(count>2)
//				break;
//			Float resulKey=entry.getKey();
//			String resultValue=entry.getValue();
//			//result1.put(resulKey,resultValue);
//			System.out.println(resulKey+":"+resultValue);
//			count++;
//		}
		
	}

	private static TreeMap<Float,String> getTopThreeStudentNames(String fileName) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		TreeMap<Float,String> studentLookupMarks=null;
		try {
			br=new BufferedReader(new FileReader(new File(fileName)));
			br.readLine();
			ArrayList<String> studentNames=new ArrayList();
			ArrayList<Float> gpa=new ArrayList<>();
			studentLookupMarks=new TreeMap<>();
			String line="";
			while((line=br.readLine())!=null)
			{
				String[] splittedString=line.split(",");
				float variable1=Float.parseFloat(splittedString[8]);
				gpa.add(variable1);
				Collections.sort(gpa);
				studentLookupMarks.put(variable1, splittedString[1]);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentLookupMarks;
	}

}
