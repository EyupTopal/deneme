package Floor;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.length = length;
        this.width = width;
        if (length < 0 || width < 0) {
            length = 0;
            width = 0;

        }
        public void getArea () {
            this (width, length);
            getArea = width * length;
        }

    }
}
