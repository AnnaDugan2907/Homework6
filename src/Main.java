//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        for(int i = 1; i <= 10;  i++ ){
            System.out.print(i + " ");
        }

        System.out.println(" ");

        //Задача 2
        for(int a = 10; a >= 1;  a-- ){
            System.out.print(a + " ");
        }

        System.out.println(" ");

        //Задача 3
        for(int f = 0; f <= 17;  f = f + 2 ){
            int e = f % 2;
            int evenNumbers = f;
            System.out.print(evenNumbers + " ");
        }

        System.out.println(" ");

        //Задача 4
        for (int b = 10; b >= -10; b = b - 1){
            System.out.print(b + " ");
        }

        System.out.println(" ");

        //Задача 5
        for (int y = 1904; y <= 2096; y = y + 4){
            System.out.print(y + " ");
        }

        System.out.println(" ");

        //Задача 6
        for (int s = 0; s <= 98; s = s + 7){
            System.out.print(s + " ");
        }

        System.out.println(" ");

        //Задача 7
        for (int m = 1; m <= 512; m = m * 2){
            System.out.print(m + " ");
        }

        System.out.println(" ");

        //Задача 8
        int one = 29000;
        int result = 0;

        for (int e = 1; e <= 12; e++){
            result = result + one;
            System.out.println("Месяц " + e + ",сумма накоплений равна " + result + " рублей");
        }

        System.out.println(" ");

        //Задача 9
        int first = 29000;
        int total = 0;
        for (int t = 1; t <= 12; t++){
            total += first;
            total = total + first / 100;
            System.out.println("Месяц " + t + ",сумма накоплений равна " + total + " рублей");
        }

        System.out.println(" ");

        //Задача 10
        for (int mult = 1; mult <= 10; mult++){
            System.out.println("2*" + mult + "=" + mult*2);
        }

    }
}