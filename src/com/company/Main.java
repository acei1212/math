package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x = 20;
        int y = 100;
        double x1 = 10;
        double y1 = 20;

        int q = Math.max(x, y);  //印出2個值中的最大值
        System.out.println(q);

        int z = Math.min(x, y);//印出2個值中的最小值
        System.out.println(z);

        double z1 = Math.sqrt(x1 + y1);//印出x1+y1開根號，格式需用double
        System.out.println(z1);


        //

        double z2 = Math.abs(y1);//印出y1絕對值
        System.out.println(z2);
    }
}
