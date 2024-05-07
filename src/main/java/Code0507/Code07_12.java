package Code0507;

class Rabbit4 {
    private String shape;
    private int xPos;
    private int yPos;

    void setxPosition(int x, int y){
        xPos = x;
        yPos = y;
    }
}
public class Code07_12 {
    public static void main(String[] args) {
        Rabbit4 rabbit = new Rabbit4();

        rabbit.setxPosition(100,200);
    }
}