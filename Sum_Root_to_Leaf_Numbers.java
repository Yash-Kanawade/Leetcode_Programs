public class Sum_Root_to_Leaf_Numbers {
    private int count = 0;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return count;
    }

    public void helper(TreeNode root, int num) {
        if (root == null)
            return;
        // String str = Integer.toString(num);
        // str = str + root.val;
        // num = Integer.parseInt(str);
        num = (num * 10) + root.val;
        if (root.left == null && root.right == null) {
            count = count + num;
            return;
        }
        if (root.left != null)
            helper(root.left, num);
        if (root.right != null)
            helper(root.right, num);
        return;
    }
}
