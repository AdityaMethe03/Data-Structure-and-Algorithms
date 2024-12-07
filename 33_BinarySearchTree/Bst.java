import java.util.ArrayList;

public class Bst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data>val) {
            root.left = insert(root.left, val);
        }
        if(root.data<val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node createBST(int arr[], int st, int end) {
        if(st>end) return null;

        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

//---------------------size of bst in bt--------------------
    static class Info {
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;    
            this.min = min;
            this.max = max;    
        }
    }

    public static int maxBst=0;

    public static Info largestBst(Node root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }    
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
 
        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBst && rightInfo.isBst) {
            maxBst = Math.max(maxBst, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }
//---------------------------------------------------------------

//-------------------------Merge 2 BST-------------------------------

    public static void getInorderArr(Node root, ArrayList<Integer> arr) {
        if(root==null) return;

        getInorderArr(root.left, arr);
        arr.add(root.data);
        getInorderArr(root.right, arr);
    }

    public static Node createBalancedBst(ArrayList<Integer> arr,int st, int end) {
        if(st>end) return null;

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = createBalancedBst(arr, st, mid-1);
        root.right = createBalancedBst(arr, mid+1, end);

        return root;
    }

    public static Node merge2BST(Node root1, Node root2) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorderArr(root1, arr1);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorderArr(root2, arr2);

        
        ArrayList<Integer> arr3 = new ArrayList<>();
        int i=0, j=0;

        while(i<arr1.size() && j<arr2.size()) {
            if(arr1.get(i)<=arr2.get(j)) {
                arr3.add(arr1.get(i));
                i++;
            } else {
                arr3.add(arr2.get(j));
                j++;
            }
        }
        
        while(i<arr1.size()) {
            arr3.add(arr1.get(i));
            i++;
        }
    
        while(j<arr2.size()) {
            arr3.add(arr2.get(j));
            j++;
        }
        
        return createBalancedBst(arr3, 0, arr3.size()-1);
    }

    public static void preorder(Node root) {
        if(root==null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        int values[] = {3,5,6,8,10,11,12};

        Node root1 = createBST(values, 0, values.length-1);

        inorder(root1);
        System.out.println();

        Node root2 = new Node(50);
        root2.left = new Node(30);
        root2.left.left = new Node(5);
        root2.left.right = new Node(20);

        root2.right = new Node(60);
        root2.right.left = new Node(45);
        root2.right.right = new Node(75);
        root2.right.right.left = new Node(65);
        root2.right.right.right = new Node(85);

        Info info = largestBst(root2);
        System.out.println(maxBst);

        Node root3 = new Node(2);
        root3.left = new Node(1);
        root3.right = new Node(4);

        Node root4 = new Node(9);
        root4.left = new Node(3);
        root4.right = new Node(12);

        Node root5 = merge2BST(root3, root4);
        preorder(root5);
    }
}
