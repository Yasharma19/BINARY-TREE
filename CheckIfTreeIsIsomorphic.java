class Solution  
{ 
    //Isomorphic means that if any node is swapped then their children are same as previous ones.
    boolean isIsomorphic(Node root1, Node root2)  
    { 
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.data!=root2.data)
            return false;
        
        boolean a=isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right);
        
        //here we take as we are swapping 
        boolean b=isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left);        
        
        //here is one of the case from a and b will become true
        return a || b;
    }
    
}    
