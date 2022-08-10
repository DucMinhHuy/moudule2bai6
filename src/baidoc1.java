class Geometric {
    private String color="white";
    private String filled=null;
    public Geometric(){

    }
    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getFilled(){
        return filled;
    }
    public void setFilled(String filled) {
        this.filled = filled;
    }
    public String toString(){
        return "created with\""+color+"\"color and"+(filled==null?"no fill":"filled with\""+filled+"\"color");
    }
}

class Circle extends Geometric{
    private double radius;
    private Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color,String filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*radius*Math.PI;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void printCircle(){
        System.out.println("the"+getColor()+"circle is created with the radius is"+radius);
    }
}
//khoong ke thua duoc class circle mai hoi chi k.a
class Rectangle extends Geometric {
    private double width;
    private double height;
    public Rectangle(){
    }
    public Rectangle( double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, String filled, double width, double height) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*width*height;
    }
}
class TestCircleRectangle{
    public static void main(String[] args) {
        Circle circle=new Circle(1);
        circle.setFilled("black");
        System.out.println("a circle"+circle.toString());
        System.out.println("the radius is"+circle.getRadius());
        System.out.println("the radius is"+circle.getRadius());
        System.out.println("the area is"+ circle.getArea());
        System.out.println("the diameter is"+circle.getDiameter());
        System.out.println();
        Rectangle rectangle=new Rectangle(2,4);
        System.out.println("A rectangle "+rectangle.toString());
        System.out.println("the area is"+rectangle.getArea());
        System.out.println("the perimeter" +rectangle.getPerimeter());
        System.out.println();

    }
}
