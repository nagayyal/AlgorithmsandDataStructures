import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Bnschmethods {
	BinSearchTreenode root;
	
	public void insertdata(int value)
	{
		BinSearchTreenode newTree=new BinSearchTreenode(value);
		
		if(root==null)
		{
			root=newTree;
		}
		else
		{
			BinSearchTreenode present=root;
			BinSearchTreenode parent=null;
			while(present!=null)
			{
				parent=present;
				if(parent.value>=value)
				{
					
					present=present.leftChild;
					
				}
				else
				{
					//parent.rightChild=newTree;
					present=present.rightChild;
					
				}
			}
			if(parent.value>value)
			{
				parent.leftChild=newTree;
			}
			else
			{
				parent.rightChild=newTree;
			}
			
		}
		
	}
	public void inordertraversal(BinSearchTreenode root1)
	{
		if(root1==null)
			return;
		else
			inordertraversal(root1.leftChild);	
		System.out.print(root1.value+" ");
		inordertraversal(root1.rightChild);
		
					
	}
	public void preordertraversal(BinSearchTreenode temp)
	{
		if(temp==null)
			return;
		else
			System.out.println(temp.value);
		preordertraversal(temp.leftChild);
		preordertraversal(temp.rightChild);
	}
	
	public void postordertraversal(BinSearchTreenode temp)
	{
		if(temp==null)
			return;
		else{
			postordertraversal(temp.leftChild);
		postordertraversal(temp.rightChild);
			System.out.print(temp.value+"  ");
		}
		
		
	}
	public void deletemethod(int val)
	{
		if(root==null)
			return;
		BinSearchTreenode parent;
		BinSearchTreenode child;
		parent=searchkey(val)[0];
		child=searchkey(val)[1];
		delete(parent, child);
				

	}
	private BinSearchTreenode[] searchkey(int val)
	{
		BinSearchTreenode parent=root;
		BinSearchTreenode child=root;
		while(child!=null && child.value!=val)
		{
		if(child.value<val)
		{
			parent=child;
			child=child.rightChild;
			
		}
		else
			if(child.value>val)
			{
				parent=child;
				child=child.leftChild;
				
			}
			
		}
		//return BinSearchTreenode(parent,child);
		return new BinSearchTreenode[]{parent,child};
         
	}
	private void hasnochildren(BinSearchTreenode parent, BinSearchTreenode child) {
		// TODO Auto-generated method stub
		
		if(parent.leftChild==child)
			parent.leftChild=null;
		else
			if(parent.rightChild==child)
				parent.rightChild=null;
			
		
	}
	private void hastwochildren(BinSearchTreenode child) {
		// TODO Auto-generated method stub
		//BinSearchTreenode temp=child;
		BinSearchTreenode minNodeinright=minimumElement(child.rightChild);
		System.out.println("This is the min value:" +minNodeinright.value);
		deletemethod(minNodeinright.value);
		child.value=minNodeinright.value;
		
	}
	private BinSearchTreenode minimumElement(BinSearchTreenode rightChild) {
		// TODO Auto-generated method stub
		if(rightChild.leftChild==null)
			return rightChild;
		else
		    return minimumElement(rightChild.leftChild);
		
	}
	private void hasonechildren(BinSearchTreenode parent,BinSearchTreenode child) {
		// TODO Auto-generated method stub
		BinSearchTreenode temp=null;
		if(child.leftChild!=null)
			temp=child.leftChild;
		else if(child.rightChild!=null)
			temp=child.rightChild;
		if(parent.leftChild==child)
			parent.leftChild=temp;
		else
			parent.rightChild=temp;
	}
	private void delete(BinSearchTreenode parent,BinSearchTreenode child)
	{
		if(root==null)
			return;
		
		if(child==null)
			return;
		if(child.leftChild==null && child.rightChild==null)
		{
			hasnochildren(parent,child);
		}
		else
		if(child.leftChild!=null && child.rightChild!=null)
				{
			       System.out.println("goint to method two");
					hastwochildren(child);
				}
		else
		if(child.leftChild!=null || child.rightChild!=null)
		{
			hasonechildren(parent,child);
		}
	}
	
	public boolean searchingKey(int val)
	{
		BinSearchTreenode parent=root;
		BinSearchTreenode child=root;
		if(child!=null )
		{
			if(child.value==val)
				return true;
		if(child.value<val)
		{
			parent=child;
			child=child.rightChild;
			
		}
		else
			if(child.value>val)
			{
				parent=child;
				child=child.leftChild;
				
			}
		
		}
		//return BinSearchTreenode(parent,child);
		
		return false;
         
	}
	public BinSearchTreenode max(BinSearchTreenode max)
	{
		// max=root;
		
		if(max.rightChild==null)
			return max;
		else
			return max(max.rightChild);
			

	}
	public BinSearchTreenode min(BinSearchTreenode min)
	{
		 
		
		if(min.leftChild==null)
			return min;
		else
			return max(min.leftChild);		

	}
	public boolean sameTree(BinSearchTreenode root1,BinSearchTreenode root2)
	{
		if(root1==null && root2==null)
			return true;
		else
			if(root1==null && root2==null)
			return false;
			else
				return ((root1.value==root2.value) && sameTree(root1.leftChild, root2.leftChild) && sameTree(root1.rightChild, root2.rightChild));
	}
	
	public void leveleordertraversal(BinSearchTreenode root )
	{
		if(root==null)
			return;
		Queue<BinSearchTreenode> myqueue=new LinkedList<BinSearchTreenode>();
		myqueue.add(root);
		myqueue.add(null);
		
		while(!myqueue.isEmpty())
		{
			
			 root= myqueue.poll();
			if(root!=null)
			{
				
				

			 System.out.print(root.value+"\t");
			
			if(root.leftChild!=null)
			{
				myqueue.add(root.leftChild);
				
				
			}
			
				if(root.rightChild!=null)
				{
					myqueue.add(root.rightChild);
					
				}
			}
			else
			{
				if(!myqueue.isEmpty())
				{
				System.out.println();
				myqueue.add(null);
				}
			}
				
				
		}
			
	}
	public void iterativepostorder(BinSearchTreenode root)
	{
		if(root==null)
			return;
		Stack<BinSearchTreenode> mystack=new Stack<BinSearchTreenode>();
		Stack<BinSearchTreenode> printstack=new Stack<BinSearchTreenode>();
		mystack.push(root);
		while(!mystack.isEmpty())
		{
			root=mystack.pop();
			printstack.push(root);
			if(root.leftChild!=null)
			{
				mystack.push(root.leftChild);
			}
			if(root.rightChild!=null)
			{
				mystack.push(root.rightChild);
			}
		
		}
		while(!printstack.isEmpty())
		{
			root=printstack.pop();
			System.out.print(root.value+"\t");
		}
	}
	
	
	public void iterativepreorder(BinSearchTreenode root)
	{
		if(root==null)
			return;
		Stack<BinSearchTreenode> mystack=new Stack<BinSearchTreenode>();
		Stack<BinSearchTreenode> printstack=new Stack<BinSearchTreenode>();
		mystack.push(root);
		while(!mystack.isEmpty())
		{
			root=mystack.pop();
			printstack.push(root);
			if(root.leftChild!=null)
			{
				mystack.push(root.leftChild);
			}
			if(root.rightChild!=null)
			{
				mystack.push(root.rightChild);
			}
		
		}
		while(!printstack.isEmpty())
		{
			root=printstack.pop();
			System.out.print(root.value+"\t");
		}
	}
    public int sizeofbintree(BinSearchTreenode root)
    {
    if(root==null)
    	return 0;
   int leftchild= sizeofbintree(root.leftChild);
    int rightchild=sizeofbintree(root.rightChild);
    return leftchild+rightchild+1;
    }
    
    public int heightofBinTree(BinSearchTreenode root)
    {
    	if(root==null)
    		return 0;
    	int leftheight=heightofBinTree(root.leftChild);
    	int rightchild=heightofBinTree(root.rightChild);
    	return 1+Math.max(leftheight, rightchild);
    	
    }
    
    public boolean roottoleaf(BinSearchTreenode root,int sum,ArrayList<Integer>pathlist)
    {
    	if(root==null)
    	{
    		return false;
    	}
    	if(root.leftChild==null && root.rightChild==null)
    	{
    		if(sum==root.value)
    		{
    			pathlist.add(root.value);
    			return true;
    			
    		}
    			
    		else
    			return false;
    	}
    	
    	
    		if(roottoleaf(root.rightChild, sum-root.value, pathlist)){
    			pathlist.add(root.value);
    		return true;
    	}
    		
    		if(roottoleaf(root.leftChild, sum-root.value, pathlist))
    		{
    			pathlist.add(root.value);
    		return true;
    	}
    		return false;
    }
    
    public void reverseorder(BinSearchTreenode root)
    {
    	if(root==null)
    		return;
    	Queue<BinSearchTreenode> binqueue=new LinkedList<BinSearchTreenode>();
    	Stack<BinSearchTreenode> printstack=new Stack<BinSearchTreenode>();
    	binqueue.add(root);
    	while(!binqueue.isEmpty())
    	{
    		BinSearchTreenode current=binqueue.poll();
    		if(current.leftChild!=null)
    		{
    			binqueue.add(current.leftChild);
    		}
    		if(current.rightChild!=null)
    		{
    			binqueue.add(current.rightChild);
    		}
    		printstack.push(current);
    		
    	}
    	while(!printstack.isEmpty())
    	{
    		BinSearchTreenode node=printstack.pop();
    		System.out.print(node.value+"\t");
    	}
    	
    }
    
   
    public void spiralorder(BinSearchTreenode root)
    {
    	if(root==null)
    		return;
    	Stack<BinSearchTreenode> s1=new Stack<BinSearchTreenode>();
    	Stack<BinSearchTreenode> s2=new Stack<BinSearchTreenode>();
    	s1.push(root);
    	while((!s1.isEmpty())|| (!s2.isEmpty()))
    	{
    		//BinSearchTreenode current;
    		
    		while(!s1.isEmpty())
    		{
    			root=s1.pop();
    			System.out.print(root.value+"\t");
    			if(root.leftChild!=null)
    			{
    				s2.push(root.leftChild);
    			}
    			if(root.rightChild!=null)
    			{
    				s2.push(root.rightChild);
    			}
    				
    		}
    		

    		while(!s2.isEmpty())
    		{
    			 root=s2.pop();
    			 System.out.print(root.value+"\t");
    			if(root.rightChild!=null)
    			{
    				s1.push(root.rightChild);
    			}
    			if(root.leftChild!=null)
    			{
    				s1.push(root.leftChild);
    			}
    			
    		}
    		
    	}
    }
    public int lowcomancestor(BinSearchTreenode root,int node1,int node2)
    {
    	if(root.value>Math.max(node1, node2))
    		return lowcomancestor(root.leftChild, node1, node2);
    	else
    		if(root.value<Math.min(node1, node2))
    		return	lowcomancestor(root.rightChild, node1, node2);
    			else
    				return root.value;
    }
    
    public BinSearchTreenode lowcomancestorbinarytree(BinSearchTreenode root,int node1,int node2)
    {
       if(root==null)
    	   return null;
       if(root.value==node1 || root.value==node2)
    	   return root;
      BinSearchTreenode leftancestor= lowcomancestorbinarytree(root.leftChild,node1,node2);
      BinSearchTreenode righancestor = lowcomancestorbinarytree(root.rightChild,node1,node2);
      
      
      if(leftancestor!=null && righancestor!=null)
      {
//    	  System.out.println("Left ancestor value is"+leftancestor.value);
//      System.out.println("Right ancestor value is"+righancestor.value);
      
    	  return root;
      }
      if(leftancestor==null)
    	  return righancestor;
      else
      return leftancestor;
    }
    
    public void postordertraversalstack(BinSearchTreenode root)
    {
    	{
    		BinSearchTreenode current = root;
            Deque<BinSearchTreenode> stack = new LinkedList<>();
            while(current != null || !stack.isEmpty()){
                if(current != null){
                    stack.addFirst(current);
                    current = current.leftChild;
                }else{
                	BinSearchTreenode temp = stack.getFirst().rightChild;
                    if (temp == null) {
                        temp = stack.poll();
                        System.out.print(temp.value + "\t ");
                        while (!stack.isEmpty() && temp == stack.peek().rightChild) {
                            temp = stack.poll();
                            System.out.print(temp.value + "\t ");
                        }
                    } else {
                        current = temp;
                    }
                }
            }
        }
    	
    }
    
}

