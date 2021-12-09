package com.java.finalproject.util;
import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JsonStringToJavaObjectParser {

    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        ReadJsonAsString r = new ReadJsonAsString();
        String json = ReadJsonAsString.readJson();

        Map<String, Integer> cityIndex = new HashMap<>();
        InputListWithString[] inputList = gson.fromJson(json, InputListWithString[].class);
        int[][] finalInput = new int[inputList.length][3];

        for(int i = 0; i < inputList.length; i++){
            InputListWithString list = inputList[i];

            String start = list.getStart();
            String dst = list.getDestination();
            int price = list.getPrice();

            // Map cities to integers and store city index in hashmap
            stringToIntTransformer(start, cityIndex);
            stringToIntTransformer(dst, cityIndex);

            finalInput[i][0] = cityIndex.get(start);
            finalInput[i][1] = cityIndex.get(dst);
            finalInput[i][2] = price;
        }
        for (int[] f : finalInput) {
            System.out.println(Arrays.toString(f));
        }
//        return finalInput;
    }

    public static void stringToIntTransformer(String s, Map<String, Integer> cityIndex){
        // hashmap {city: index}
        if (cityIndex.containsKey(s)){
            return;
        }
        int index = cityIndex.size();
        cityIndex.put(s, index);
    }

}
