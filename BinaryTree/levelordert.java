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
    
    public static void levelOT(Node root){
      if(root == null){
        // System.out.println("-1");
        return;
      }
      
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      
      while(!q.isEmpty()){ //abb ek loop chalenge jabtak humare node khali nhi ho jaati 
        Node currNode = q.remove(); //Queue se ek ek kar ke current node ko baher nikalenge 
        if(currNode == null){//agar current node null hai matbal yaha pe next line print hona chahiye 
          System.out.println();
          if(q.isEmpty()){ // agra Queue khali hai puri matbal aur koi element hai hi nahi process karne ke liye matbal baher ho break kar jaao
           break;
         }else{
           q.add(null);//agra Queue me element bache huye hai toh waapis se add kar dena hai element ko, taki iss line pe toh element print ho gaya hai agli line pe bhi ho jaaye 
          }
        }else{
          System.out.print(currNode.data+" ");//agra humare Paas null nahi nikla tha toh currNode ka data humne print kara diya 
          if(currNode.left != null){
            q.add(currNode.left); //uske left child ko check kar liye agar not null hai toh wapis se add kar diye
          }
          if(currNode.right != null){
            q.add(currNode.right);//right ke sath bhi
          }
        }
      }
    }
  
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree = new BinaryTree();
      Node root = tree.buildTree(node);
      tree.levelOT(root);
  }
}
