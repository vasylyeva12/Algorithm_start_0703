//package Lesson_3_2103;
//
//public class time {
//    public static void main(String[] args) {
//        System.out.println("Hello Word");
//        String[] words = {"flow", "florida", "flight"};
//        String answer = words[0];
//        for (int i = 1; i < words.length; i++); {
//            answer = prefix(answer, words[i]);
//        }
//        System.out.println((answer));
//    }
//
//    private String prefix(String first, String second) {
//        String answer = "";
//        for (int i = 0; i  < Math.min(first.length(), second.length()); i++) {
//            if (first.charAt(i) == second.charAt(i)); {
//                answer += first.charAt(i);
//            } else {
//                return  answer;
//            }
//        }
//    }
//
//    void test1(int n) {
//        if (n == 1) {
//
//            return;
//        }
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.println("*");
//                break;
//            }
//        }
//    }
//
//    // O(n * n) O(n ^ 2) - возведение в квадрат
//    void test2(int n) {
//        int a = 0;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j <= i; j--) {
//                a = a + i + j;
//            }
//        }
//    }
//
//    //O(n * log(n))
//    void test3(int n) {
//        int i, j, a = 0;
//
//        for (i = n / 2; i <= n; i++) {
//            for (j = 2; j <= n; j = j * 2) {
//                a = a + n / 2;
//            }
//        }
//    }
//    // O(log(n))
//    void test4(int n) {
//        int a = 0, i = n;
//        while (i > 0) {
//            a += i;
//            i /= 2;
//        }
//
//    }
//}
