class Solution {
    public void toSumTree(Node root) {
        // Add code here
        sumTreeUtil(root);
    }
    
    private int sumTreeUtil(Node root) {
        // Base case
        if (root == null) {
            return 0;
        }
        
        // Store the old value
        int oldValue = root.data;
        
        // Recursively get sum of left and right subtrees
        int leftSum = sumTreeUtil(root.left);
        int rightSum = sumTreeUtil(root.right);
        
        // Update root value to sum of left and right subtrees
        root.data = leftSum + rightSum;
        
        // Return the sum of values under root which is new value + old value
        return root.data + oldValue;
    }
}
