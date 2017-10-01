import java.util.ArrayList;

public class Bnmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bnschmethods bnm=new Bnschmethods();
		bnm.insertdata(86);
		
		bnm.insertdata(105);
		bnm.insertdata(75);
		bnm.insertdata(65);
		bnm.insertdata(79);
		bnm.insertdata(95);
		bnm.insertdata(135);
		bnm.insertdata(68);
		bnm.insertdata(76);
		bnm.insertdata(93);
		bnm.insertdata(121);
		bnm.insertdata(151);
		
		
	//	bnm.inordertraversal(bnm.root);
		
//		Bnschmethods bnm1=new Bnschmethods();
//		bnm1.insertdata(23);
//		bnm1.insertdata(45);
//		bnm1.insertdata(78);
//		bnm1.insertdata(9);
//		bnm1.insertdata(2);
//		bnm1.inordertraversal(bnm1.root);
	//	System.out.println("After delete for 93");
		//bnm.preordertraversal(bnm.root);
		//bnm.delete(93);
		//bnm.inordertraversal(bnm.root);
		//System.out.println("After delete for 15 ");
		//bnm.deletemethod(23);
		//bnm.inordertraversal(bnm.root);
//		System.out.println(bnm.searchingKey(23));
//		System.out.println("Max value is"+bnm.max(bnm.root).value);
//		System.out.println("Min value is"+bnm.min(bnm.root).value);
//		System.out.println(bnm.sameTree(bnm.root, bnm1.root));
		System.out.println("Levelorder");
        bnm.leveleordertraversal(bnm.root);
//        System.out.print("Postorder with recursion:");
//        bnm.postordertraversal(bnm.root);
        System.out.print("\nPostorder with iteration:");
       bnm.iterativepostorder(bnm.root);
//        
//        System.out.print("Preorder with recursion:");
//        bnm.preordertraversal(bnm.root);
//        System.out.print("\nPostorder with iteration:");
//        bnm.iterativepreorder(bnm.root);
//        System.out.println("\nsize is:"+bnm.sizeofbintree(bnm.root));
//        System.out.println("\nHeight is:"+bnm.heightofBinTree(bnm.root));
//        
//        ArrayList<Integer> pathlist=new ArrayList<Integer>();
//       System.out.println("whther the sum exists"+bnm.roottoleaf(bnm.root, 477, pathlist) );
//       for(int i=pathlist.size()-1;i>=0;i--)
//       {
//    	   System.out.println(pathlist.get(i));
//       }
//        System.out.println("\n Reverse order is");
//        bnm.reverseorder(bnm.root);
//        System.out.println("\n Spiral order is");
//        bnm.spiralorder(bnm.root);
//        
//        System.out.print("\nLowest comon ancestor is:");
//       System.out.print( bnm.lowcomancestorbinarytree(bnm.root, 135, 65).value);
       
       System.out.print("\nPostorder with iteration one stack:");
       bnm.postordertraversalstack(bnm.root);
//       
	}

}
