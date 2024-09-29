package comparators;

import java.util.*;
import student.Student;

public class NameComparator implements Comparator {
  public int compare(Object obj1, Object obj2) {
    Student s1 = (Student)obj1;
    Student s2 = (Student)obj2;

    return s1.name.compareTo(s2.name);
  };
}