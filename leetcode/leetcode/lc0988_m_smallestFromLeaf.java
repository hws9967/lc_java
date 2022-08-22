package leetcode;

public class lc0988_m_smallestFromLeaf {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int[] ints = {0,1,2,3,4,3,4};
    }
    String ans = "～";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return ans;
    }

    //深度有限搜索
    public void dfs(TreeNode node,StringBuilder sb){
        if (node==null){
            return;
        }

        sb.append((char) ('a'+node.val));

        if (node.left==null && node.right==null){
            sb.reverse();
            String S = sb.toString();
            sb.reverse();

            if (S.compareTo(ans)<0){
                ans=S;
            }
        }

        dfs(node.left,sb);
        dfs(node.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}
