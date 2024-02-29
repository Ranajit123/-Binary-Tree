/**
 * CountNodesofTree
 */
public class CountNodesofTree {
  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data = data;
      this.left = this.right = null;
    }
  }

  public static int countNodes(Node root){
    if(root == null) return 0;

    int ln = countNodes(root.left); // Left Subtree nodes
    int rn = countNodes(root.right); // Right Subtree nodes

    return ln+ rn + 1; /* Root node is also counted as one */
  }
  public static void main(String[] args) {
    /*
     *      1
     *     / \
     *    2    3 
     *   / \  / \
     *  4  5 6  7
     */

    Node root = new Node(0);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println(countNodes(root)); // Output: 7
  }
}
