
import student.Student;

import java.util.ArrayList;
import java.util.Comparator;

import comparators.NameComparator;
import comparators.RollNoComparator;

public class Main {
  public static void main(String[] args) {
    // Create ArrayList
    ArrayList<Student> students = new ArrayList<>();
    
    // Create Student data.
    int[] rollnos = { 
      7321, 8945, 1067, 2598, 4132, 
      8765, 9430, 5126, 6894, 3471 };
    String[] names = {
      "Isaac", "Eva", "Frank", "David", "Alice", 
      "Jack", "Charlie", "Bob", "Helen", "Grace" };
    String[] addresses = {
      "1234 Maple Street, Imaginary City, IL 56789",
      "5678 Elm Avenue, Fictional Town, CA 12345",
      "9876 Pine Lane, Make-Believe Village, TX 67890",
      "4321 Birch Road, Fantasy Heights, NY 54321",
      "8765 Cedar Court, Dreamland Springs, FL 34567",
      "2109 Oak Circle, Wonderland Junction, AZ 87654",
      "6543 Redwood Boulevard, Enchanted Grove, WA 21098",
      "1098 Spruce Drive, Mythical Meadows, CO 76543",
      "3456 Willow Street, Magic Haven, NC 89012",
      "7890 Juniper Lane, Mystic Valley, GA 45678",
    };

    // Iterate student data, create 10 student objects, and add them to ArrayList
    for (int i = 0; i < 10; i++) {
      students.add(new Student(rollnos[i], names[i], addresses[i]));
    }

    // Print students before sorting.
    System.out.println("Unsorted:");
    for (Student student : students) {
      System.out.println(String.format(
        "- Rollno: %d, Name: %s, Address: %s.", 
        student.rollno, student.name, student.address));
    }

    // Sort students by rollno.
    sortStudents(students, new RollNoComparator());

    // Print students sorted by rollno.
    System.out.println("\nSorted by rollno:");
    for (Student student : students) {
      System.out.println(String.format(
        "- Rollno: %d, Name: %s, Address: %s.", 
        student.rollno, student.name, student.address));
    }

    // Sort students by name.
    sortStudents(students, new NameComparator());

    // Print students sorted by name.
    System.out.println("\nSorted by name:");
    for (Student student : students) {
      System.out.println(String.format(
        "- Rollno: %d, Name: %s, Address: %s.", 
        student.rollno, student.name, student.address));
    }
  }


  // Selection sort method.
  public static void sortStudents(ArrayList<Student> students, Comparator comparator) {
    for (int i = 0; i < students.size(); i++) {
      for (int j = 0; j < students.size(); j++) {
        if (comparator.compare(students.get(j), students.get(i)) > 0) {
          Student s1 = students.get(i);
          Student s2 = students.get(j);
          students.set(i, s2);
          students.set(j, s1);
        }
      }
    }
  }
}