package sorting.bubbleSort;

import java.util.Arrays;

public class StringIntegerBubbleSort {
    String names;
    int rollNumber;

    public StringIntegerBubbleSort(String names,int rollNumber) {
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
class Sorting{
    public void sort(StringIntegerBubbleSort [] names){
        for (int counter = 0; counter < names.length; counter++) {
            for (int index = 0; index < names.length-1; index++) {
                if(names[index].rollNumber > names[index+1].rollNumber){
                    StringIntegerBubbleSort temp = names[index];
                    names[index] = names[index+1];
                    names[index+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        StringIntegerBubbleSort[] stringIntegerLinearSearches =
                new StringIntegerBubbleSort[]{
                        new StringIntegerBubbleSort("Kman", 2),
        new StringIntegerBubbleSort("Naman", 1)
                };
        System.out.println(Arrays.toString(stringIntegerLinearSearches));
        Sorting sorting = new Sorting();
        sorting.sort(stringIntegerLinearSearches);
        System.out.println(Arrays.toString(stringIntegerLinearSearches));
    }

}