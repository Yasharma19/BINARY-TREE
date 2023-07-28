class Solution{
    int leaflevel;
    public boolean checkLevel(Node root,int level){
        if(root==null)
            return true;
        
        if(root.left==null && root.right==null){
            if(leaflevel==0){
                leaflevel=level;
                return true;
            }
            return leaflevel==level;
        }    
        return checkLevel(root.left,level+1) && checkLevel(root.right,level+1);
    }
}
