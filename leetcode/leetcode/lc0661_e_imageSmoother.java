package leetcode;

public class lc0661_e_imageSmoother {
    public static void main(String[] args) {

    }

    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ret = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = 0;
                int sum = 0;
                for (int x = i-1; x <=i+1 ; x++) {
                    for (int y = j-1; y <=j+1; y++) {
                        if (x>=0 && x<m && y>=0 && y<n){
                            num++;
                            sum+=img[x][y];
                        }
                    }
                }
                ret[i][j]=sum/num;
            }
        }
        return ret;
    }
}
