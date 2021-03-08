public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        this(1.0,1.0);


    }
    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    public Rectangle(Rectangle rectangle) {
    }
    public double getArea(){
        return height*width;
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
        Rectangle r1 = new Rectangle();
        
        System.out.println(r1.getArea()+" "+r1.getHeight());
    }



    
}
