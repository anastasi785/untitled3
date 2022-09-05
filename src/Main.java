public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int start = 10;
        for (start = 10; start <= 10 && start >= 0; start--) {
            System.out.println(start);
        }
        int a = 1;
        for (a = 1; a <= 31 && a >= 1; a = a + 7) {
            System.out.println("Сегодня пятница " + a + "-е число. Необходимо подготовить отчет");
        }
        int currentYear = 2022;
        int oldYear = currentYear - 200;
        int nextYear = currentYear + 100;
        for (int c = 79; c <= nextYear; c = c+79) {
            if (c >= oldYear) {
                System.out.println(c);

            }
        }
    }
}