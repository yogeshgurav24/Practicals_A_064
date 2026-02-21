class OddNumbers {
    public static void main(String[] args) {

        int minimumOdd = 101;
        int maximumOdd = 0;
        int sumOfOddNumbers = 0;

        System.out.println("Odd numbers between 1 and 100:");

        for (int number = 1; number <= 100; number++) {
            if (number % 2 != 0) {
                System.out.print(number + " ");

                sumOfOddNumbers += number;

                if (number < minimumOdd) {
                    minimumOdd = number;
                }

                if (number > maximumOdd) {
                    maximumOdd = number;
                }
            }
        }

        System.out.println("\n\nMinimum odd number: " + minimumOdd);
        System.out.println("Maximum odd number: " + maximumOdd);
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);

        
        
        System.out.println("\nOdd Numbers Analysis (1 to 50):");

        int[] oddNumbers = new int[25];
        int index = 0;
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
                sum += i;
                index++;
            }
        }

        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.print("\nThree Minimum Odd Numbers: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.print("\nThree Maximum Odd Numbers: ");
        for (int i = oddNumbers.length - 3; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        double average = (double) sum / oddNumbers.length;
        System.out.println("\nAverage of Odd Numbers: " + average);
    
    }
}


