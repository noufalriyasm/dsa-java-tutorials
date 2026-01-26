public class TwoDimensionalArray {
    int[][] arr = null;

    public TwoDimensionalArray(int rows, int columns) {
        this.arr = new int[rows][columns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) { //arr[0] -first row
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    /*
    inserting an element to 2d Array
     */
    public void insertingElementToArray(int row, int column, int value) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) {
                arr[row][column] = value;
                System.out.println("element added succesfully");
            } else {
                System.out.println("this space is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of 2d array");
        }
    }

    /*
    traversing through a 2D array
     */

    public void traversing2DArray() {
        for (int[] ints : arr) { //here ints means each row
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }

    /*
    searching a value in an array
     */

    public void searchingAValueInArray(int value) {
        for (int[] ints : arr) {
            for (int arrayValue : ints) {
                if (arrayValue == value) {
                    System.out.println("value found");
                    return;
                }
            }
        }
        System.out.println("value not found");
    }
}

