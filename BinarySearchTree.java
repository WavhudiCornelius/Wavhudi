// Hussein's Binary Search Tree
// 27 March 2017
// Hussein Suleman

public class BinarySearchTree<dataType extends Comparable <? super dataType>> extends BinaryTree<dataType>
{
   // this counter is used to store the number of comparism the binary tree has made 
   public int count = 0;
   public void insert ( dataType k, dataType a )
   {
      if (root == null)
         root = new BinaryTreeNode<dataType> (k, a, null, null);
      else
         insert (k, a, root);
   }
   public void insert ( dataType k, dataType a, BinaryTreeNode<dataType> node )
   {
      if (k.compareTo (node.key) <= 0) // If we have trouble accessing node data check this line again
      {                                 // we don't know if node data returns the key or the data as a whole
         if (node.left == null)
            node.left = new BinaryTreeNode<dataType> (k, a, null, null);
         else
            insert (k, a, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode<dataType> (k, a, null, null);
         else
            insert (k, a, node.right);
      }
   }
   
   public dataType find ( dataType k )
   {
      if (root == null)
         return null;
      else
         return find (k, root);
   }
   public dataType find ( dataType k, BinaryTreeNode<dataType> node )
   {
      if (k.compareTo (node.key) == 0){
         count++; 
         return node.areas;
      }else if (k.compareTo (node.key) < 0){
         count++;
         return (node.left == null) ? null : find (k, node.left);
      }
      else{
         count++;
         return (node.right == null) ? null : find (k, node.right);
      }
   }
   
   public void delete ( dataType k, dataType a )
   {
      root = delete (k, a, root);
   }   
   public BinaryTreeNode<dataType> delete ( dataType k, dataType a, BinaryTreeNode<dataType> node )
   {
      if (node == null) return null;
      if (k.compareTo (node.key) < 0)
         node.left = delete (k, a, node.left);
      else if (k.compareTo (node.key) > 0)
         node.right = delete (k, a, node.right);
      else if (node.left != null && node.right != null )
      {
         node.key = findMin (node.right).key;
         node.right = removeMin (node.right);
      }
      else
         if (node.left != null)
            node = node.left;
         else
            node = node.right;
      return node;
   }
   
   public BinaryTreeNode<dataType> findMin ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
         while (node.left != null)
            node = node.left;
      return node;
   }

   public BinaryTreeNode<dataType> removeMin ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return null;
      else if (node.left != null)
      {
         node.left = removeMin (node.left);
         return node;
      }
      else
         return node.right;
   }

   public int getCount(){

      return count;
   }

   // this is for creativity if its not working remove it
   /*public void printAreas(dataType k){

      dataType results = find(dataType k);

   }*/
}
