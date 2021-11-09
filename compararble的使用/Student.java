public class Student implements Comparable<Student>{//实现Comparable接口
    private String name;
    private int age;

    public Student(){}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写排序方法
    @Override
    public int compareTo(Student s){

        int num = this.age - s.age;//按年龄从小到大排序

        //如果年龄相同，判断姓名是否相同
        if(num == 0){
            if(!this.name.equals(s.name)){//判断年龄是否相同
                return this.name.charAt(0) - s.name.charAt(0);//首字母的大小比较
            }
        }
            return num;

        /*

        //用三元运算符更简洁
        int num = this.age - s.age;//按年龄从小到大排序

        //如果num 为0 就比较姓名是否相同，姓名相同就按字母大小排序
        int num2 = num == 0? this.name.compareTo(s.name):num;
        return num2;

         */
    }
}
