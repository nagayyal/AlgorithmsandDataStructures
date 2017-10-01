import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;


public class linkedListMethods {

	base head=null;
	public Integer[] generateRandomList()
	{	 
		 Integer[] rand=new Integer[100];
	for(int i=0;i<rand.length;i++)
	{
		rand[i]=i;
	}
	rand[0]=100;
	Collections.shuffle(Arrays.asList(rand));
	return rand;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	public void insertAtBeginning(int val)
	{
        base inAtBeginning=new base(val);
        
        if(isEmpty())
        {
        	head=inAtBeginning;
        }
        else
        {
        	inAtBeginning.next=head;
        	head=inAtBeginning;
        }
        
		
	}
	
	public void insertAtMiddle(int val,int pos)
	{
		base inAtMiddle=new base(val);
		base tmp=head;
		int count=0;
		while(tmp.next!=null)
		{
			if(count==pos)
			{
				
				base tmpStore=tmp.next;
				tmp.next=inAtMiddle;
//				in
				inAtMiddle.next=tmpStore;break;
//				tmp.next=inAtMiddle;	
			}
			tmp=tmp.next;
			count++;
		}
	}
	public void insertAtend(int val)
	{
		base inAtEnd=new base(val);
		base tmp=head;
	//while(tmp!=null)
		//{
		if(tmp.next==null)
		{
			tmp.next=inAtEnd;
			inAtEnd.next=null;
			
		}
		tmp=tmp.next;
		
		
	}

	public void printlinkedlist() {
		// TODO Auto-generated method stub
		base temp=head;
		while(temp!=null)
		{
			System.out.print(temp.info+" -->");
			temp=temp.next;
		}
	}
	
	public void printlinkedlist(base temp) {
		// TODO Auto-generated method stub
		temp=head;
		while(temp!=null)
		{
			System.out.print(temp.info+" -->");
			temp=temp.next;
		}
	}

	public void reverselinkedlist()
	{
		
		
		base nextnode,prevnode;
		prevnode=null;;
       base temp=head;
		while(temp!=null)
		{
			//first store the address of nextnode
			nextnode=temp.next;
			//assign the previous node value to nextnode like prev<--temp
			temp.next=prevnode;
			//move the previous to the temp(current) value
			prevnode=temp;
			//move the current node to nextnode
			temp=nextnode;
			
		}
		head=prevnode;
		//printlinkedlist();
		//return  prevnode.info;
		
		
	}
	public base sortlist(base node)
	{
		if(node==null || node.next==null)
			return node;
		base middleElement=middlenode(node);
		base secondlist=middleElement;
		
		//middleElement.next=null;
		//base tempnode=node;
		//base tempSecondlist=secondlist;
		//System.out.println("Middle:"+middleElement.info);
	    sortlist(node);
	    sortlist(secondlist);
	    return merge(node,secondlist);
		
	}
	
	  private base merge(base middleElement, base secondlist) {
		// TODO Auto-generated method stub
		  base temp=new base();
		  base finalList=temp;
//		/  System.out.print("First list:");
//		  printlinkedlist(middleElement);
//		  System.out.println();
//		  System.out.print("Second list:");
//		  printlinkedlist(secondlist);
//		  System.out.println();
		  while(middleElement!=null && secondlist!=null)
		  {
		  if(middleElement.info<secondlist.info)
		  {
			  temp.next=middleElement;
			  middleElement=middleElement.next;
		  }
		  else
		  {
			  temp.next=secondlist;
			  secondlist=secondlist.next;
			  
		  }
		  temp=temp.next; 
		  }
		 if(middleElement==null)
		 {
			 temp.next=secondlist;
			 
		 }
		 else if(secondlist==null)
		 {
			 temp.next=middleElement;
		 }
		//System.out.print("Merge:");  
	//	printlinkedlist(finalList); 
	//	System.out.println();
		return finalList.next;
	}

	public base extractFirst() 
	    {
	        return head;
	    }



	public base middlenode(base node) {
		base a=node;
		base b =node;
		base prev=null;
		if(node!=null)
		{
			while(b!=null && b.next!=null)
			{
				prev=a;
				a=a.next;
				b=b.next.next;
			}
		}
		prev.next=null;
		return a;
		
		
		
		// TODO Auto-generated method stub
		
	}
}

