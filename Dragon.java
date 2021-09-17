package quickMafs;

public class Dragon {

    public Dragon(){}

    public Dragon(String name, String scaleColor, Integer wingSpan){
        this.name =name;
        this.scaleColor=scaleColor;
        this.wingSpan = wingSpan;
    }
public String name;                //Add to.string method
public String scaleColor;
public Integer wingSpan;

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", scaleColor='" + scaleColor + '\'' +
                ", wingSpan=" + wingSpan +
                '}';
    }
}
