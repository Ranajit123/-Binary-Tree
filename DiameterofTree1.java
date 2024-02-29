/**
 * DiameterofTree
 * The no of Nodes in the longest path between 2 leves is call Diamegter of a Tree.
 * 
 * Approch -> 1
 */
public class DiameterofTree1 {

  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data = data;
      this.left = this.right = null;
    }
  }

  public static int height(Node root){
    if(root == null) return 0;

    int lh = height(root.left); // Height of Left Subtree
    int rh = height(root.right);// Height of Right Subtree

    return Math.max(lh, rh)+1;
  }

  public static int Diameter(Node root){
    if(root == null) return 0;

    int ld = Diameter(root.left); // Diameter of Left Subtree
    int rd = Diameter(root.right); // Diameter of Right Subtree
    
    int lh = height(root.left); // Height of Left Subtree
    int rh = height(root.right); // Height of Right Subtree

    int rootheight = lh + rh +1;

    return Math.max(Math.max(ld, rd), rootheight);
  }

  public static void main(String[] args) {
    /*
     *      1
     *     / \
     *    2    3 
     *   / \  / \
     *  4  5 6   7
     */
    /* Constructing the tree given in the above figure*/

    Node root = new Node(1);
    root.left = new Node(2);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right = new Node(3);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println(Diameter(root)); // Output: 5
  }
}
