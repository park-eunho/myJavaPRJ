package Class0520;

abstract class Rabbit45 {
    int xPos;
    int yPos;

    void main(int x,int y){
        this.xPos = x;
        this.yPos = y;
    }

    abstract void sleep();
}

class HouseRabbit45 extends Rabbit45{
    void sleep() {
        System.out.println("집토끼가 우리에서 잠자고 있습니다.");
    }
}

class MountainRabbit45 extends Rabbit45 {
    void sleep() {
        System.out.println("산토끼가 굴속에서 잠자고 있습니다.");
    }
}

public class Code08_08 {
    public static void main(String[] args) {
        HouseRabbit45 hRabbit = new HouseRabbit45();
        MountainRabbit45 mRabbit = new MountainRabbit45();

        hRabbit.sleep();
        mRabbit.sleep();
    }
}
