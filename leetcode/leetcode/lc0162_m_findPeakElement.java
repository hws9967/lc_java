package leetcode;

public class lc0162_m_findPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        lc0162_m_findPeakElement findPeakElement = new lc0162_m_findPeakElement();
        System.out.println(findPeakElement.findPeakElement(nums));

    }

    public int findPeakElement(int[] nums) {
        int i=Integer.MIN_VALUE;
        int anw = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]>i){
                i=nums[j];
                anw=j;
            }
        }
        return anw;
    }
}
