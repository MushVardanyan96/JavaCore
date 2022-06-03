package homework.JavaBook.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Predshestvuet operatoru break.");
                    if (t) break second;
                    System.out.println("Etot operator ne budet vipolnyatsa");
                }
                System.out.println("Etot operator ne budet vipolnyatsa");
            }
            System.out.println("Etot operator sleduet za blokom second.");
        }
    }
}
