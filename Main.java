import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * This is a utility class that serves as a placeholder for the main method.
 *
 * @author Tony Tran
 * @version 1.0
 * @since 2025-05-18
 */
final class Main {
    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    public static void main(final String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter outputWriter = new FileWriter("output.txt");
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            if (parts.length % 2 == 0) {
                listOfStudents.add(new Student(parts[0], parts[1],
                        Integer.parseInt(parts[2]),
                        Boolean.parseBoolean(parts[3])));
                if (parts[3].equals("y")) {
                    outputWriter.write(parts[0] + " " + parts[1]
                     + " is in grade " + parts[3] + " and has an IEP.\n");
                } else {
                    outputWriter.write(
                            parts[0] + " " + parts[1] + " is in grade "
                             + parts[3] + " and does not have an IEP.\n");
                }

            } else {
                listOfStudents.add(new Student(parts[0], parts[1], parts[2],
                        Integer.parseInt(parts[3]),
                        Boolean.parseBoolean(parts[4])));
                if (parts[4].equals("y")) {
                    outputWriter.write(parts[0] + " " + parts[1] + " "
                            + parts[2] + " is in grade " + parts[3]
                            + " and has an IEP.\n");
                } else {
                    outputWriter.write(parts[0] + " " + parts[1]
                            + " " + parts[2] + " is in grade " + parts[3]
                            + " and does not have an IEP.\n");
                }
            }
        }
        outputWriter.close();
        scanner.close();
    }
}
