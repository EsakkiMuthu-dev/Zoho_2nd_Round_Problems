package practiceSet.set1;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class ChildrenCount {
    public static void main(String[] args) {
        String[][] relationships = {
            {"Ram", "Syam"},
            {"Akil", "Syam"},
            {"Nikil", "Ram"},
            {"Subhash", "Ram"},
            {"Karthik", "Akil"}
        };
        HashMap<String ,List<String>> parentHashMap=new HashMap<>();
        storeRelation(parentHashMap,relationships);
        System.out.println(countGrandChildren("Syam",parentHashMap));
    }
    
    static  int countGrandChildren(String person,HashMap<String ,List<String>> parentHashMap)
    {
        int count=0;
        List<String> Childrens = parentHashMap.get(person);
        for(String child : Childrens)
        {
            if(parentHashMap.containsKey(person)){
            count+=parentHashMap.get(child).size();
        }
    }
        return count;

    }
    static void storeRelation(HashMap<String ,List<String>> parentHashMap,String[][] relationships)
    {
        for(String[] arr : relationships)
        {
            String parent=arr[1];
            String child = arr[0];
            parentHashMap.putIfAbsent(parent, new ArrayList<String>());
            parentHashMap.get(parent).add(child);
        }
    }
}
