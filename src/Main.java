public class Main {

    public static void main(String[] args) {

        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("First array:");

        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.println();


        for (int i = 0; i < numbers.length / 2; i++)
        {

            if (numbers[i] > numbers[numbers.length - 1 - i]) {

                int temp = numbers[i];

                numbers[i] = numbers[numbers.length - 1 - i];

                numbers[numbers.length - 1 - i] = temp;
            }
        }

        System.out.println("swapped array:");

        for (int number : numbers)
        {

            System.out.print(number + " ");

        }
    }
}
