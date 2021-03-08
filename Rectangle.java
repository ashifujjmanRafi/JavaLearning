import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);

    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
    }

    public double getArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("enter the rectangle size :");;
            int x = in.nextInt();
            Rectangle[] r1 = new Rectangle[x];
            for (int i = 0; i < x; i++) {
                System.out.println("enter the heaight and width of rectangle " + (i+1));
                r1[i] = new Rectangle(in.nextDouble(), in.nextDouble());
                System.out.println("area and height of " + (i + 1) +
                 " " + r1[i].getArea() + " " +
                  r1[i].getHeight());

            }
        }
    }

}
