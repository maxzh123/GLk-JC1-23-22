package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.io.Task47;

import java.io.*;

public class FileHandler {



        private String fileName;

        public FileHandler(String fileName) {
            this.fileName = fileName;
        }

        public String getFileName() {
            return fileName;
        }

        public String getFilePath() {
            return String.valueOf(getClass().getResource("itAcademy\\homeworks\\threads"+fileName));
        }

        public String readFile() {
            String fileData = "";
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFilePath()))) {
                String str = bufferedReader.readLine();
                while (str != null) {
                    fileData += str + "\n";
                    str = bufferedReader.readLine();
                }
                System.out.print("Файл успешно прочитан. Содержимое файла:\n" + fileData + "\n");
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден: " + fileName);
            } catch (IOException e) {
                System.out.println("Ошибка. Что-то не так с файлом: " + fileName);
            }
            return fileData;
        }

        public void fileWrite(String str) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFilePath()))) {
                bw.write(str);
                System.out.println(getFilePath());
                System.out.println("Запись в файл " + fileName + " произведена успешно.");
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден: " + fileName);
            } catch (IOException e) {
                System.out.println("Ошибка. Что-то не так с файлом: " + fileName);
            }
        }
    }

