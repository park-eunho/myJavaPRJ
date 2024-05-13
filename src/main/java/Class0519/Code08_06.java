package Class0519;

class Rabbit17 {
    int xPos;
    int yPos;

    void move(int x, int y){
        this.xPos =x;
        this.yPos =y;
    }
}

class HouseRabbit3 extends Rabbit17 {
    void move(int x,int y){
        this.xPos = x;
        this.yPos = y;

        if (this.xPos > 100)
            this.xPos = 100;
        if (this.yPos > 100)
            this.yPos = 100;
    }
}
class MountainRabbit3 extends Rabbit17 {

}
public class Code08_06 {
    public static void main(String[] args) {
        HouseRabbit3 hRabbit = new HouseRabbit3();
        MountainRabbit3 mRabbit = new MountainRabbit3();
    }
}