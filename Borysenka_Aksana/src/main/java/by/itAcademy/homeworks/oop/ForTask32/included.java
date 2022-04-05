package by.itAcademy.homeworks.oop.ForTask32;

public abstract class included {

    private boolean isOn;

    public void on (){
        this.isOn = true;
    }

    public void off (){
        this.isOn = false;
    }

    public boolean getState(){
        return isOn;
    }

}
