package fg;

import java.util.Scanner;
import java.util.Random;

public class gj {

	
	public static void  main (String[] args) {
	 
		Scanner input = new Scanner(System.in);
		
		int randomNumber=new Random().nextInt(3)+1; 
		
		System.out.println("����������");
		System.out.println("����    ʯͷ    ��");
		
		int player=0;//��һ�ʤ����
		int pc=0;//���Ի�ʤ����
		int t=0;//ƽ������
		
		int i=0;
		for(i=0;i<5;i++)//��5�ְ�
		{
			System.out.println("��"+(i+1)+"��");
			String play = input.next();//�������
			randomNumber=new Random().nextInt(3)+1; //��ȡ1~3�������

			//������У�1���������2����ʯͷ��3����

			if(play.equals("����"))//���������Ǽ���
			{
				if(randomNumber == 1)
				{
					System.out.println("���ε��Գ����Ǽ���");
					System.out.println("��ƽ��");
					t++;
				}
				else if(randomNumber == 2)
					{
						System.out.println("���ε��Գ�����ʯͷ");
						System.out.println("������");
						pc++;
					}
				else
				{
					System.out.println("���ε��Գ����ǲ�");
					System.out.println("��Ӯ��");
					player++;
				}
			}/////////
			else if(play.equals("ʯͷ"))
			{
				if(randomNumber == 1)
				{
					System.out.println("���ε��Գ����Ǽ���");
					System.out.println("��Ӯ��");
					player++;
				}
				else if(randomNumber == 2)
					{
						System.out.println("���ε��Գ�����ʯͷ");
						System.out.println("��ƽ��");
						t++;
					}
				else
				{
					System.out.println("���ε��Գ����ǲ�");
					System.out.println("������");
					pc++;
				}
				
			}////////////////
			else if(play.equals("��"))
			{
				if(randomNumber == 1)
				{
					System.out.println("���ε��Գ����Ǽ���");
					System.out.println("������");
					pc++;
				}
				else if(randomNumber == 2)
					{
						System.out.println("���ε��Գ�����ʯͷ");
						System.out.println("��Ӯ��");
						player++;
					}
				else
				{
					System.out.println("���ε��Գ����ǲ�");
					System.out.println("��ƽ��");
					t++;
				}
			}
			else//�������
				{
					System.out.println("�ܲ��ܺú�����");
					i--;
				}
		}
		
		System.out.println("������Ϸ��Ӯ��"+player+"�֣�����"+pc+"�֣���ƽ��"+t+"��");
		
		if(player>pc)
		{
			System.out.println("��ʤ");
		}
		else if(player<pc)
		{
			System.out.println("ʧ��");
		}
		else
		{
			System.out.println("�;�");
		}
		
		
			
		}
		
		
		
		
	  		  	  }
	  		  	



