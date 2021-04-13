import java.util.Scanner;

public class HomeWork {
    //递归求阶乘
    public static int fac(int n){
        if(n == 1){
            return 1;
        }else{
            return n*fac(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fac(x));
    }




    //递归求和
    public static int add(int n){
        if(n == 1){
            return 1;
        }else{
            return n + add(n-1);
        }
    }
    public static void main6(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(add(x));
    }




    //递归打印每一位
    public static void print(int n) {
        if(n < 10){
            System.out.print(n + " ");
        }else{
            print(n/10);
            System.out.print(n%10 + " ");
        }
    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print(x);
    }





    //返回各数字之和
    public static int sum(int n){
        if(n < 10){
            return n;
        }else{
            return n%10 + sum(n/10);
        }
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(sum(x));
    }




    //斐波那契数列
    public static int fib(int n){
        if(n == 1 || n ==2){
            return 1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fib(x));
    }





    //汉诺塔问题
    public static void hanoi(int n,char pose1,char pose2,char pose3){
        if(n == 1){
            move(pose1,pose3);
        }else{

            hanoi(n-1,pose1,pose3,pose2);
            move(pose1,pose3);
            hanoi(n-1,pose2,pose1,pose3);
        }
    }
    public static void move(char pose1,char pose2){
        System.out.print(pose1 + "->" + pose2 + " ");
    }
    public static void main2(String[] args) {
        //求汉诺塔问题
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
        System.out.println();
        hanoi(4,'A','B','C');
    }






    //青蛙跳台阶问题
    public static int jumpsteps(int n){
        if(n == 1 || n == 2) {
            return n;
        }
        return jumpsteps(n-1) + jumpsteps(n-2);
    }
    public static void main1(String[] args) {
        //青蛙跳台阶问题
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(jumpsteps(x));
    }
}
