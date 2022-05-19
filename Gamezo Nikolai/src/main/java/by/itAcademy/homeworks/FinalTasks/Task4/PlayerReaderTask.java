package by.itAcademy.homeworks.FinalTasks.Task4;

import java.io.*;
import java.util.ArrayList;

public class PlayerReaderTask extends Thread {
    public String path;
    ArrayList<Player> sortPlayers = new ArrayList<>();

    public PlayerReaderTask(String path) {
        this.path = path;
    }
    public void run() {
        try {
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Player> readFromFile() throws IOException, ClassNotFoundException, InterruptedException {
        synchronized (path) {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            ArrayList<Player> players = (ArrayList<Player>) ois.readObject();
            ois.close();
            for (Player player : players) {
                if (player.isActive() == true && player.getAge() >= 25 && player.getAge() <= 30) {
                    sortPlayers.add(player);
                }
            }
            return sortPlayers;
        }
    }
}
