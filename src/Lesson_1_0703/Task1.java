package Lesson_1_0703;

import javax.naming.ldap.StartTlsRequest;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        private static boolean isExist (int[]array, int target){
//            for (int i=0; i< array.length; i++){
//        if (array[i] == target) {
//            return true;
//        }
//        }
//       }

//        int [] arr = {0, 1, 2, 3, 10, 20};
//        System.out.println(isExist(arr, 6));
        // 1. Написать псевдокод для алгоритма сложить три числа и вывести сумму
        // 2. Реализовать алгоритм в коде

        // START
        // Number input: a, b, c
        // declare sum
        // sum = a + b + c
        // print sum
        //END

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        System.out.println("Enter c");
        int c = scanner.nextInt();
        sum = a + b + c;
        System.out.println("sum = " + sum);


    }
}



