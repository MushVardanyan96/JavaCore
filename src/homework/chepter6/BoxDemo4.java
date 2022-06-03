package homework.chepter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.depth = 10;
        mybox1.height = 20;
        mybox1.width = 15;

        mybox2.depth = 3;
        mybox2.height = 6;
        mybox2.width = 9;

        vol = mybox1.vol();
        System.out.println("Obyom roven " + vol);

        vol = mybox2.vol();
        System.out.println("Obyom roven " + vol);
    }
}
