class Tree
{   
    void Left(Node root,ArrayList<Integer> arr,int order){
        if(root==null){
            return;
        }    
        if(order==arr.size()){
            arr.add(root.data);
        }
        Left(root.left,arr,order+1);  //Left on priority 
        Left(root.right,arr,order+1);   //If left not present then add right
    }
    
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int order=0;
        Left(root,arr,order);
        return arr;
    }
}
