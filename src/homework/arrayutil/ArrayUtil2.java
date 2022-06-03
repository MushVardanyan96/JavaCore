package homework.arrayutil;

public class ArrayUtil2 {
    void printElements(int[] array) {
        System.out.print("bolory = ");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    int PrintMaxElements(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];

        }
        System.out.print("Max = " + max);
        System.out.println();
        return max;
    }

    int PrintMinElements(int[] myarray) {
        int min = myarray[0];
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < min) {
                min = myarray[i];
            }
        }
        System.out.println("Min = " + min);
        return min;
    }

    void PrintOddElements(int[] array) {
        System.out.print("Zuygery = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " , ");

            }
        }
        System.out.println();
    }

    void PrintEvenElements(int[] array) {
        System.out.print("kentery = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " , ");
            }
        }
        System.out.println();
    }

    int PrintNumOfPairsElements(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        System.out.print("Zugeri qanaky = " + even);
        System.out.println();
        return even;
    }

    int PrintNumOfCentElements(int[] array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.print("Kenteri qanaky = " + odd);
        System.out.println();
        return odd;
    }

    double PrintAverageQuantityElements(int[] array) {
        double a = 0;
        for (int i = 0; i < array.length; i++) {
            a += array[i];

        }
        System.out.println("tvabanakan  injiny = " + a / array.length);
        return a;
    }
    int PrintSumElements(int[] array){
        int gumar = 0;
        for (int i = 0; i < array.length; i++) {
            gumar += array[i];

        }
        System.out.println("Gumary = " + gumar);
        return gumar;
    }

}
