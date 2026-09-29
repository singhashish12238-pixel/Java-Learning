package java_basic;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // String printname = sc.nextLine();
        // int i ;
        // for(i = 0 ;  i<size; i ++){
        //     System.out.println(printname);
        // }
        int[] arr = new int[size];
        int i ;
        for(i = 0 ; i < size ; i ++){
            arr[i] = sc.nextInt();
        }

        for(i = 0 ; i < size ;  i++ ){
            System.out.println(arr[i]); 
        }
        // for each loop
        for(int num : arr){
            System.out.println(num + " ");
        }
        // do while loop
        do{
        int n  = sc.nextInt();
        if(n == 10){
                break;
            }
            System.out.println(n);
         }while(true);
        sc.close();
    }
}
// while loop
// do while loop
// do{
// int num = sc.nextInt();

// }while(){

// }