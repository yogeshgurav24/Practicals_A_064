class InvertedHalfPyramid {
    public static void main(String[] args) {

        int totalRows = 6;

        for (int currentRow = totalRows; currentRow >= 1; currentRow--) {
            for (int starCount = 1; starCount <= currentRow; starCount++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

