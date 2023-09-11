//Divide Question in 3 parts i.e. LeftTree,Leaf(Left & Right) and RightTree
class Solution
{
    void LeftTree(Node node,ArrayList<Integer> arr){
        if(node==null){
            return;
        }    
        if(node.left!=null){
            arr.add(node.data);
            LeftTree(node.left,arr);
        }
        else if(node.right!=null){
            arr.add(node.data);
            LeftTree(node.right,arr);
        }
    }
    
    void Leaf(Node node,ArrayList<Integer> arr){
        if(node==null){
            return;
        }
        Leaf(node.left,arr);    //reached till leftnode
        if(node.left==null && node.right==null){
            arr.add(node.data);
        }
        Leaf(node.right,arr);
    }
    
    void RightTree(Node node,ArrayList<Integer> arr){
        if(node==null){
            return;
        }
        if(node.right!=null){
            RightTree(node.right,arr);   //reach till end of the right
            //leaf as we have to print reverse order
            arr.add(node.data);
        }
        else if(node.left!=null){
            RightTree(node.left,arr);
            arr.add(node.data);
        }
    }
    
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> arr=new ArrayList<Integer>();
	    if(node==null){
	        return arr;
	    }
	    arr.add(node.data);
	    LeftTree(node.left,arr);
	    Leaf(node.left,arr);
	    Leaf(node.right,arr);
	    RightTree(node.right,arr);
	    return arr;
	}
}
