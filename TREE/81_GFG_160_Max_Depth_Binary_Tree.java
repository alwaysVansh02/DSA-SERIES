package Tree;


import java.util.LinkedList;
import java.util.Queue;
    ///  Using Level Order Traversal

class  Node{
    int data;
    Node left,right;
    Node(int val){ 
        data= val;
        left = null;
        right = null;
    }
}
public class Max_Depth_Of_BinaryTree {
   static int height(Node root){
        if (root == null)
            return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int depth = 0;
        while ( !q.isEmpty()){
            int lvlSize = q.size();
            for (int i =0; i<lvlSize;i++){
                Node curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            depth++;
        }
        return depth-1;
    }
    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);
        System.out.println(height(root));
    }
}
