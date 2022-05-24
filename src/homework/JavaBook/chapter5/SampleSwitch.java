package homework.JavaBook.chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i ravno nulya.");
                    break;
                case 1:
                    System.out.println("i ravno edinice.");
                    break;
                case 2:
                System.out.println("i ravno dvum.");
                break;
                case 3:
                System.out.println("i ravno trem.");
                break;
                default:
                    System.out.println("i bolshe trex.");

            }
    }
}
