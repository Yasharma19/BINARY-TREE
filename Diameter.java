public class Diameter{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }

    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);
            return newNode;
        }
    }
     public static int H(Node root){
        if(root==null){
            return 0;
        }
        int a=H(root.left);
        int b=H(root.right);
        return Math.max(a,b)+1;
    }

    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int D1=Diameter(root.left);
        int D2=Diameter(root.right);
        int D3=H(root.left)+H(root.right)+1;
        return Math.max(D3,Math.max(D1,D2));

    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(Diameter(root));
        



    }
}