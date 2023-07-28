class Solution {
    // JUST SWAPPING ALL RIGHT TO LEFT OR VICE-VERSA

    //Just Same as INVERT BINARY TREE
    void mirror(Node node) {
        if(node==null){
            return;
        }
        mirror(node.left);
        mirror(node.right);
        Node temp=node.left;
        node.left=node.right;
        node.right=temp;
    }
}
