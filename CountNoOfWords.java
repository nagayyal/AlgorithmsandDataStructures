
public class CountNoOfWords{
public static void main(String[] args)
{
String s="I will win";
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
count++;
}
System.out.print(count);
}
}