import java.util.TreeSet;

public class Demo {

    public static void main(String[] args) {

        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();//无参构造

        //创建学生对象，写拼音方便看
        Student s1 = new Student("xushi",29);
        Student s2 = new Student("huangzhaojun",28);
        Student s3 = new Student("diaochan",30);
        Student s4 = new Student("yangyuhuang",18);

        Student s5 = new Student("meinv",18);//年龄相同，姓名不同
        Student s6 = new Student("diaochan",15);//姓名相同，年龄不同(实现中也有同名的人嘛)
        Student s7 = new Student("diaochan",15);//姓名和姓名相同

        //把学生添加到集合
        ts.add(s1);ts.add(s2);ts.add(s3);ts.add(s4);
        ts.add(s5);ts.add(s6);ts.add(s7);

        //遍历集合
        for (Student s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}