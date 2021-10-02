import java.util.ArrayList;
import java.util.Scanner;

public class stdutendemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<student> arr = new ArrayList<student>();
        int c = 0;
        do{

            menu();
            c = input.nextInt();
            switch(c){
                case 1:
                    addStudent(arr);
                    break;
                case 2:
                    deleteStudent(arr);
                    break;
                case 3:
                    updateStudent(arr);
                    break;
                case 4:
                    findStudent(arr);
                    break;
                case 0:
                    System.out.println("谢谢使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的选项！");
                    break;
            }


        }while(c != 0);




    }
    //打印菜单
    public static void menu(){
        System.out.println("—————————欢迎来的学生管理系统—————————");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("0.退出系统");
        System.out.print("请输入你的选择：");
    }
    //添加学生信息
    public static void addStudent(ArrayList<student> arr){

        Scanner input = new Scanner(System.in);

        String sid;//学号
        //判断学生学号是否重复
        boolean flag = true;//用于do……whlie循环
        do {
            System.out.print("请输入要添加的学生学号：");
            sid = input.nextLine();
            int i = 0;
            //遍历列表，查找相同学号
            for (i = 0; i < arr.size(); i++) {
                if (arr.get(i).getSid().equals(sid)) {
                    System.out.println("学生学号已被占用，请重新输入正确的学号！");
                    break;
                }
            }
            if(i == arr.size())//整个列表都没有相同的学号时
                flag = false;

        }while(flag);


        //输入该学生的其信息
        System.out.print("请输入要添加的学生姓名：");
        String name = input.nextLine();
        System.out.print("请输入要添加的学生年龄：");
        String age = input.nextLine();
        System.out.print("请输入要添加的学生地址：");
        String address = input.nextLine();

        //用得到的数据创建学生
        student s = new student(sid,name,age,address);
        //添加进列表，并接受添加成功的信息
        boolean b = arr.add(s);

        //判断是否添加成功
        if(b)
            System.out.println("添加成功");
        else
            System.out.println("添加失败");
    }

    //查找所有学生信息
    public static void findStudent(ArrayList<student> arr){
        //如果列表没有信息的话
        if(arr.size() == 0){
            System.out.println("无消息，请添加信息，再查询");
            return;
        }

        int i = 0;
        //打印表头，-t其实就是tab键的位置
        System.out.println("学号\t\t姓名\t\t年龄\t\t地址");

        //打印列表
        for (i = 0;i < arr.size();i++){
            //取出数据
            student s = arr.get(i);
            //打印数据
            System.out.println(s.getSid()+"\t\t"+s.getName()+"\t\t"+s.getAge()+"岁\t"+s.getAddress());
        }

    }

    //删除学生信息
    public static void deleteStudent(ArrayList<student> arr){
        //如果没有学生可以删除的话
        if(arr.size() == 0){
            System.out.println("没有学生可供删除");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("请输入要删除的学生的学号：");
        String sid = input.nextLine();

         //查找学生
        for (int i = 0; i < arr.size(); i++) {
            student s = arr.get(i);
            boolean b = s.getSid().equals(sid);
            if(b){
                arr.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("没有找到对应学生");
        return;

    }

    //修改学生信息
    public static void updateStudent(ArrayList<student> arr){
        //如果没有学生可以修改的话
        if(arr.size() == 0){
            System.out.println("没有学生可供删除");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("请输入要修改的学生的学号：");
        String sid = input.nextLine();

        int i = 0;//要查找学生的对应索引号
        //查找学生
        for (i = 0; i < arr.size(); i++) {
            student s = arr.get(i);
            boolean b = s.getSid().equals(sid);
            if(b)
                break;
        }

        //如果没有找到对应学生
        if(i == arr.size()){
            System.out.println("没有找到对应学生");
            return;
        }

        //学生新信息
        System.out.print("请输入学生的新姓名：");
        String name = input.nextLine();
        System.out.print("请输入学生的新年龄：");
        String age = input.nextLine();
        System.out.print("请输入学生的新地址：");
        String address = input.nextLine();

        //替换原来的值
        student s = new student(sid,name,age,address);
        arr.set(i,s);

        System.out.println("修改成功");
    }
}