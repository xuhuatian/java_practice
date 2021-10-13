public class TableCoach extends Coach implements studyEnglish{
    //乒乓球教练
    public TableCoach() {
    }

    public TableCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach(){
        System.out.println("乒乓球教练教学");
    }

    @Override
    public void eat(){
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void studyEng(){
        System.out.println("乒乓球教练学英语");
    }
}