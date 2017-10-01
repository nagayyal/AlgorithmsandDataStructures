import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Female students who have full-time
public class femaleft {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			String filename="C:\\Users\\sravy\\Desktop\\JavaPractice\\PracticeJava\\StudentData.csv";
			ArrayList<String> studentname=getfemalenameshaveft(filename);
			for(int i=0;i<studentname.size();i++)
			{
			System.out.println("Female Studentnames who have full time: "+studentname.get(i));
			}
			
		}

		private static ArrayList<String> getfemalenameshaveft(String filename) throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br=null;
			br=new BufferedReader(new FileReader(new File(filename)));
			br.readLine();
			ArrayList<String> names=new ArrayList<String>();
			String line="";
			while((line=br.readLine())!=null)
			{
				String[] splittedString=line.split(",");
				//System.out.println(splittedString[6]);
				if(splittedString[6].equals("Fulltime") && splittedString[2].equals("F"))
				{
	               names.add(splittedString[1]);
				}
			}
			return names;
		}

	}


