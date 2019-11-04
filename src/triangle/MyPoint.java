package triangle;

import java.util.Arrays;

public class MyPoint {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x= 0;
    private int y= 0;


    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public String toString() {
        return "("+x+","+y+")";
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int[] getXY(){
        int[] XY = {x,y};
        return XY;
    }

    public double distance(){
        return Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
    }

    public double distance(int x,int y){
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }

    public double distance(MyPoint point){
        return Math.sqrt((this.x-point.x)*(this.x-point.x)+(this.y-point.y)*(this.y-point.y));
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3,4);
        MyPoint point2 = new MyPoint();
        point2.setXY(5,6);
        System.out.println("Point1 "+point1);
        System.out.println("Point2 "+point2);
        System.out.println("Point1 XY "+ Arrays.toString(point1.getXY()));
        System.out.println("Distance from point1 to the point at 4,6 "+point1.distance(4,6));
        System.out.println("Distance from point1 to the point2 "+point1.distance(point2));
        System.out.println("Distance from point1 to the point at 0,0 "+point1.distance());
    }
}
