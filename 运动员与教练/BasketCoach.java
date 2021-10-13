public class BasketCoach extends Coach{
    //篮球教练
    public BasketCoach() {
    }

    public BasketCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("篮球教练进行教学");
    }

    @Override
    public void eat(){
        System.out.println("篮球教练吃饭");
    }
}