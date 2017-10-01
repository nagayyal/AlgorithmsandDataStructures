import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PullStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String FileName="C:\\Users\\sravy\\Desktop\\JavaPractice\\PracticeJava\\StudentData.csv";
			String StudentNames=getStudentNamesFromGrades(FileName);
			System.out.println("Highest gpa: "+StudentNames);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private static String getStudentNamesFromGrades(String fileName) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=null;
		br=new BufferedReader(new FileReader(new File(fileName)));
//		ArrayList<String> StudentNames=new ArrayList<>();
		br.readLine();
		String line="";
		float gpa=0.0f;
		String name="";
		while((line=br.readLine())!=null)
		{
			String[] splittedString=line.split(",");
			System.out.println(splittedString[8]);
			float studentgpa=Float.parseFloat(splittedString[8]);
			if(studentgpa>gpa)
			{
				gpa=studentgpa;
				name=splittedString[1];
			}
			
		}
		
		
		
		return name;
	}

}
