public class xaydunglopmota {
    public class Temperature {
        private double value;
        private char scale;

        public Temperature(double value, char scale) {
            this.value = value;
            this.scale = scale;
        }

        public double getValue() {
            return value;
        }

        public char getScale() {
            return scale;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public void setScale(char scale) {
            this.scale = scale;
        }

        public double getFahrenheit() {
            if (scale == 'C') {
                return (value * 9 / 5) + 32;
            } else if (scale == 'K') {
                return (value - 273.15) * 9 / 5 + 32;
            } else {
                return value;
            }
        }

        public double getCelsius() {
            if (scale == 'F') {
                return (value - 32) * 5 / 9;
            } else if (scale == 'K') {
                return value - 273.15;
            } else {
                return value;
            }
        }

        public double getKelvin() {
            if (scale == 'F') {
                return (value + 459.67) * 5 / 9;
            } else if (scale == 'C') {
                return value + 273.15;
            } else {
                return value;
            }
        }

        public String toString() {
            return value + " " + scale;
        }
    }

}
