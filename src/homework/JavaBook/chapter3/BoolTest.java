package homework.JavaBook.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b okay " + b);
        b = true;
        System.out.println("b okay " + b);
        if (b) System.out.println("am okay.");
        b = false;
        if (b) System.out.println("nou.");
        System.out.println("10 > 9 havasare " + (10 > 9));
    }


}
