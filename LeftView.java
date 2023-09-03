class Tree
{
    
    void Left(Node root,ArrayList<Integer> arr,int order){
        if(root==null){
            return;
        }    
        if(order==arr.size()){
            arr.add(root.data);
        }
        Left(root.left,arr,order+1);     //Priority to left as we are doing leftview.
        Left(root.right,arr,order+1);  //if not present in left, then we find in riight part whether there is a node or not on next level.
    }
    
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    Left(root,arr,0);
    return arr;
    }
}
