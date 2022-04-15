package by.itAcademy.homeworks.dataFormats;

public class Point {

    private String pointX;
    private String pointY;
    private boolean x;
    private boolean y;

    public String getPointX() {
        return pointX;
    }

    public String getPointY() {
        return pointY;
    }

    public void setPointX(String pointX) {
        this.pointX = pointX;
    }

    public void setPointY(String pointY) {
        this.pointY = pointY;
    }

    public boolean isX() {
        return x;
    }

    public boolean isY() {
        return y;
    }

    public void setX(boolean x) {
        this.x = x;
    }

    public void setY(boolean y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Point: (%spx, %spy)", pointX, pointY);
    }
}
