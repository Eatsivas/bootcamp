package points;

public class Points {

    public static void main(String[] args) {

    }

    class Point2D {

        private int x;
        private int y;

        public Point2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void printPoint() {
            System.out.println("printing 2D point");
        }

    }

    class Point3D extends Point2D {

        private int z;

        public Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
         @Override
        public void printPoint() {
            System.out.println("printing 3D point");
        }
    }

}
