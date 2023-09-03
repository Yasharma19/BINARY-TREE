class Solution {
    public void Right(TreeNode root,List<Integer> arr,int order){
        if(root==null){
            return;
        }
        if(order==arr.size()){
            arr.add(root.val);
        }
        Right(root.right,arr,order+1);  //Priority to Right
        Right(root.left,arr,order+1);   //If right Not present then add left;
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        int order=0;
        Right(root,arr,order);
        return arr;
    }
    
}
