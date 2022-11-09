import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("What is your surname?  ");
        String surname = scanner.nextLine();

        System.out.println("What is your height? ");
        double height = scanner.nextDouble();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        Person personDetail = new Person(name,surname,height,age);{

        }
        System.out.println("Person details: " +
                "\nName: "  + personDetail.getName() +
                "\nSurname: " + personDetail.getSurname() +
                "\nHeight: " + personDetail.getHeight() +
                "\nAge: " + personDetail.getAge());
    }

}