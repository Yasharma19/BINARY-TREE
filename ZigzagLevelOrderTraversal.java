import java.util.*;

// We have to reverse the nodes of the alternate levels of the tree
// using STACK for reversing the nodes as it uses LIFO

class HelloWorld {
    public static List<List<Integer>> ZigZag(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            Stack<Integer> st=new Stack<>();
            while(size-->0){
                TreeNode curr=q.remove();
                if(flag){
                    st.push(curr.val);
                }
                else{
                    level.add(curr.val)
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            flag=!flag;
            while(!st.isEmpty()){
                level.add(st.pop());
            }
            result.add(level);
        }
        return result;
    }
}
