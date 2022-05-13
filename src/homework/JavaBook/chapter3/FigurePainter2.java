package homework.JavaBook.chapter3;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print(" ");
            }


            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            for (int x = 0; x < 4; x++) {
                for (int y = 4; y > x ; y--) {
                    System.out.print(" ");
                }
                for (int z = 0; z <= x ; z++) {
                    System.out.print("* ");

                }
                System.out.println();
            }


        }
    }

}
