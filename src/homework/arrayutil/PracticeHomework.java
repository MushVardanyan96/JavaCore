package homework.arrayutil;

public class PracticeHomework {
    long convert (int minutes){
        return (long) minutes * 60;
    }
    int calcAge(int years){
        return(int) years * 365;
    }
    int nextNumber(int number) {
        return (int) number +1;
    }
    boolean isSameNum(int a, int b) {
        if (a == b){
            return true;
        }
        return false;
    }
    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0){
            return true;
        }
        return false;
    }
    boolean reverseBool(boolean value) {
        if(value == false){
            return true;
        }
        return false;
    }
    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }

    }
