class Solution
{   
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }
    
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        Queue<Pair> q=new ArrayDeque<>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        if(root==null){
            return arr;
        }
        
        Map<Integer,Integer> map=new TreeMap<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr=q.remove();
            
            //Just Update the existing one and get the final as an answer
            map.put(curr.hd,curr.node.data);
            
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            arr.add(entry.getValue());
        }
        return arr;
    }
}
