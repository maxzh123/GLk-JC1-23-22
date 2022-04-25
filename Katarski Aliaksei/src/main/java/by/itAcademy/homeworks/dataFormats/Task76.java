package by.itAcademy.homeworks.dataFormats;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Map;

/**
 * Напишите программу, которая будет разбирать json файл:
 * ```
 *        {
 * 	 "id": 123,
 * 	 "name": "Tester",
 * 	 "permanent": true,
 * 	 "address": {
 * 	 "street": "Skryganova",
 * 	 "city": "Minsk",
 * 	 "zipcode": 220000
 *     },
 * 	 "phoneNumbers": [
 * 	 123456,
 * 	 987654
 * 	 ],
 * 	 "role": "Manager",
 * 	 "cities": [
 * 	 "Minsk",
 * 	 "Grodno"
 * 	 ]* 	}
 * ```
 * > и выводить его на экран в текстовом виде.
 */
public class Task76 {
    public static void main(String[] args) {
        ObjectMapper mapper=new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
        try {
            Map<String,Object> jsonMap=mapper.readValue(Task76.class.getClassLoader().getResourceAsStream("forTask76"),Map.class);
            for(String  key: jsonMap.keySet()){
                System.out.println(key+" "+jsonMap.get(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
