package by.itAcademy.homeworks.dataFormats;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

/**
 *Напишите программу, которая будет разбирать json файл:
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
 * и выводить его на экран в текстовом виде.
 */

public class Task76 {
    public static void main(String[] args) throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("Korotkevich Lyesha/src/main/resources/Task76.json"));
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            Worker worker = objectMapper.readValue(jsonData, Worker.class);
            System.out.println(worker+"\n");
            System.out.println(objectMapper.writeValueAsString(worker));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
