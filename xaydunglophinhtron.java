public class xaydunglophinhtron {

        private double radius;
        private String color;

    public static void main(String[] args) {
    }
        public xaydunglophinhtron() {

            this.radius = 0;
            this.color = "";
        }

        public xaydunglophinhtron(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return this.radius;
        }

        public double getArea() {
            return Math.PI * this.radius * this.radius;
        }
    }

