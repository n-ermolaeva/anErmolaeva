public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length,
               double width,
               double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Box myBox1 = new Box(16, 6, 29);
        System.out.println("Volume myBox1 = " + myBox1.volume());
        extendBox(myBox1, 2);
        System.out.println("Volume myBox1 = " + myBox1.volume());
    }

    public static void extendBox(Box box, int num) {
        box.length += num;
        box.width += num;
        box.height += num;
    }

    public double volume() {
        return length * width * height;
    }

}
