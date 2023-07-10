package OpenClosed;

public class Open_Closed {
    interface Shape {
        double calculateArea();
    }

    class Rectangle implements Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public double calculateArea() {
            return width * height;
        }
    }

    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

        }

