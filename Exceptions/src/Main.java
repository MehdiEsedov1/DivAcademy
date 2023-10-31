import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //try,catch,multi try-catch

        try {

            System.out.println(5 / 0);
            System.out.println("Bu setir islemir.");

        } catch (ArithmeticException e) {

            e.printStackTrace(); //Bu bir başa error-un özünü verir .
            System.out.println(e.getMessage()); //Bu sadəcə error-un mesajını verir .
            System.out.println(e.toString()); //Bu error-u string şəklində verir .

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Index yoxdur.");

        } finally {
            System.out.println("Finally text..."); // Bu block ne olursa olsun çalışır .
        }

        //throw and throws

        String userName = "Mehdi";
        String inputUserName = scanner.next();

//        if (!userName.equals(inputUserName)) {
//            throw new RuntimeException("Input is wrong !!!"); //Öz error-umuzu yatarmağ üçündür .
//        } else {
//            System.out.println("Input is true !!!");
//        }

        if (!userName.equals(inputUserName)) {
            throw new UserNotFond(); //Öz error-umuzu yatarmağ üçündür amma classlar ilə.
        }
    }
}