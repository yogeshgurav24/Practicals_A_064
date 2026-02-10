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
    }
}

