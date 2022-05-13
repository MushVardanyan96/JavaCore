package homework.JavaBook.chapter3;

public class Figure2Painter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int x = 0; x < 3; x++) {
            for (int z = -1; z < x; z++) {
                System.out.print(" ");
            }
            for (int y = 3; y > x; y--) {
                System.out.print(" *");

            }
            System.out.println();
        }

    }
}






