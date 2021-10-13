public class Demo {
    public static void main(String[] args){
        //创建乒乓球运动员对象
        TablePlayer tp = new TablePlayer();
        tp.setName("张三");
        tp.setAge(30);
        System.out.println(tp.getName()+","+tp.getAge());
        tp.eat();
        tp.study();
        tp.studyEng();
        System.out.println("-----------------");

        //创建篮球运动员对象
        BasketPlayer bp = new BasketPlayer();
        bp.setName("李四");
        bp.setAge(35);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("-----------------");

        //创建乒乓球教练
        TableCoach tc = new TableCoach();
        tc.setName("王五");
        tc.setAge(50);
        System.out.println(tc.getName()+","+tc.getAge());
        tc.eat();
        tc.teach();
        tc.studyEng();
        System.out.println("-----------------");

        //创建篮球教练
        BasketCoach bc = new BasketCoach();
        bc.setName("赵六");
        bc.setAge(55);
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.teach();
        System.out.println("-----------------");
    }
}
