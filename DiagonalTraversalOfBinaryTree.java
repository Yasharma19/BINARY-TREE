class Tree
{
     public ArrayList<Integer> diagonal(Node root){
        
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        q.add(root);    //Initial stage
        while(!q.isEmpty()){
            Node temp=q.remove();    //getting the peek of the queue
            while(temp!=null){
                if(temp.left!=null){   //If left is present then add to queue
                    q.add(temp.left); 
                }
                arr.add(temp.data);    //add root data to the arraylist
                temp=temp.right;        //continue right till null node
            }
        }
        
        return arr;
      }
}
