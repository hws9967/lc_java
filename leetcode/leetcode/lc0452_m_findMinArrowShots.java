package leetcode;

import java.util.Arrays;

public class lc0452_m_findMinArrowShots {
    public static void main(String[] args) {

    }

    public int findMinArrowShots(int[][] points) {
       if (points.length==0){
           return 0;
       }
        Arrays.sort(points, (x, y) -> Integer.compare(x[0], y[0]));
        int count =1;
        int leftmostRightBound = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0]>leftmostRightBound){
                count++;
                leftmostRightBound=points[i][1];
            }else {
                leftmostRightBound = Math.min(leftmostRightBound,points[i][1]);
            }
        }
        return count;
    }
}
