package practiceSet.ArrayProblems;

import java.util.HashMap;
import java.util.ArrayList;
public class Occurence {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,2,5,8,9,8};
        String passage = "Jana gana mana adhinayaka, jaya he " +
                         "Bharata bhagya vidhata. " +
                         "Punjab Sindh Gujarat Maratha " +
                         "Dravida Utkala Banga " +
                         "Vindhya Himachala Yamuna Ganga " +
                         "Uchchala Jaladhi taranga. " +
                         "Tava shubha name jage, " +
                         "Tava shubha asisa mange, " +
                         "Gahe tava jaya gatha, " +
                         "Jana gana mangala dayaka jaya he " +
                         "Bharata bhagyavidhata. " +
                         "Jaya he, jaya he, jaya he, " +
                         "Jaya jaya jaya, jaya he!";
        // HashMap<Integer,Integer> ocucurenceMap= new HashMap<>();
        // getOccurence(ocucurenceMap,arr);
        HashMap<String,ArrayList<Integer>> ocucurenceMap= new HashMap<>();
        getWordOccurence(ocucurenceMap,passage);
        System.out.println(ocucurenceMap);
    }
    static void getWordOccurence(HashMap<String,ArrayList<Integer>> map,String passage)
    {
        int i =0;
        for(String word :passage.split(" "))
        {
            map.putIfAbsent(word, new ArrayList<Integer>());
            map.get(word).add(i);
            i++;
        }
    }
    static void getOccurence(HashMap<Integer,Integer> map, int[] arr)
    {
        for(int i: arr)
        {
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }

    }
}
