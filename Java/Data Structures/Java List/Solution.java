
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        addElements(scan);
        executeQueries(scan);

        scan.close();
        print();
    }

    private static void addElements(Scanner scan) {
        int numberOfElements = scan.nextInt();
        for (int i = 0; i < numberOfElements; i++) {
            int number = scan.nextInt();
            numbers.add(number);
        }
    }

    private static void executeQueries(Scanner scan) {
        int numberOfQueries = scan.nextInt();
        for (int j = 0; j < numberOfQueries; j++) {
            String command = scan.next();
            if (command.equals(Command.DELETE.getValue()))
                delete(scan);
            else if (command.equals(Command.INSERT.getValue()))
                insert(scan);
        }
    }

    private static void insert(Scanner scan) {
        int index = scan.nextInt();
        int value = scan.nextInt();
        numbers.add(index, value);
    }

    private static void delete(Scanner scan) {
        int index = scan.nextInt();
        numbers.remove(index);
    }

    private static void print() {
        numbers.forEach(number -> System.out.print(number + " "));
    }

    enum Command {
        INSERT("Insert"),
        DELETE("Delete");

        Command(String value) {
            this.value = value;
        }
        private String value;

        public String getValue() {
            return value;
        }
    }
}
