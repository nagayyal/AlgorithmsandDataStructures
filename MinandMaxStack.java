import java.util.LinkedList;
import java.util.List;

public class MinandMaxStack {

	List<Node> stacklist ;
	public void push(int data)
	{
		if(stacklist==null)
		{
			stacklist=new LinkedList<Node>();
		}
		Node node=new Node(data);
		if(stacklist.size()>0)
		{
			node.min=Math.min(data, stacklist.get(stacklist.size()-1).min);
			node.max=Math.max(data, stacklist.get(stacklist.size()-1).max);
		}
		else
		{
			node.min=data;
			node.max=data;
		}
		stacklist.add(node);
		
		
		
	}
	public Node pop()
	{
		Node popedStackItem=null;
		if(!stacklist.isEmpty())
		{
			popedStackItem=this.stacklist.get(stacklist.size()-1);
			stacklist.remove(stacklist.size()-1);
		}
		//printStack();
		return popedStackItem;
		
	}
	
	public int getMin()
	{
		int min=0;
		if(!stacklist.isEmpty())
		{
			min=this.stacklist.get(stacklist.size()-1).min;
		}
		return min;
	}
	public int getMax()
	{
		int max=0;
		if(!stacklist.isEmpty())
		{
			max=this.stacklist.get(stacklist.size()-1).min;
		}
		return max;
	}
	public void printStack()
	{
		if(!stacklist.isEmpty())
		{
			int i=0;
			for(Node node:stacklist)
			{
				System.out.print("The value is:"+node.data+"-->");
				if(i==stacklist.size()-1)
				{
					System.out.print("Min is:"+node.min+"|");
					System.out.print("Max is:"+node.max+"|");
				}
				i++;
			}
			System.out.println();
			
		}
	}


}
