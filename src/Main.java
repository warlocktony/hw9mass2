public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("task 1");
        int[] budget = generateRandomArray();
        int allMonthCash = 0;
        for (int i = 0; i < budget.length; i++) {
            allMonthCash += budget[i];

        }


        System.out.println("equal spend mony for month is " + allMonthCash);

    }

    public static void task2() {
        System.out.println("task 2");
        int[] budget = generateRandomArray();
        int maxCash = budget[0];
        int minCash = budget[0];
        for (int i = 0; i < budget.length; i++) {
            if (budget[i] > maxCash) {
                maxCash = budget[i];
            }
            if (budget[i] < minCash) {
                minCash = budget[i];
            }
        }
        System.out.println("minimal summa spend mony for a day equal " + minCash + " RUB.Maximal summa spend mony for a day equal " + maxCash + " RUB");


    }

    public static void task3() {
        System.out.println("task 3");
        int[] budget = generateRandomArray();

        double allMonthCash = 0;
        for (int i = 0; i < budget.length; i++) {
            allMonthCash += budget[i];
        }

        double midleCash = allMonthCash / budget.length;


        System.out.println("midle summa spend mony for month equal " + midleCash + " RUB");
    }

    public static void task4() {
        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }


    }

}