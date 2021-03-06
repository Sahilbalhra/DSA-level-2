// Buy And Sell Stocks With Transaction Fee - Infinite Transactions Allowed

// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are give a number fee, representing the transaction fee for every transaction.
// 4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).

// Sample Input
// 12
// 10
// 15
// 17
// 20
// 16
// 18
// 22
// 20
// 22
// 20
// 23
// 25
// 3
// Sample Output
// 13

package BuyAndSell;

import java.util.*;
public class BuyAndSell3 {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int [] arr) {
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
      }
    }
  
    public static void main(String[] args) throws Exception {
      // write your code here
      int n = scn.nextInt();
      int []arr = new int[n];
      input(arr);
      int fee = scn.nextInt();
      
      int obsp=-arr[0];
      int ossp=0;
      
      for(int i=1;i<arr.length;i++){
          
          int nssp=0;
          int nbsp=0;
          
          //for buy
          if(ossp-arr[i]>obsp){
              nbsp=ossp-arr[i];
          }else{
              nbsp=obsp;
          }
          
          //for sell
          
          if(arr[i]+obsp-fee>ossp){
              nssp=obsp+arr[i]-fee;
          }else{
              nssp=ossp;
          }
          
          obsp=nbsp;
          ossp=nssp;
      }
      System.out.println(ossp);
    }
    
}
