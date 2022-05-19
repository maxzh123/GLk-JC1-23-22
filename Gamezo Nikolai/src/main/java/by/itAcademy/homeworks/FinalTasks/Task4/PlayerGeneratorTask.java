package by.itAcademy.homeworks.FinalTasks.Task4;

import java.io.*;
import java.util.ArrayList;

public class PlayerGeneratorTask extends Thread implements Serializable {
    ArrayList<Player> players = new ArrayList<Player>();
    public String path;

    public PlayerGeneratorTask(String path) {
        this.path = path;
    }

    public void run () {
        players.add(new Player("Vlad", 40, false));
        players.add(new Player("Artur", 30, false));
        players.add(new Player("Aksana", 29, false));
        players.add(new Player("Ura", 25, true));
        players.add(new Player("Denis", 26, true));
        players.add(new Player("Nikolai", 27, true));
        players.add(new Player("Aliaksandr", 28, true));
        players.add(new Player("Aliaksei", 22, true));
        players.add(new Player("Lyesha", 21, true));
        players.add(new Player("Roman", 20, false));
        try {
            write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String write () throws IOException {
        synchronized (path) {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(players);
            oos.close();
            oos.flush();
            return path;
        }
    }
}
