package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        test test = new test();

        switch (s){
            case "init":
                test.init();
                System.out.println("初始化");
                break;
            case "remove":
                System.out.println("删除");
                break;
            case "add":
                System.out.println("添加");
                break;
            case "list":
                System.out.println("列表");
                break;
            default:
                System.out.println("报错");
                //goto（）这个可以跳出到别的行去 忘记函数了
        }
        System.out.println(s);
    }

    public void init(){
        hashMap.put(1,"task 01");
        hashMap.put(2,"task 02");
        hashMap.put(3,"task 03");
    }

    public void list(){

    }
}
