package by.itAcademy.homeworks.dataFormats;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class Task76 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            Map<String, Object> jsonMap = mapper.readValue(Task76.class.getClassLoader().getResourceAsStream("jsontest.json"), Map.class);
            for (String key : jsonMap.keySet()) {
                System.out.println(key + "->" + jsonMap.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
