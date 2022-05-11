package homework.JavaBook.chapter3;

public class Example1 {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        lightSpeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightSpeed * seconds;
        System.out.print("orinak " + days);
        System.out.print(" orum luysy kancni ");
        System.out.println(distance + " mil");

    }


}
