import java.util.Scanner;
    public class main{

        public static void main(String[] args){
            int m = 8;
            System.out.println("书本的价格为12元，你总共有20元");
            System.out.println("1.铅笔的价格为：1元");
            System.out.println("2.橡皮的价格为：2元");
            System.out.println("3.可乐的价格为：3元");
            System.out.println("4.零食的价格为：5元");
            System.out.println("请输入其他需要购买商品的序列号：");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            switch(a)
            {
                case 1:
                    System.out.println("购买完书本后还可以购买铅笔"+(m/1)+"，还省"+(m%1)+"元。");
                    break;
                case 2:
                    System.out.println("购买完书本后还可以购买橡皮"+(m/2)+"，还省"+(m%2)+"元。");
                    break;
                case 3:
                    System.out.println("购买完书本后还可以购买可乐"+(m/3)+"，还省"+(m%3)+"元。");
                    break;
                case 4:
                    System.out.println("购买完书本后还可以购买零食"+(m/5)+"，还省"+(m%5)+"元。");
                    break;
            }
        }

    }




