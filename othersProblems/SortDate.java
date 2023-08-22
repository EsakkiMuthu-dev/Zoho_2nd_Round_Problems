package practiceSet.othersProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DateComparator implements Comparator<String>
{

    @Override
    public int compare(String date1, String date2) {
      String[] parts1 =date1.split("/");
      String[] parts2=date2.split("/");

            // compare year
            if(!parts1[2].equals(parts2[2]))
            {
                return Integer.compare(Integer.parseInt(parts1[2]), Integer.parseInt(parts2[2]));
            }

            // compare month
            if(!parts1[1].equals(parts2[1]))
            {
                return Integer.compare(Integer.parseInt(parts1[1]), Integer.parseInt(parts2[1]));
            }

            // compare date
            return Integer.compare(Integer.parseInt(parts1[0]), Integer.parseInt(parts2[0]));
           
    }

}



public class SortDate
{
    public static void main(String[] args) {
        List<String> dates = new ArrayList<>(Arrays.asList(
            "05/12/2023",
            "15/01/2022",
            "31/03/2022",
            "02/11/2021",
            "02/01/2023"
        ));
        Collections.sort(dates,new DateComparator());

        System.out.println(dates);

    }
}