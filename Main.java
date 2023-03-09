public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int n = 60; // задане ціле число
        if (n > 50 && n <= 100) {
            System.out.println("Число " + n + " міститься в проміжку (50; 100)");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (50; 100)");

        }
        System.out.println("\n");
        System.out.println("Завдання 2");
        int n1 = 527;
        int a = n1 / 100;
        int b = n1 / 10 % 10;
        int c = n1 % 10;
        System.out.println(n1);

        if ((a > b) & (a > c)) {
            System.out.println("найбільше число 5");
        }
        else if((b > a) & (b > c)) {
            System.out.println("найбільше число 2");
        }
        else if((c > a) & (c > b)) {
            System.out.println("найбільше число 7");
        }
        else if((c == a) & (a == b)) {
            System.out.println("всі числа рівні");
        }
        System.out.println("\n");

        System.out.println("Завдання 3");

        String up_down = "down";
        int floor = 2;
        if (up_down == "up") {
            if (floor == 1) {
                System.out.println("ви піднялися " + floor);
            }
        } else if (floor == 2) {
            System.out.println("ви піднялися " + ++floor);
        } else if (floor == 3) {
            System.out.println("ви піднялися " + floor);
        } else if (floor == 4) {
            System.out.println("ви піднялися " + floor);
        } else if (floor == 5) {
            System.out.println("ви піднялися " + floor);
        } else if (floor == 6) {
            System.out.println("ви піднялися " + floor);
        } else if (floor == 7) {
            System.out.println("ви піднялися " + floor);
        } else if (floor == 8) {
            System.out.println("ви піднялися " + floor);
        } else if (floor == 9) {
            System.out.println("ви піднялися " + floor);
        } else {
            System.out.println("ви вказали неіснуючий " + floor);
        }
        System.out.println("\n");
        System.out.println("Завдання 4");

        String yes_no ="switch";
        switch (yes_no){
            case "Так":
                System.out.println("я погоджуюсь");
                break;
            case "OK":
                System.out.println("я погоджуюсь");
                break;
            case "Yes":
                System.out.println("я погоджуюсь");
                break;
            case "+":
                System.out.println("я погоджуюсь");
                break;
            case "Y":
                System.out.println("я погоджуюсь");
                break;
            case "Ok":
                System.out.println("я погоджуюсь");
                break;
            case "Hi":
                System.out.println("я відмовляюсь");
                break;
            case "NO":
                System.out.println("я відмовляюсь");
                break;
            case "N":
                System.out.println("я відмовляюсь");
                break;
            case "-":
                System.out.println("я відмовляюсь");
                break;
            case "No":
                System.out.println("я відмовляюсь");
                break;

        }





    }
}













