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
        int[] arr = generateRandomArray();
        int allMonthCash = 0;
        for (int i = 0; i < arr.length; i++) {
            allMonthCash += arr[i];

        }


        System.out.println("equal spend mony for month is " + allMonthCash);

    }

    public static void task2() {
        System.out.println("task 2");
        int[] arr = generateRandomArray();
        int maxCash = arr[0];
        int minCash = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxCash) {
                maxCash = arr[i];
            }
            if (arr[i] < minCash) {
                minCash = arr[i];
            }
        }
        System.out.println("minimal summa spend mony for a day equal " + maxCash + " RUB.Maximal summa spend mony for a day equal " + minCash + " RUB");


    }

    public static void task3() {
        System.out.println("task 3");
        int[] arr = generateRandomArray();

        int allMonthCash = 0;
        for (int i = 0; i < arr.length; i++) {
            allMonthCash += arr[i];
        }
        int dayInMonth = 30;
        double midleCash = allMonthCash / dayInMonth;


        System.out.println("midle summa spend mony for month equal " + midleCash + " RUB");
    }

    public static void task4() {
        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1 ; i >= 0 ; i --){
            System.out.print(reverseFullName[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }




        }

    }