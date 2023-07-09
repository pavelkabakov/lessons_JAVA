package sem_5;

import java.util.HashMap;
import java.util.Map;

public class Ex001_Passport {

    private Map<String, String> map = new HashMap<>();

    void add(String passNum, String lastName){
        map.put(passNum, lastName);
    }

    String getByPassNum(String passNum){
        return passNum + " : " + map.get(passNum);
    }

    String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append(" \n ");

            }
        }
        return stringBuilder.toString();
    }

    String getAll_1(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");

        }
        return stringBuilder.toString();
    }
    String getAll_2(){
        return map.toString();
    }



}
