
public class incomedetails {
	public double incomes;
	double expenditures;
	double saving;
	public incomedetails next;
	
	public incomedetails(double income,double expenditure,double savings)
	{
		incomes=income;
		expenditures=expenditure;
		saving=savings;
	}
	public incomedetails() {
		// TODO Auto-generated constructor stub
	}
	public void printall()
	{
		System.out.println("Elements are  "+incomes+"\t"+expenditures+"\t"+saving);
	}
	

}
