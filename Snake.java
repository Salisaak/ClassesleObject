package quickMafs;

public class Snake {


        public Snake(){}

        public Snake(String name, Integer length, String venomLevel, String color){
            this.name =name;
            this.color=color;
            this.length = length;
            this.venomLevel = venomLevel;
        }
        public String name;                //Add to.string method
        public String color;
        public Integer length;
        public String venomLevel;

    @Override
    public String toString() {
        return "Snake{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", length=" + length +
                ", venomLevel='" + venomLevel + '\'' +
                '}';
    }
}
