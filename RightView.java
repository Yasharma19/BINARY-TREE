class Solution{
    
    void Right(Node node,ArrayList<Integer> arr,int order){
        if(node==null){
            return;
        }
        if(order==arr.size()){
            arr.add(node.data);
        }
        Right(node.right,arr,order+1);
        Right(node.left,arr,order+1);    //If not found in right part then come to find node in left part at next level
    }
    
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Right(node,arr,0);
        return arr;
    }
}
