package sorting.bubbleSort;

import java.util.Arrays;

public class StudentBubbleSort {
    String names;
    int rollNumber;

    public StudentBubbleSort(String names,int rollNumber) {
        this.names = names;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "StringIntegerLinearSearch{" +
                "names='" + names + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
class Student{
    public void sort(StudentBubbleSort [] names){
        for (int counter = 0; counter < names.length; counter++) {
            for (int index = 0; index < names.length-1; index++) {
                if(names[index].rollNumber > names[index+1].rollNumber){
                    StudentBubbleSort temp = names[index];
                    names[index] = names[index+1];
                    names[index+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        StudentBubbleSort [] studentBubbleSort = new StudentBubbleSort[]{
                new StudentBubbleSort("Harry",4),
                new StudentBubbleSort("Potter",1),
                new StudentBubbleSort("Hermione",2)
        };
        System.out.println(Arrays.toString(studentBubbleSort));
        Student student = new Student();
        student.sort(studentBubbleSort);
        System.out.println(Arrays.toString(studentBubbleSort));
    }
}