package homework.JavaBook.chapter4;

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xffffffE;
        for (int k = 0; k < 4; k++) {
            num = num << 1;
            System.out.println(num);
        }


    }
}
