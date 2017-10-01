
public class llMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedListMethods llm=new linkedListMethods();
		Integer[] randomList=llm.generateRandomList();
	//	base head=null;
//		for(int i=0;i<randomList.length;i++)
//		{
//			System.out.println(randomList[i]);
//		}
		int count=10;
		for(int i=0;i<10;i++)
		{
			llm.insertAtBeginning(i);
			count--;
		}
		
//		for(int i=4;i<7;i++)
//		{
//			llm.insertAtMiddle(randomList[i], (int)Math.ceil(i/2));
//		}
//		for(int i=7;i<10;i++)
//		{
//			llm.insertAtend(randomList[i]);
//			
//		}
	  System.out.println("Before sorting");
	  llm.printlinkedlist();
	 /* System.out.println("\nAfter reversing");
		llm.reverselinkedlist();
		llm.printlinkedlist();*/
	// int a= llm.middlenode(llm.extractFirst()).info;
	 //System.out.println("\n middlenode is"+a);
	  System.out.println("\nAftersorting");
	base head1= llm.sortlist(llm.extractFirst());
	  llm.printlinkedlist(head1);
	  
	}

}
