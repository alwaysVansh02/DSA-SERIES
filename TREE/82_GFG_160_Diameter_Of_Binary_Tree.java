// Given the root of a binary tree, find the diameter of the binary tree. The diameter of a binary tree is defined as the number of edges
// on the longest path between any two nodes. Note that this path may or may not pass through the root of the tree.
package Tree;

class Tree{
    int data;
    Tree left,right;
    Tree(int x){
        data = x;
        left = null;
        right = null;
    }
}
public class Diameter_Of_Binary_Tree {
  ///  Aproach 2 ->Using TRaversal In time->O(n) and space->O(h)
    static int maxDiameter =0;
    static int diameterRecur(Tree root){
        if (root == null)
            return 0;
        int lheight = diameterRecur(root.left);
        int rHeight = diameterRecur(root.right);

        if (lheight + rHeight > maxDiameter)
            maxDiameter = lheight + rHeight;
        return 1 + Math.max(lheight, rHeight);
    }
    static int diameter(Tree root){
        maxDiameter =0;
        diameterRecur(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.right = new Tree(2);
        root.right.left = new Tree(3);
        root.right.right = new Tree(4);
        root.right.left.left = new Tree(5);
        root.right.right.right = new Tree(6);
        System.out.println(diameter(root));
    }
}
