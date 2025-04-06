public class zoho_Q16 {
        static class Node{
            int data;
            Node left;
            Node right;
            public Node(int val){
                this.data=val;
                this.left=null;
                this.right=null;
            }
        }
        public static boolean check(Node r){
            if(r==null){
                return true;
            }
            if(r.left!=null && r.data<r.left.data){
                return false;
            }
            if(r.right!=null && r.data>r.right.data){
                return false;
            }
            return check(r.left) && check(r.right);
        }
        public static void main(String[] args) {
            //   Node root=new Node(2);
            //   root.left=new Node(1);
            //   root.right=new Node(3);
            Node root = new Node(5);
            root.left = new Node(1);
            root.right = new Node(4);
            root.right.left = new Node(3);
            root.right.right = new Node(6);
            System.out.print(check(root));

        }
}
