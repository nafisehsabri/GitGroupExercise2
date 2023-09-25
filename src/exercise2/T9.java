package exercise2;

public class T9 {

  /*    Create an Interface 'Shape' with undefined methods as calculate Area and calculate Perimeter.
  Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
*/
  interface Shape {
        double area();
        double perimeter();
    }
    static class Rectangle implements Shape {

        private double length;
        private double breadth;

        public Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        @Override
        public double area() {
            return length * breadth;
        }
        @Override
        public double perimeter() {
            return 2 * (length + breadth);
        }
    }
    static class Circle implements Shape {
      private double radius;
      public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
        @Override
        public double perimeter() {
          return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {

        double length = 1.0;
        double breadth = 10.5;
        Rectangle r = new Rectangle(length, breadth);
        System.out.println("Rectangle area is " + r.area());
        System.out.println("Rectangle perimeter is " + r.perimeter());

        System.out.println();

        double radius = 2.0;
        Circle c = new Circle(radius);
        System.out.println("Circle area is " + c.area());
        System.out.println("Circle perimeter is " + c.perimeter());
  }
}
