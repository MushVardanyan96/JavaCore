package homework.arrayutil;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework MyHomework = new PracticeHomework();
        System.out.println(MyHomework.convert(5));
        System.out.println(MyHomework.calcAge(5));
        System.out.println(MyHomework.nextNumber(5));
        System.out.println(MyHomework.isSameNum(5, 10));
        System.out.println(MyHomework.lessThanOrEqualToZero(5));
        System.out.println(MyHomework.reverseBool(true));
        int[]arr1 = new int[10];
        int[]arr2 = new int[15];
        int maxLenght = MyHomework.maxLength(arr1 , arr2);
        System.out.println(maxLenght);


    }
}
