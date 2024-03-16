package sorting.bubbleSort;

import java.util.Arrays;

public class StringBubbleSort {
    public void sort(String [] names){
        for (int counter = 0; counter < names.length; counter++) {
            for (int index = 0; index < names.length-1; index++) {
                if(names[index].compareTo(names[index+1])>0){
                    String temp = names[index];
                    names[index] = names[index+1];
                    names[index+1] = temp;

                }

            }
        }
    }

    public static void main(String[] args) {
        String [] names = new String[]{"Hello","World!","Welcome","Java"};
        StringBubbleSort stringBubbleSort = new StringBubbleSort();
        stringBubbleSort.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
