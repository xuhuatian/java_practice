package com;
import java.util.*;
public class main{
    public static void main(String[] string){
        Scanner input = new Scanner(System.in);

        System.out.println("品牌型号：华为");
        System.out.println("尺寸：5.5");
        System.out.println("价格：3688.88");
        System.out.println("配置：8+128g 全面刘海屏");
        System.out.print("请输入华为手机库存：");
        int huawei = input.nextInt();
        System.out.println("库存华为手机的总金额："+(huawei*3688.88));

        System.out.println("品牌型号：小米");
        System.out.println("尺寸：5.0");
        System.out.println("价格：2988.88");
        System.out.println("配置：4+64g 全面屏");
        System.out.print("请输入小米手机的库存：");
        int xiaomi = input.nextInt();
        System.out.println("小米手机库存总金额："+(xiaomi*2988.88));

        System.out.println("--------库存清单--------");
        System.out.println("品牌型号   尺寸          价格                 配置     库存数量       总价");
        System.out.println("华为      5.5       3688.88     8+128g 全面刘海屏        "+huawei+ "       "      +huawei*3688.88);
        System.out.println("小米      5.0       2988.88         4+64g 全面屏        "+xiaomi+ "       "      +xiaomi*2988.88);
        System.out.println("-----------------------");

        System.out.println("总库存："+(xiaomi+huawei));
        System.out.println("库存总价："+(xiaomi*2988.88+huawei*3688.88)+"¥");



    }


}





