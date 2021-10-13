public abstract class Coach extends human{
    //抽象教练类
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

}