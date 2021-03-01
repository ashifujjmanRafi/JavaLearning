
public class Britto {

    public static void main(String[] args) {

        // System.out.println(Cirle.getNumofCircle());

        // Cirle c1 = new Cirle(new Point(1, 2), 3);

        // System.out.println(c1.getArea());

        // c1.setCenter(new Point(11, 12));

        // c1.setRadius(10);

        // System.out.println(c1.getArea());

        // Cirle c2 = new Cirle(new Point(0, 0), 1);

        // System.out.println(c2.getArea());
 
        // System.out.println(Cirle.getNumofCircle());

        CircleEncapsulation c3 = new CircleEncapsulation(new Point(0, 0), 10);
        System.out.println(c3.getRadius());
        c3.setRadius(-10);
        System.out.println(c3.getRadius());
        System.out.println(CircleEncapsulation.getNumofCircle()); 

    }

}
