package by.itAcademy.homeworks.MyTask;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PlayerReaderTask extends Thread implements Serializable {
    public String path;
    ArrayList<Player> sortingPlayers = new ArrayList<Player>();

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
    }

    public ArrayList<Player> read() throws IOException , ClassNotFoundException ,InterruptedException {
        synchronized (path) {
            FileInputStream dis = new FileInputStream(path);
            ObjectInputStream dois = new ObjectInputStream(dis);
            ArrayList<Player> players = (ArrayList<Player>) dois.readObject();
            dois.close();
            for (Player player : players) {
                if (player.isActive() == true && player.getAge() >= 25 && player.getAge() <= 30) {
                    sortingPlayers.add(player);
                }
            }
        }
        return sortingPlayers;
    }
}
