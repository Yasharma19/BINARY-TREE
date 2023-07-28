class Solution{    
    //Put all the leaf nodes to 0 
    //return sum of leftsubtree + RightSubtree + own value
    
    int Sum(Node root){
        if(root==null){
            return 0;
        }
        int a=Sum(root.left);
        int b=Sum(root.right);
        int x=root.data;
        root.data=a+b;
        return a+b+x;
    }
    
    public void toSumTree(Node root){
        Sum(root);
    }
}
