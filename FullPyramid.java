class FullPyramid {
    public static void main(String[] args) {

        int totalRows = 5;

        for (int currentRow = 1; currentRow <= totalRows; currentRow++) {
            for (int starCount = 1; starCount <= currentRow; starCount++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

