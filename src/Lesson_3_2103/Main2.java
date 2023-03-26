package Lesson_3_2103;

public class Main2 {
//    public static void main(String[] args) {
//
//        System.out.println(factorialIter(3));
//        System.out.println(factorialIter(5));
//
//        System.out.println(factorialRecursive(3));
//
//        int[] numbers = {1, 2, 3, -5, 6, 9};
//        System.out.println(sumArray(numbers, numbers.length - 1);
//        System.out.println(minArrayElement(numbers, 0));
//
//        System.out.println(gcd(28, 20));
//
//        System.out.println(getInFebonacci(5));
//
//    }

    //Числа Фибоначчи

//    private static int getInFebonacci(int n) {
//        if (n <= 1) {
//            return 1;
//        }
//        return getInFebonacci(n - 1) + getInFebonacci(n - 2);
//    }

// Алгоритм Евклида - НОД

//    private static int gcd(int n, int m) {
//        if (n == m) {
//            return n;
//        }
//    }

//    private static int minArrayElement(int[] array, int i) {
//        if (i < array.length) {
//            int next = minArrayElement(array, i + 1);
//            return Math.min(array[i], next); // if (array[i] < next)
//        } else {
//            // Базовый случай
//        }
//        return array[0];

        //private static int sumArray ( int[] array, int i){
           // if (i == 0) {
                //return array[0];
            //}
           // return sumArray(array, i - 1) + array[i];
        //}

       // private static int factorialIter ( int n){
           // int p = 1;
            //for (int i = 2; i <= n; i++) {
              //  p = p * i;
           // }
            //return p;
        //}
        private static int factorialRecursive ( int n){
            if (n == 1) {
                return 1;
            }
            return factorialRecursive(n - 1) * n;
        }
    }
