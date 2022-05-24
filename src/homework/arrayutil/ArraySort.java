package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int a = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {  //if (numbers[j]  <  numbers[j + 1]) kstananq hakarak procesy
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;

                }
            }
        }
        for (int c : numbers) {
            System.out.print(" " +c);
        }
    }

}


