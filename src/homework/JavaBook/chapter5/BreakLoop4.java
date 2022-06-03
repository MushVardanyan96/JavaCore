package homework.JavaBook.chapter5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Prixod " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("Etot proekt ne budet vivoditsa");
        }
        System.out.println("Cikli zaversheni. ");
    }


}

