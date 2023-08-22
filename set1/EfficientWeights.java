package practiceSet.set1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
class Weights implements Comparable<Weights>{
        int val;
        int weight;

        public Weights(int val , int weight)
        {
            this.val = val;
            this.weight = weight;
        }

        @Override
        public int compareTo(Weights obj) {
            return this.weight - obj.weight;
        }
   
}

public class EfficientWeights {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 36, 54,89,12));
        calculateWeight(set);

    }
    static void calculateWeight(Set<Integer> set)
    {
        List<Weights> weightsList = new ArrayList<>();
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext())
        {
            int a = iter.next();
            int weight =0;
            if(isPerfectSquare(a)) weight+=5;
            if((a%4==0) && (a%6==0)) weight+=4;
            if(a%2==0) weight+=3;
            weightsList.add( new Weights(a, weight));
        }
        Collections.sort(weightsList);
         
    }
    public static boolean isPerfectSquare(int n){
        return Math.sqrt(n) == Math.floor(Math.sqrt(n));
    }

   
}
 


