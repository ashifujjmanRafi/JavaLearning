
public class Cirle {

    Point center;
    double radius;

    Cirle(Point initial, double initial2) {
        center = initial;
		this.center = initial;
        this.radius = initial2;

    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    public void setCenter(Point center){
        this.center = center;

    }
    void setRadius(double radius) {
        this.radius = radius;
    }



}
