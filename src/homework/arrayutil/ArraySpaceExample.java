package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] resultPlus = new char[0];
        char space = ' ';
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != space) {
                for (int j = spaceArray.length - 1; j > i; j--) {
                    if (spaceArray[j] != space) {
                        resultPlus = new char[j - i + 1];
                        int index = 0;
                        for (; i <= j; i++) {
                            resultPlus[index] = spaceArray[i];
                            index++;
                        }
                    }
                }
            }
        }
        for (char c : resultPlus) {
            System.out.print(c);
        }
    }
}
