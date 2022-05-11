package homework.JavaBook.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("n POXARINVUME TIP int TIP byte.");
        b = (byte) i;
        System.out.println("i U b " + i + " " + b);
        System.out.println("n POXARINVUME TIP double IC TIP int. ");
        i = (int) d;
        System.out.println("d U i " + d + " " + i);
        System.out.println("n POXARINVUME TIP double TIP byte. ");
        System.out.println("d U b" + d + " " + b);
    }

}
