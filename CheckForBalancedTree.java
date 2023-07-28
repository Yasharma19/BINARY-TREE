class Tree
{
     //We have to check with each that the difference between heights of left and right Node will be not more than one. 
    int height(Node root){
        if(root==null){
            return 0;
        }
        
        int l=height(root.left);
        if(l==-1)
            return -1;
        
        int r=height(root.right);
        if(r==-1)
            return -1;
            
        if(Math.abs(l-r)>1){
            return -1;
        }
        return Math.max(l,r)+1;
    }
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
        if(height(root)==-1)
            return false;
        
        return true;
    }
}
