
class Solution
{
    static class Pair{
        int hd;   //Horizontal Distance
        Node node;
        public Pair(int hd,Node node){
            this.node=node;
            this.hd=hd;
        }
    }
  
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
  
    static ArrayList<Integer> topView(Node root)
    {   Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,Integer> map=new TreeMap<>();
        
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair cur=q.remove();
            if(!map.containsKey(cur.hd)){
                map.put(cur.hd,cur.node.data);
            }
            if(cur.node.left!=null){
                q.add(new Pair(cur.hd-1,cur.node.left));
            }
            if(cur.node.right!=null){
                q.add(new Pair(cur.hd+1,cur.node.right));
            }
        }
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        //Traversing a TREE MAP and adding its element into ArrayList
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            arr.add(entry.getValue());
        }
        return arr;
        
    }
}
