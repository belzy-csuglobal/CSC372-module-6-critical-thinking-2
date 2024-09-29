package comparators;

import java.util.*;
import student.Student;

public class RollNoComparator implements Comparator {
  public int compare(Object obj1, Object obj2) {
    Student s1 = (Student)obj1;
    Student s2 = (Student)obj2;

    if (s1.rollno > s2.rollno) return 1;
    if (s1.rollno < s2.rollno) return -1;
    return 0;
  };
}