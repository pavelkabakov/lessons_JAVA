package dz_5;

import java.util.HashMap;
import java.util.Map;

public class myPhoneBook {

    private Map<String, String> phonebook = new HashMap<>();

    void add(String phoneNum, String lastName){
        phonebook.put(phoneNum, lastName);
    }
    String getByPhoneNum(String phoneNum){
        return phoneNum + " : " + phonebook.get(phoneNum);
    }
    String getByName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                phonebook.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append(" \n ");
            }
        }
        return stringBuilder.toString();
    }
    String getAll_sorted(){
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, Integer> sort_Name = new HashMap<>(); // создал HashMap с ключами - фио и кол-вом номеров
        for (Map.Entry entry:
                phonebook.entrySet()) {
            if (sort_Name.containsKey(entry.getValue()))
                sort_Name.put((String) entry.getValue(), sort_Name.get(entry.getValue()) + 1);
            else {
                sort_Name.putIfAbsent((String) entry.getValue(), 1);
            }
        }
        int max = 1; // находим максимальное число номеров на одно фио
        for (Map.Entry entry: sort_Name.entrySet()){

            if ((int) entry.getValue() >= max){
                max = (int) entry.getValue();
            }

        }
//        System.out.println("max = " + max);
        while (max !=0 ){ // теперь пробегаемся по словарю и выводим пофамильно, уменьшая max
            for (Map.Entry entry: sort_Name.entrySet()){
                if ((int) entry.getValue() == max){
                    for (Map.Entry entry1: phonebook.entrySet()){
                        if (entry.getKey().equals(entry1.getValue())){
                            stringBuilder.append(entry1.getKey());
                            stringBuilder.append(" : ");
                            stringBuilder.append(entry1.getValue());
                            stringBuilder.append("\n");
                        }
                    }
                }
            }
//            System.out.println("max = " + max);
            max = max - 1;
        }
//        for (Map.Entry entry:
//                sort_Name.entrySet()) {
//            stringBuilder.append(entry.getKey());
//            stringBuilder.append(" : ");
//            stringBuilder.append(entry.getValue());
////            stringBuilder.append("\n");
//        }
        return stringBuilder.toString();

    }
    String getAll(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                phonebook.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(" : ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
//    String getAll_2(){
//        return phonebook.toString();
//    }

}
