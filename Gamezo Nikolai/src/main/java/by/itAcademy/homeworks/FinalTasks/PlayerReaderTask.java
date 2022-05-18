package by.itAcademy.homeworks.FinalTasks;

import java.io.*;
import java.util.ArrayList;

public class PlayerReaderTask extends Thread implements Serializable {
    public String path;
    ArrayList<Player> sortPlayers = new ArrayList<>();
    public PlayerReaderTask(String path) {
        this.path = path;
    }
    public void run() {
        try {
            read();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sortPlayers);
    }

    public ArrayList<Player> read() throws IOException, ClassNotFoundException, InterruptedException {
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
