/**
 * PostOrderTreeTraversal
 * 
 * Rule:
 *  1. Print Left Subtree
 *  2. Print Right Subtree
 *  3. Print Root
 * 
 */
public class PostOrderTreeTraversal {
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree{
    static int idx = -1;
    public static Node buildTree(int nodes[]){
      idx ++;
      if(nodes[idx] == -1) return null;

      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }
  }

  public static void postOrdertraversal(Node root){
    if(root == null) return;

    postOrdertraversal(root.left);
    postOrdertraversal(root.right);
    System.out.print(root.data + " ");
  }

  public static void main(String[] args) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);

    postOrdertraversal(root);
  }
  
}
