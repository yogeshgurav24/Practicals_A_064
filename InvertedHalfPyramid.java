class InvertedHalfPyramid {
    public static void main(String[] args) {

        int totalRows = 6;
        
        int rows = 5;
        int num = 1;

         for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
                if (num == 10) { 
                    num = 1;
                }
            }
            System.out.println();
        }

        for (int currentRow = totalRows; currentRow >= 1; currentRow--) {
            for (int starCount = 1; starCount <= currentRow; starCount++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

