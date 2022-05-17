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
        System.out.print("evenNumbers = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();

        //Տպել մասիվի բոլոր կենտ էլեմենտները
        System.out.print("oddNumbers = ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {

                System.out.print(" " + array[i]);
            }
        }
        System.out.println();

        //Տպել զույգերի քանակը
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumbers++;
            }

        }
        System.out.print("զույգերի քանակը = " + evenNumbers);
        System.out.println();

        //կենտերի քանակը
        int oddNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1){
                oddNumbers ++;
            }

        }
        System.out.print("կենտերի քանակը = " + oddNumbers);
        System.out.println();
        //
        double x = 0;
        for (int i = 0; i < array.length; i++) {
            x+= array[i];

        }
        System.out.println("միյին թվաբանականը = " + x/array.length);

        //
        int gumary =0;
        for (int i = 0; i < array.length; i++) {
            gumary += array[i];

        }
        System.out.println("gumary = " + gumary);

    }


}









