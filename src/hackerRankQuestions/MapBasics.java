package hackerRankQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBasics {

    public static void main(String[] args) {
        MapBasics mapBasics = new MapBasics();

        mapBasics.mapBasic();
    }

    public void mapBasic(){
        Map<Integer, String> rollNosName = new HashMap<>();

        // putting data in hashmap
        rollNosName.put(1, "Ankit");
        rollNosName.put(2, "Aaditya");
        rollNosName.put(3, "Pooja");
        rollNosName.put(4, "Anukul");
        rollNosName.put(5, "Aatish");

        String name = rollNosName.get(1);
        System.out.println("Name of student with rollno 1 is "+name);

        rollNosName.put(1, "Ankit Singh");
        String updatedName = rollNosName.get(1);
        System.out.println("Name of student with rollno 1 is "+updatedName);

        String notExist = rollNosName.get(100);
        if(notExist != null) {
            System.out.println("Name of student with rollno 1 is " + notExist);
        }

        // priny all the rollno along with name

        Set<Integer> allRollNos = rollNosName.keySet();
        for(Integer rollNo : allRollNos){
            String correspondingName = rollNosName.get(rollNo);
            System.out.println(rollNo + " " + correspondingName);

        }
    }

}

// pooja

