package homework.BraceChecker;

public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9)
            System.out.println("tex chka ");
        else
            stck[++tos] = item;

    }

    int pop() {
        if (tos > 0){
            System.out.println("stacky dadark e ");
            return 0;
        }
        else
            return stck [tos--];
    }

}
