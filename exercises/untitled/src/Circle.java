public class Circle {
    private Point2D center,point;

    //The first parameter specifies the center of the circle, the second is any point on the circle.
    //Based on these points, the Circle class is to determine:
    //• circle radius when calling double getRadius() method
    //• circle circumference when calling double getPerimeter() method
    //• circle area when calling double getArea() method
    //• * (challenging) three points on the circle every 90 degrees from the point given when calling the
    //List<Point2D> getSlicePoints() method
    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius(){
        double radius = Math.pow(point.getX()-center.getX(),2) + Math.pow(point.getY()-center.getY(),2);
        return Math.sqrt(radius);
    }
}
