package homework.chepter6;

public class Box {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.print("Volium: ");
        System.out.println(width * depth * height);

    }

    double vol() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        System.out.println("Konstruirovanie obekta Box");
        width = 10;
        height = 10;
        depth = 10;

    }

    Box(double w, double h, double d) {

        this.width = w;
        this.depth = d;
        this.height = h;
    }
//    Stack() {
//        tos = -1;
//    }
//
//    void push(int item) {
//        if (tos == 9)
//            System.out.println("Steck zapolnen. ");
//        else
//            stack[++tos] = item;
//    }
//
//    int pop() {
//        if (tos < 0) {
//            System.out.println("Steck ne zagrujen. ");
//            return 0;
//        } else
//            return stack[tos--];
//    }


}



