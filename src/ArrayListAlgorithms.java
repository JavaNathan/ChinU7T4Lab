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

    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList) {

    }
}