import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

//Top two grade female students in CS
public class toptwogradefemale {
 public static void main(String[] args) throws IOException
 {
	 String filename="C:\\Users\\sravy\\Desktop\\JavaPractice\\PracticeJava\\StudentData.csv";
		TreeMap<Float,String> Studentnameswithmarks=getfemalestudentnameswithmarks(filename);
		ArrayList<Map.Entry<Float, String>> tmtoArrayList=new ArrayList<>();
		for(Map.Entry<Float, String> entry:Studentnameswithmarks.entrySet())
		{
			tmtoArrayList.add(entry);
		}
		for(int i=tmtoArrayList.size()-1;i>=tmtoArrayList.size()-2;i--)
		{
			Map.Entry<Float, String> eachEntry=tmtoArrayList.get(i);
 			System.out.println("Female Student Name is "+eachEntry.getValue()+" Their corresponding marks is "+eachEntry.getKey());
		}
 }

private static TreeMap<Float, String> getfemalestudentnameswithmarks(String filename) throws IOException {
	// TODO Auto-generated method stub
	BufferedReader br=null;
	br=new BufferedReader(new FileReader(new File(filename)));
	br.readLine();
	String line="";
	float gpa=0.0f;
	TreeMap<Float,String> studnameswithmarks = new TreeMap<>();
	while((line=br.readLine())!=null)
	{
		String[] splittedString=line.split(",");
		gpa=Float.parseFloat(splittedString[8]);
		if(splittedString[2].equals("F") && splittedString[3].equals("CIS"))
		{
		   studnameswithmarks.put(gpa, splittedString[1]);	
		}
				
	}
	return studnameswithmarks;
}
}
