import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

//Program to print studentid who have top 5 marks

public class topfivestudentid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String filename="C:\\Users\\sravy\\Desktop\\JavaPractice\\PracticeJava\\StudentData.csv";
			TreeMap<Integer, StudentIDNames> studentId=getstudentid(filename);
			//System.out.println("top 5 student marks id's"+studentId);
			int count =0;
			for(Entry<Integer, StudentIDNames> entry:studentId.entrySet())
			{
				if(count>4)
					break;
				int marks=entry.getKey();
				String v1=entry.getValue().getName();
				int studId=entry.getValue().getStudentID();
				String major=entry.getValue().getMajor();
				System.out.println("Marks is="+marks+" Studentname is"+v1);
				count++;
				
			}
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static TreeMap<Integer, StudentIDNames> getstudentid(String filename) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		br=new BufferedReader(new FileReader(new File(filename)));
		br.readLine();
		String line="";
		float gpa=0.0f;
		int marks=0;
		StudentIDNames studob=null;
		TreeMap<Integer, StudentIDNames> top5ids=new TreeMap<>(Collections.reverseOrder());
		while((line=br.readLine())!=null)
		{
			String[] splittedString=line.split(",");
			marks=Integer.parseInt(splittedString[7]);
			studob=new StudentIDNames();
			studob.setStudentID(Integer.parseInt(splittedString[0]));
			studob.setMajor(splittedString[3]);
			studob.setName(splittedString[1]);
			
//			gpa=Float.parseFloat(splittedString[8]);
			top5ids.put(marks, studob);
			
		}
		
		return top5ids;
		
	}

}
