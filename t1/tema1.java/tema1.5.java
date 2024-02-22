import java.util.Scanner;

public class tema1 {
  //ex6
    public static void main(String[] args) {
        myVariables();
        Scanner numbers = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int numarul1 = numbers.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int numarul2 = numbers.nextInt();
        System.out.println("Ati introdus primul numar:" + numarul1);
        System.out.println("Ati introdus al doilea numar:" + numarul2);
        numbers.close();
    }
//ex6
    private static void myVariables() {
        int number = 2;
        System.out.println("numar intreg:" + number);
        String name = "Christi";
        System.out.println("text:" + name);
        boolean myBool = true;
        System.out.println("Boolean:" + myBool);
    }
}