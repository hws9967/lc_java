package leetcode;

import java.util.Scanner;

public class lc1103_e_distributeCandies {
    public static void main(String[] args) {
        System.out.println("111");
        //Scanner sc = new Scanner(System.in);
        int candies =7;
        int num_people =4 ;
        lc1103_e_distributeCandies Candies = new lc1103_e_distributeCandies();
        int[] ints = Candies.distributeCandies(candies, num_people);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public int[] distributeCandies(int candies, int num_people) {
        int[] anw = new int[num_people];
        int i = 0;
        while (candies!=0){
            anw[i%num_people]+=Math.min(candies,i+1);
            candies-=Math.min(candies,i+1);
            i+=1;
        }
        return anw;
    }
}
