import java.util.ArrayList;
public class Hi {
    public Hi(){}

    public static ArrayList<String> hello (ArrayList<String> hiString){
        ArrayList<String> newList = new ArrayList<String>();
        for (String name : hiString){
            if (name.contains("i")){
                newList.add(name);
                newList.add("hi!");
            }else{
                newList.add(name);
            }
        }
        return newList;
    }

    public static ArrayList<String> remove (ArrayList<String> removeString){
        ArrayList<String> newList = new ArrayList<String>();
        for (String name : removeString){
            if (name.length() == 5){
                newList = newList;
            }else{
                newList.add(name);
            }
        }
        return newList;
    }
}
