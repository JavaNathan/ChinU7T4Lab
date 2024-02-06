import java.util.ArrayList;

public class ArrayListAlgorithms {

    public ArrayListAlgorithms(){}

    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (String word : stringList) {
            if (word.indexOf(target) != -1) {
                return true;
            }
        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int len = intList.size();
        int sum = 0;
        for (int num : intList){
            sum += num;
        }
        double avg = (double) sum / len;
        for (int num2: intList){
            if (num2 < avg){
                newList.add(num2);
            }
        }
        int newLen = newList.size();
        return newLen;
    }
}