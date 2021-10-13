public class TablePlayer extends Player implements studyEnglish{
    //乒乓球运动员类
    public TablePlayer() {
    }

    public TablePlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("乒乓球运动员学习");
    }

    @Override
    public void eat(){
        System.out.println("乒乓球运动员吃东西");
    }

    @Override
    public void studyEng(){
        System.out.println("乒乓球运动员学英语");
    }
}