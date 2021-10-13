public class BasketPlayer extends Player {
    //篮球运动员
    public BasketPlayer() {
    }

    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("篮球运动员学习");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }

}