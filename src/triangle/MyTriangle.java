package triangle;

public class MyTriangle {
    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    MyPoint v1=new MyPoint();
    MyPoint v2=new MyPoint();
    MyPoint v3=new MyPoint();


    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1,int y1,int x2,int y2,int x3, int y3) {
        this.v1.setXY(x1,y1);
        this.v2.setXY(x2,y2);
        this.v3.setXY(x3,y3);
    }

    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }

    public String getType(){
        if(v1.distance(v2)==v2.distance(v3)&v1.distance(v2)==v3.distance(v1))
            return "equilateral";
        else if(v1.distance(v2)==v2.distance(v3)||v1.distance(v2)==v3.distance(v1)||v2.distance(v3)==v3.distance(v1))
            return "isosceles";
        else return "scalene";
    }

    public static void main(String[] args) {
        MyPoint v1 = new MyPoint(4,6);
        MyPoint v2 = new MyPoint(3,5);
        MyPoint v3 = new MyPoint(8,9);

        MyTriangle myTriangle1 = new MyTriangle(3,4,5,6,7,8);
        MyTriangle myTriangle2 = new MyTriangle(v1,v2,v3);

        System.out.println(myTriangle1);
        System.out.println(myTriangle2);
        System.out.println("Perimeter of triangle1 "+myTriangle1.getPerimeter());
        System.out.println("Type of triangle2 "+myTriangle2.getType());
    }
}
