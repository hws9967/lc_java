package leetcode;

public class lc1534_e_countGoodTriplets {
    public static void main(String[] args) {
       int[] arr = {3,0,1,1,9,7};
       int a=7;
       int b=2;
       int c=3;
        lc1534_e_countGoodTriplets countGoodTriplets = new lc1534_e_countGoodTriplets();
        int i = countGoodTriplets.countGoodTriplets(arr, a, b, c);
        System.out.println("---"+i);
    }
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                        ++num;
                    }
                }
            }
        }
        return num;
    }
}
