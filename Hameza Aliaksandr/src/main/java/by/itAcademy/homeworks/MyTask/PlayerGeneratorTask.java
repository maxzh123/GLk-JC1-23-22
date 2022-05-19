package by.itAcademy.homeworks.MyTask;

import java.io.*;
import java.util.ArrayList;

public class PlayerGeneratorTask extends Thread implements Serializable {
    ArrayList<Player> players = new ArrayList<Player>();
    public String path;

    public PlayerGeneratorTask(String path) {
        this.path = path;
    }

    public void run() {
        players.add(new Player("Egor", 21, false));
        players.add(new Player("Vova", 23, false));
        players.add(new Player("Vlad", 40, false));
        players.add(new Player("Sasha", 30, false));
        players.add(new Player("Pavel", 33, false));
        players.add(new Player("Sergey", 29, false));
        players.add(new Player("Platon", 36, false));
        players.add(new Player("Stas", 26, false));
        players.add(new Player("Igor", 20, false));
        players.add(new Player("Sveta", 37, false));
        try {
            write();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public String write() throws IOException{
        synchronized (path) {
            FileOutputStream doc = new FileOutputStream(path);
            ObjectOutputStream docob = new ObjectOutputStream(doc);
            docob.writeObject(players);
            docob.close();
            docob.flush();
            return path;

        }
    }
}
