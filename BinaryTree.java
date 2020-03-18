// Hussein's Binary Tree
// 26 March 2017
// Hussein Suleman

public class BinaryTree<dataType>
{
   BinaryTreeNode<dataType> root;
   
   public BinaryTree ()
   {
      root = null;
   }
   
   public int getHeight ()
   {
      return getHeight (root);
   }   
   public int getHeight ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return -1;
      else
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
   }
   
   public int getSize ()
   {
      return getSize (root);
   }   
   public int getSize ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return 0;
      else
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }
   
   public void visit ( BinaryTreeNode<dataType> node )
   {
      System.out.println (node.key + " " + node.areas);
      //System.out.println (node.areas);
   }
   
   public void preOrder ()
   {
      preOrder (root);
   }
   public void preOrder ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
      {
         visit (node);
         preOrder (node.getLeft ());
         preOrder (node.getRight ());
      }   
   }

   public void postOrder ()
   {
      postOrder (root);
   }
   public void postOrder ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
      {
         postOrder (node.getLeft ());
         postOrder (node.getRight ());
         visit (node);
      }   
   }

   public void inOrder ()
   {
      inOrder (root);
   }
   public void inOrder ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
      {
         inOrder (node.getLeft ());
         visit (node);
         inOrder (node.getRight ());
      }   
   }

   /*public void levelOrder () 
   {
      if (root == null)
         return;
      BTQueue<dataType> q = new BTQueue<dataType> ();
      q.enQueue (root);
      BinaryTreeNode<dataType> node;
      while ((node = q.getNext ()) != null)
      {
         visit (node);
         if (node.getLeft () != null)
            q.enQueue (node.getLeft ());
         if (node.getRight () != null)
            q.enQueue (node.getRight ());
      }
   }*/

   public String toString(BinaryTreeNode<dataType> node){

      return node.key + " " + node.areas;
   }

   // This is the PrintAreas method it takes three arguments
   // stage,date & startTime Then it search the tree until it finds the matching key
   // When the matching key is found it then prints out the  areas affected

   /*public BinaryTreeNode<dataType> printAreas(String stg, String dt, String st){

      String query = stg + "_" + dt + "_" + st;
      if ( root == null)
         return null;
      else
         return printAreas (query, root);
   }

   public BinaryTreeNode<dataType> printAreas (String query, BinaryTreeNode<dataType> node){

      if (query.compareTo (node.key) == 0)
         return visit(node);
      else if (query.compareTo (node.key) < 0)
         return (node.left == null) ? null : printAreas(query, node.left);
      else
         return (node.right == null) ? null : printAreas(query, node.right);
   }*/
}
