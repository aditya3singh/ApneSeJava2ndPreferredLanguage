import java.util.*;

public class Main {
  
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
    public static Node buildTree(int node[]){
      idx++;
      if(node[idx] == -1) return null;
      Node newNode = new Node(node[idx]);
      newNode.left = buildTree(node);
      newNode.right = buildTree(node);
      
      return newNode;
    }
  
    public static void preOrder(Node root){
      if(root == null) {
        System.out.println("-1");
        return;
      }
      System.out.println(root.data);
      preOrder(root.left);
      preOrder(root.right);
    }
  }
  
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        tree.preOrder(root);
  }
}
