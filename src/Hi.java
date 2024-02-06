import java.util.ArrayList;
public class Hi {
    public Hi(){}

    public static ArrayList<String> hello (ArrayList<String> hiString){
        ArrayList<String> newList = new ArrayList<String>();
        for (String name : hiString){
            if (name.indexOf("i") != -1){
                newList.add(name);
                newList.add("hi");
            }else{
                newList.add(name);
            }
        }
        return newList;
    }
}
