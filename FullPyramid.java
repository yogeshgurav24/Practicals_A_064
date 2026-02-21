class FullPyramid {
    public static void main(String[] args) {

        int totalRows = 5;

        for (int currentRow = 1; currentRow <= totalRows; currentRow++) {
            for (int starCount = 1; starCount <= currentRow; starCount++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
          for (int i = 5; i >= 1; i--) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

