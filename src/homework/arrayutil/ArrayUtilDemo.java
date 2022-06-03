package homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil2 myarrayUtil = new ArrayUtil2();
        int[] array  = {2, 4, 6, 9, 12, 34, 25, 77, 13, 20};
         myarrayUtil.printElements(array);
         myarrayUtil.PrintMaxElements(array);
         myarrayUtil.PrintMinElements(array);
         myarrayUtil.PrintOddElements(array);
         myarrayUtil.PrintEvenElements(array);
         myarrayUtil.PrintHHHElements(array);
         myarrayUtil.PrintKenteriqanakyhavasareElements(array);
         myarrayUtil.PrintMijinqanakElements(array);
         myarrayUtil.PrintSumElements(array);
    }
}