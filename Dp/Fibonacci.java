// 1. You are given a number n.
// 2. You are required to print the nth element of fibonnaci sequence.

// Note -> Notice precisely how we have defined the fibonnaci sequence
// 0th element -> 0
// 1st element -> 1
// 2nd element -> 1
// 3rd element -> 2
// 4th element -> 3
// 5th element -> 5
// 6th element -> 8



import java.util.*;

public class Fibonacci{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int ans=fibDp(n,new int[n+1]);
    System.out.println(ans);
    scn.close();
    
 }
 public static int fib(int n){
     if(n==0||n==1){
         return n;
     }
     
     int f1=fib(n-1);
     int f2=fib(n-2);
     return f1+f2;
 }
 public static int fibDp(int n,int []qb){
     if(n==0||n==1){
         return n;
     }
     if(qb[n]!=0){
         return qb[n];
     }
     
     int f1=fib(n-1);
     int f2=fib(n-2);
     qb[n]=f1+f2;
     return f1+f2;
 }
}