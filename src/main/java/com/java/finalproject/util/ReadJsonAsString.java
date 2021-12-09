package com.java.finalproject.util;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJsonAsString {
    public static String readJson (String file) throws Exception {
        //String file = "MOCK_DATA_SPARCE_GRAPH.json";
        String json = readFileAsString(file);
        System.out.println(json);
        return json;
    }

    public static String readFileAsString(String file)throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
