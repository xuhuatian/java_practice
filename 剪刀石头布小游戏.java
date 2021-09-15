package fg;

import java.util.Scanner;
import java.util.Random;

public class gj {

	
	public static void  main (String[] args) {
	 
		Scanner input = new Scanner(System.in);
		
		int randomNumber=new Random().nextInt(3)+1; 
		
		System.out.println("程序已启动");
		System.out.println("剪刀    石头    布");
		
		int player=0;//玩家获胜次数
		int pc=0;//电脑获胜次数
		int t=0;//平均次数
		
		int i=0;
		for(i=0;i<5;i++)//玩5局吧
		{
			System.out.println("第"+(i+1)+"局");
			String play = input.next();//玩家输入
			randomNumber=new Random().nextInt(3)+1; //获取1~3的随机数

			//随机数中，1代表剪刀，2代表石头，3代表布

			if(play.equals("剪刀"))//如果输入的是剪刀
			{
				if(randomNumber == 1)
				{
					System.out.println("本次电脑出的是剪刀");
					System.out.println("打平了");
					t++;
				}
				else if(randomNumber == 2)
					{
						System.out.println("本次电脑出的是石头");
						System.out.println("你输了");
						pc++;
					}
				else
				{
					System.out.println("本次电脑出的是布");
					System.out.println("你赢了");
					player++;
				}
			}/////////
			else if(play.equals("石头"))
			{
				if(randomNumber == 1)
				{
					System.out.println("本次电脑出的是剪刀");
					System.out.println("你赢了");
					player++;
				}
				else if(randomNumber == 2)
					{
						System.out.println("本次电脑出的是石头");
						System.out.println("打平了");
						t++;
					}
				else
				{
					System.out.println("本次电脑出的是布");
					System.out.println("你输了");
					pc++;
				}
				
			}////////////////
			else if(play.equals("布"))
			{
				if(randomNumber == 1)
				{
					System.out.println("本次电脑出的是剪刀");
					System.out.println("你输了");
					pc++;
				}
				else if(randomNumber == 2)
					{
						System.out.println("本次电脑出的是石头");
						System.out.println("你赢了");
						player++;
					}
				else
				{
					System.out.println("本次电脑出的是布");
					System.out.println("打平了");
					t++;
				}
			}
			else//玩家乱来
				{
					System.out.println("能不能好好玩啦");
					i--;
				}
		}
		
		System.out.println("本次游戏您赢了"+player+"局，输了"+pc+"局，打平了"+t+"局");
		
		if(player>pc)
		{
			System.out.println("获胜");
		}
		else if(player<pc)
		{
			System.out.println("失败");
		}
		else
		{
			System.out.println("和局");
		}
		
		
			
		}
		
		
		
		
	  		  	  }
	  		  	



