
public class Cirle {

    Point center;
    double radius;
    static int numofcircle=0;

    Cirle(Point center, double radius) {
        numofcircle++;
        
		this.center = center;
        this.radius = radius;

    }

    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    void setCenter(Point center){
        this.center = center;

    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    static int getNumofCircle(){
        return numofcircle;

    }


}
