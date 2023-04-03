import java.util.Date;

public class GeoObj {

    private String color;
    private boolean filled;

    public GeoObj(){}
    public GeoObj(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color1){
        color = color1;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled1){
        filled=filled1;
    }


    public String ToString(){
        return "a7a";
    }

}
