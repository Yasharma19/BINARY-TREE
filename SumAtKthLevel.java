public class SumAtKthLevel{
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

    public static int SumK{Node root,int k}{
        if(root==null){
            return -1;
        }

        Queue<node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=0;
        int sum=0;
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr!=null){
                if(level==k){
                    sum+=curr.data;
                }
            }
        }
    }

    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(root.data);



    }
}