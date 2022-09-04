public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int start = 10;
        for (start = 10; start < 0; start = -1) {
            System.out.println(i);
        }
        int a = 1;
        for (a = 1; a <= 31 && a>=1; a = a + 7) {
            System.out.println("Сегодня пятница " + a  + "-е число. Необходимо подготовить отчет");
        }
        int f = 2022;
        int b = f - 200;
        int d = f + 100;
        int c = 0;
        for (c = 0;c>b && c<d ; c= c + 79) {
            System.out.println("комета пролетит" + c + "году");

        }
    }
}