public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] expenses = {4500, 3200, 2800, 3900, 5600};
        int totalExpenses = 0;
        for (int i = 0; i < expenses.length; i++) {
            totalExpenses += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей");
        System.out.println("Task 2");
        int[] expenses2 = {5400, 2900, 7800, 9765};
        int maxExpenses = -1;
        int minExpenses = expenses2[0];
        for (final int current : expenses2) {
            if (current > maxExpenses) {
                maxExpenses = current;
            }
        }
        for (final int current : expenses2) {
            if (current < minExpenses) {
                minExpenses = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей." + "Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");
        System.out.println("Task 3");
        int[] expenses3 = {34543, 23456, 13356, 98635};
        int totalExpenses2 = 0;
        for (int i = 0; i < expenses3.length; i++) {
            totalExpenses2 += expenses3[i];
        }
        double averageExpense = totalExpenses2 / (double)expenses3.length;
        System.out.printf("Средняя сумма трат за месяц составила " + averageExpense + " рублей");
        System.out.println();
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        int length = reverseFullName.length;
        for (int i = length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}