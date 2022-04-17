package by.itAcademy.homeworks.dataFormats;

import java.util.Locale;

public class Point {
    private PointState state=null;

    private Integer pointX=null;
    private Integer pointY=null;
    public int getPointX() {
        return pointX;
    }
    public int getPointY() {
        return pointY;
    }
    public boolean isReady(){
        return state==PointState.ERROR||state==PointState.FINISH;
    }
    public void setData(String data){
        if (data==null || data.trim().equals("")) return ;// Игнорируем пустые значения
        if(state==PointState.SET_X ){
            pointX=Integer.valueOf(data.trim());
        }else if(state==PointState.SET_Y ){
            pointY=Integer.valueOf(data.trim());
        }
    }
    public void takeStart(String tag){
        if (tag==null || tag.trim().equals("")) return ;// Игнорируем пустые значения
        if (tag.toLowerCase().equals("point")){
            state=PointState.FILLING;
        }else if (tag.toLowerCase().equals("x")){
            state=PointState.SET_X;
        }else if (tag.toLowerCase().equals("y")){
            state=PointState.SET_Y;
        }else {
            state=PointState.ERROR;
        }
    }
    public void takeEnd(String tag){
        if (tag==null || tag.trim().equals("")) return ;// Игнорируем пустые значения
        if (tag.toLowerCase().equals("point")){
            if(state==PointState.READY ) {
                state = PointState.FINISH;
            }else{
                state = PointState.ERROR;
            }
        }else if (tag.toLowerCase().equals("x")){
            if(state==PointState.SET_X ) {
                if (pointX == null) {
                    state = PointState.ERROR;
                }else{
                    state = (pointX == null) ? PointState.FILLING : PointState.READY;
                }
            }
        }else if (tag.toLowerCase().equals("y")){
            if(state==PointState.SET_Y ) {
                if (pointY == null) {
                    state = PointState.ERROR;
                }else {
                    state = (pointX == null) ? PointState.FILLING : PointState.READY;
                }
            }
        }else {
            state = PointState.ERROR;
        }
    }


    @Override
    public String toString() {
        return state==PointState.FINISH?String.format("Point: (%dpx, %dpy)", pointX, pointY):"Точка не корректна";
    }
}
