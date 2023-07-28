class HelloWorld{
    public List<List<Integer>> ZigZag(TreeNode root){
        List<List<Integer>> ans=new ArraysList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();    
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                level.add(node.val);
            }
            if(flag){
                Collections.reverse(level);
                flag=false;
            }
            else{
                flag=true;
            }
            ans.add(level);
        }
        return ans;
    }
}
