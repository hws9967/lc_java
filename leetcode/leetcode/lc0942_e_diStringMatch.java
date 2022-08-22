package leetcode;

public class lc0942_e_diStringMatch {
    public static void main(String[] args) {

    }

    public int[] diStringMatch(String s) {
        int n = s.length();
        int l = 0;
        int r = n;
        int idx = 0;

        int[] ans = new int[n+1];
        for (int i = 0; i < n; i++) {
            ans[idx++]=s.charAt(i)=='I'?l++:r--;
        }
        ans[idx]=l;
        return ans;
    }
}
