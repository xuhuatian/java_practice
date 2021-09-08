package com;
//1.导入Scanner
import java.util.*;
public class main {
    //程序运行的入口
    public static void main(String[] string){
        //2.需要给用户开一个通过键盘录入程序的入口
        Scanner input = new Scanner(System.in);

        //3.接受用户的键盘录入zs
        System.out.print("请输入姓名:");
        String name=input.next();

        System.out.print("请输入姓别:");
        String sex = input.next();

        System.out.print("请输入年龄:");
        int age = input.nextInt();

        System.out.print("请输入分数:");
        double score = input.nextDouble();

        //4.打印
        System.out.println("名字："+name);
        System.out.println("性别："+sex);
        System.out.println("年龄："+age);
        System.out.println("分数："+score);

    }
}
