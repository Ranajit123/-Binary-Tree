/**
 * DiameterofTree2
 * The no of Nodes in the longest path between 2 leves is call Diamegter of a Tree.
 * 
 * Approch -> 2
 */
public class DiameterofTree2 {
  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data =  data;
      this.left=this.right=null;
    }
  }

  static class Info{
    int height, diameter;

    Info(int  height, int diameter) {
      this.height = height ;
      this.diameter = diameter;
    }
  }

  public static Info diameter(Node root){
    if(root == null) return new Info(0, 0);

    Info leftInfo = diameter(root.left); // Left Subtree diameter
    Info  rightInfo = diameter(root.right);// Right Subtree diameter

    int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height+ rightInfo.height+1);

    int height = Math.min(leftInfo.height, rightInfo.height)+1;

    return new Info(height, diameter);
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

    System.out.println(diameter(root).diameter); // Output: 5
  }
  
}
