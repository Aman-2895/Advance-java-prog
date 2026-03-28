package advance;
import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.marks = marks;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
}

public class StreamAPI {

    public static void main(String[] args) {

        List<Student> l1 = new ArrayList<>();
        l1.add(new Student("aman", 65));
        l1.add(new Student("anmol", 70));
        l1.add(new Student("adnan", 90));
        l1.add(new Student("anmol2", 50));

        // Print only names
        l1.stream()
          .filter(s -> s.getMarks() > 60)
          .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // Print full object
        l1.stream()
          .filter(s -> s.getMarks() > 60)
          .forEach(System.out::println);

        System.out.println("\nName\tMarks");

        // Proper formatted output
        l1.stream()
          .filter(s -> s.getMarks() > 60)
          .forEach(s -> {
              String result = String.format("%s\t%d", s.getName(), s.getMarks());
              System.out.println(result);
          });
    }
}
