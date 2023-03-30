package HomeWorks;

import java.util.Arrays;

public class HW_1 {
    public static class Homework {

        public static void main(String[] args) {
            System.out.println(isSumBetween10And20(5, 15)); // true
            System.out.println(isSumBetween10And20(7, 15)); // false
            System.out.println(isSumBetween10And20(2, 6)); // false

            System.out.println(isPositive(5)); // true
            System.out.println(isPositive(-3)); // false

            printString("abcd", 5); // abcdabcdabcdabcdabcd

            int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
            int x = array[2][3];
            int[] array2 = {1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0};
            int[] array3={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, };
            System.out.println(Arrays.toString(rewriteArray(array2)));
            System.out.println(Arrays.toString(multipluyArray(array3)));
            System.out.println(Arrays.toString(diagonalArray(array)));
            System.out.println(isLeapYear(1980));
            System.out.println(Arrays.toString(createArray(10,8)));
        }

        /**
         * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
         * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
         */
        private static boolean isSumBetween10And20(int a, int b) {
            // проверить, что сумма a и b лежит между 10 и 20
            boolean flag= false;
            int sum=a+b;
            if(sum> 10 & sum < 20) flag=true;
            return flag;
        }

        private static boolean isPositive(int x) {
            // проверить, что х положительное
            boolean flag = false;
            if (x > 0) flag=true;
            return flag;
        }

        private static void printString(String source, int repeat) {
            // напечатать строку source repeat раз
            for (int i = 0; i < repeat; i++) {
                System.out.println(source);
            }

        }

        private static boolean isLeapYear(int year) {
            // проверить, является ли год високосным. если да - return true
            // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
            boolean flag = false;
            if(year % 4 == 0 & year % 100 != 0 & year % 400 == 0)
                flag=true;
            return flag;
        }

        private static int[] createArray(int len, int initialValue) {
            // должен вернуть массив длины len, каждое значение которого равно initialValue
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
        }

        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
         * <p>
         * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         * <p>
         * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         * * Также заполнить элементы побочной диагонали
         */
        private static int[] rewriteArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) array[i] = 1;
                else array[i] = 0;
            }
            return array;
        }

        private static int[] multipluyArray(int [] array){
            for (int i = 0; i < array.length; i++) {
                if (array[i]<6) array[i]*=2;
            }
            return array;
        }

        private static int[][] diagonalArray(int[][] array){
            for (int i = 0; i < array.length/2; i++) {
                for (int j = 0; j < array.length/2; j++) {
                    if (i==j|i+j== array.length/2-1) array[i][j]=1;
                }
            }
            return array;
        }

    }
}
