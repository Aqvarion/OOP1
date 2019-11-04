public class Circle {
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private double radius=1.0;
    private String color="red";

    public Circle(double radius,String color) {
        this.radius=radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.2,"Yellow");
        System.out.println(circle);
        System.out.println("Area of circle: "+circle.getArea()+"\n");
    }
}
