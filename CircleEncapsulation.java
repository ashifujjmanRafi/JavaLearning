public class CircleEncapsulation {
    Point center;
    private double radius;
    private static int numofcircle=0;

    CircleEncapsulation(Point center, double radius) {
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

    public double getRadius(){
        return radius;

    }
    public void setRadius(double rad){
        this.radius=rad>=0?rad:0;

    }
    //static variable method can be called by class name or obj 
    public static int getNumofCircle(){
        return numofcircle;

    }

    
}
