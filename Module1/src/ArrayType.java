public class ArrayType {
    public static void main(StringType[] args) {
        // declaring an array
        int[] marks = new int[6];
        int[] points = new int[] {1, 2, 3, 4, 5, 7};
        int[] grades = new int[5];
        grades[0] = 1;
        grades[1] = 2;
        grades[2] = 3;
        grades[3] = 4;
        grades[4] = 5;

        for (int i=0; i<points.length; i++) {
            System.out.print(points[i] + " ");
        }

        System.out.println("\n****");

        for (int value : points) {
            System.out.print(value + " ");
        }
        // this is the end of single dimentional array

        // declaring the multi dimensional array
        int shapes[][] = {
            {1, 5, 8},
            {4, 7, 9},
            {10, 33, 23}
        };
        for (int i = 0; i < shapes.length; i++) {
            System.out.println();
            for (int j = 0; j < shapes[i].length; j++) {
                System.out.print(shapes[i][j] + " ");
            }
        }
    }
}
