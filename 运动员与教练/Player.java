public abstract class Player extends human{
    //抽象运动员类
    public Player() {
    }
    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();

}