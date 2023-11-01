import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person<String> stringBase = new Person<>();
        stringBase.setData("Hello, World!");
        String stringData = stringBase.getData();
        System.out.println("String Data: " + stringData);

        Person<Integer> integerBase = new Person<>();
        integerBase.setData(42);
        int integerData = integerBase.getData();
        System.out.println("Integer Data: " + integerData);

//////////////////////////////////////////////////////////////////////

        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        int age1 = scanner.nextInt();

        Person1<String> personString = new Person1<>();
        personString.setData1(name1);

        Person1<Integer> personInt = new Person1<>();
        personInt.setData1(age1);

        System.out.println("Age :" + personInt.getData());
        System.out.print("Name :" + personString.getData());

    }
}