import java.util.*;
import java.util.LinkedList;

public class BinaryTreeEx {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ht = Math.max(lh, rh) + 1;
        return ht;
    }

    public static int diameter1(Node root) {
        if(root == null) {
            return 0;
        }

        int ld = diameter1(root.left);
        int lh = height(root.left);
        int rd = diameter1(root.right);
        int rh = height(root.right);

        int selfDiam = lh + rh + 1;

        return Math.max(selfDiam, Math.max(ld, rd));
    }

    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if(node==null && subRoot==null) {
            return true;
        } else if(node == null || subRoot==null || node.data!=subRoot.data) {
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if(root==null) {
            return false;
        }
        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static class TopViewInfo{
        Node node;
        int hd;
        public TopViewInfo(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    
    public static void topView(Node root) {
        Queue<TopViewInfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min=0, max=0;
        q.add(new TopViewInfo(root, 0));
        q.add(null);

        while(!q.isEmpty()) {

            TopViewInfo curr = q.remove();

            if(curr==null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
    
                if(curr.node.left != null) {
                    q.add(new TopViewInfo(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null) {
                    q.add(new TopViewInfo(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

        }
        System.out.println(min+" "+ max);

        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();

    }

//----------------------BoundaryTraversal-------------------------------

    public static boolean isLeaf(Node root) {
        if(root == null) return false;

        if(root.left == null && root.right == null) return true;

        return false;
    }
    public static void printLeaf(Node root) {
        if(root == null) return;

        if(isLeaf(root)) System.out.print(root.data + " ");

        printLeaf(root.left);
        printLeaf(root.right);
    }

    public static void leftBoundary(Node root) {
        if(root == null) return;

        if(isLeaf(root)) return;

        System.out.print(root.data + " ");
        leftBoundary(root.left);
        if(root.left==null) leftBoundary(root.right);
    }

    public static void rightBoundary(Node root) {
        if(root == null) return;

        if(isLeaf(root)) return;

        rightBoundary(root.right);
        if(root.right==null) rightBoundary(root.left);
        System.out.print(root.data + " ");

    }

    public static void boundaryTraversal(Node root) {
        if(root == null) return;

        leftBoundary(root);
        printLeaf(root);
        rightBoundary(root);
    }

//-------------------------------MAIN------------------------------------
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.right = new Node(8);
        root.right.right.left = new Node(9);


        // System.out.println("Diameter of tree is: " + diameter1(root));

        // System.out.println("Diameter of tree is: "+ diameter(root).diam);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println("--->" + isSubtree(root, subRoot));

        // topView(root);

        boundaryTraversal(root);


    }
}

