import java.lang.Comparable;
import java.util.function.Consumer;


/**
   This is a smart Node that utilizes generics.
   Note how we ensured that the type T will always be comparable...

 */
public class BSTNode<T extends Comparable<T>>
{

   private T val;
   private BSTNode<T> left;
   private BSTNode<T> right;



   public BSTNode(T val)
   {
      this(val,null,null);
   }
    

   public BSTNode(T val, BSTNode<T> l,BSTNode<T> r)
   {
	   this.val = val;
	   left = l;
	   right = r;
   }



   /*
     Uses recursion to insert the target into the tree
    */
   public void insert(T target)
   { 
	   if(target.compareTo(val) < 0) {
		   if(left != null) {
			   left.insert(target);
		   }else{
			   left = new BSTNode<T>(target, null, null);
		   }
		   
	   }else {
		   if(right != null) {
			   right.insert(target);
		   }else{
			   right = new BSTNode<T>(target, null, null);
		   }
	   }
   }

   /*
     Uses recursion to retrieved the value target from the tree.  
     Returns null if it can't find the value.
    */
   public T retrieve(T target)
   {
	   if(target.compareTo(val) < 0) {
		   if(left != null) {
			   return left.retrieve(target);
		   }else{
			   return null;
		   }
		   
	   }else if(target.compareTo(val) > 0){
		   if(right != null) {
			   return right.retrieve(target);
		   }else{
			   return null;
		   }
	   }else {
		   return target;
	   }
   }


    /**
       If it is present, what level is the node?
       If it is not present, what level would it be placed.
     */
   public int retrieveDepth(T target)
   {
	   return this.retrieveDepth(target, 0);
   }
   
   private int retrieveDepth(T target, int count) {
	   if(target.compareTo(val) < 0) {
		   if(left != null) {
			   return left.retrieveDepth(target, count + 1);
		   }else{
			   return count + 1;
		   }
		   
	   }else if(target.compareTo(val) > 0){
		   if(right != null) {
			   return right.retrieveDepth(target, count + 1);
		   }else{
			   return count + 1;
		   }
	   }else {
		   return count;
	   }
   }

   /**
      Uses recursion to return the largest value in the tree
    */
   public T getLargest()
   {
	   if(right != null) {
		   return right.getLargest();
	   }else {
		   return val;
	   }
   }


   /**
      Uses recursion to do an inorder traversals.
      consume is part of a strategy pattern, to determine what the
      "Visit" should be.

    */
   public void inOrderTraversal(Consumer<T> consume)
   {
	   
	   if(left != null) {
		   left.inOrderTraversal(consume);
	   }
	   
	   consume.accept(val);
	   
	   if(right != null) {
		   right.inOrderTraversal(consume);
	   }
   }
   
   public void preOrderTraversal(Consumer<T> consume) {
	   consume.accept(val);
	   
	   if(left != null) {
		   left.preOrderTraversal(consume);
	   }
	   
	   if(right != null) {
		   right.preOrderTraversal(consume);
	   }
   }


   /**
      returns true if this tree is equal to that tree.
      false otherwise.

      Note: While I must always be non-null.  
            Nothing prevents "that" from being null.
	    
	    This one is long!
    */
   public boolean myEquals(BSTNode<T> that)
   {
	return false;
   

   }

}
