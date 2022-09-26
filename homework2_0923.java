import java.util.*;
import java.util.Scanner;

public class homework2_0923 {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        var Month = new HashMap<>();
        // 添加键值对
        Month.put("1", "January");
        Month.put("2", "February");
        Month.put("3", "March");
        Month.put("4", "April");
        Month.put("5", "May");
        Month.put("6", "June");
        Month.put("7", "July");
        Month.put("8", "August");
        Month.put("9", "September");
        Month.put("10", "October");
        Month.put("11", "November");
        Month.put("12", "December");
        System.out.println("請輸入 1~12? ");
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int n = Integer.parseInt(num);
        if(n>12||n==0){
            System.out.println("範圍錯誤!");
        }
        else{
            System.out.println(Month.get(num));
        }
        
    }
}