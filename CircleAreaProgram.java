class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircularRegionArea {
    public static void main(String[] args) {
        double innerRadius = 3;
        double outerRadius = 5;

        Circle innerCircle = new Circle(innerRadius);
        Circle outerCircle = new Circle(outerRadius);

        double areaDifference = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.println("The area of the circular region is: " + areaDifference);
    }
}
