package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        data = val;
        left = null;
        right = null;
    }
}
public class Level_Order_Traversal {
   /// using Queue- Time->O(n)and Space->O(n);
   public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root){
       if (root == null)
           return new ArrayList<>();
       Queue<TreeNode> q= new LinkedList<>();
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       q.offer(root);
       int currlevel = 0;
       while ( !q.isEmpty()){
           int len = q.size();
           res.add(new ArrayList<>());
           for (int i =0; i< len; i++){
               TreeNode node = q.poll();
               res.get(currlevel).add(node.data);
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
           }
           currlevel++;
       }
       return res;
   }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(12);
        root.right = new TreeNode(13);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(14);
        root.right.right = new TreeNode(2);

        root.left.left.left = new TreeNode(17);
        root.left.left.right = new TreeNode(23);
        root.left.right.left = new TreeNode(27);
        root.left.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(8);
        root.right.right.right = new TreeNode(11);

        Level_Order_Traversal tree = new Level_Order_Traversal();
        ArrayList<ArrayList<Integer>> res = tree.levelOrder(root);
        for (ArrayList<Integer> level : res) {
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
