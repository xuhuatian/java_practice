public class student {

    private String sid;//学号
    private String name;//姓名
    private String age;//年龄
    private String address;//地址

    public student(){}

    public student(String sid,String name,String age,String address){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setSid(String sid) { this.sid = sid;}
    public String getSid(){ return sid; }

    public void setName(String name) { this.name = name; }
    public String getName(){return name;}

    public void setAge(String age){ this.age = age; }
    public String getAge(){ return age;}

    public void setAddress(String address){this.address = address;}
    public String getAddress(){return address;}

}
