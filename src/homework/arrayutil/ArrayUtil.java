package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        //10 էլեմենտանի միաչափ մասիվ
        int array[] = {2, 4, 6, 9, 12, 34, 25, 77, 13, 20};
        for (int i = 0; i < array.length; i++) {

            //Տպել մասիվի բոլոր էլեմենտները
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        //Տպել մասիվի ամենամեծ թիվը
        int maxNumbers = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumbers) {
                maxNumbers = array[i];
            }

        }
        System.out.println("maxNumbers = " + maxNumbers);

        //Տպել մասիվի ամենափոքր թիվը
        int minNumbers = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > minNumbers) {
            }

        }
        System.out.println("minNumbers = " + minNumbers);

        //Տպել մասիվի բոլոր զույգ էլեմենտները
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                evenNumbers++;
            }
        }
        System.out.println("evenNumbers = " + evenNumbers);

        //Տպել մասիվի բոլոր կենտ էլեմենտները
        int oddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                oddNumbers++;
            }
        }
        System.out.println("oddNumbers = " + oddNumbers);

        //Տպել զույգերի քանակը


    }


}







