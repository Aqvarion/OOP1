public class Rectangle {
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        double area= length*width;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double getPerimeter(){
        double perimeter=width*2+length*2;
        return perimeter;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(30.6f,20);
        System.out.println(rectangle);
        System.out.println("Area of rectangle: "+rectangle.getArea()+" Perimeter of rectangle: "+rectangle.getPerimeter()+"\n");
    }
}
