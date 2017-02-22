package com.company.Classes;

/**
 * Created by JPMC-B2-PC15 on 20/02/2017.
 */
public class StaticMethods {



    public static void whileMethod(int num){
        System.out.println("WHILE LOOP");
        int x=1;
        while (x<=num) {
            System.out.print("[" + x + "]" + " ");
            x++;
        }
        System.out.println("\n");
    }


    public static void whileMethodSum(int num){
        System.out.println("WHILE LOOP SUM");
        int x=1;
        int sum=0;
        while (x<=num) {
            sum +=x;
            x++;
        }
        System.out.print("The sum is: " + sum);
        System.out.println("\n");
    }



    public static void doWhileMethod(int num) {
        System.out.println("DO WHILE LOOP");
        int x = 1;
        do {
            System.out.print("[" + x + "]" + " ");
            x++;
        }
        while (x <= num);
        System.out.println("\n");
    }


    public static void forLoopMethod(int num) {
        System.out.println("FOR LOOP");
        for (int a=1; num>=a; a++){
            System.out.print("[" + a + "]" + " ");
        }
        System.out.println("\n");
    }

    public static void forLoopMethodSum(int num) {
        System.out.println("FOR LOOP SUM");
        int sum=0;
        for (int a=1; a<=num; a++){
            sum +=a;
        }
        System.out.print("The sum is: " +  sum);
        System.out.println("\n");
    }


    public static void factorial(int num){

         int [] bobonachi = new int [7];

        for (int a=1; a<=num; a++) {

            int temp=num-1;
            int fac=temp*num;


            System.out.print(fac + " ");
        }
    }
}
