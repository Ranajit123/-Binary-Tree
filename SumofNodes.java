/**
 * SumofNodes
 */
public class SumofNodes {
  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data = data;
      this.left=this.right=null;
    }
  }
  public static int sumOfNodes(Node root){
    if(root == null) return 0;

    int ls = sumOfNodes(root.left); //Left Subtree Sum
    int rs = sumOfNodes(root.right); //Right subtree sum

    return ls + rs + root.data;
  }

  public static void main(String[] args) {
    /*
     *      1
     *     / \
     *    2    3 
     *   / \  / \
     *  4  5 6  7
     */

     Node root = new Node(1);
     root.left = new Node(2);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     root.right = new Node(3);
     root.right.left = new Node(6);
     root.right.right = new Node(7);

     System.out.println(sumOfNodes(root));//Expected: 28
  }
}
