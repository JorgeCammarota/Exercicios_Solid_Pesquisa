package LiskovSubstitution;

public class Liskov_Substitution {
    class Rectangle {
        protected int width;
        protected int height;

        public void setWidth(int width) {
            this.width = width;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public int calculateArea() {
            return width * height;
        }
    }

    class Square extends Rectangle {
        public void setWidth(int width) {
            this.width = width;
            this.height = width;
        }

        public void setHeight(int height) {
            this.width = height;
            this.height = height;
        }
    }


}
