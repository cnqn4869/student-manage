package cn.tedu.sms;

import java.util.Scanner;

public class UI {
	Scanner scan = new Scanner(System.in);
	Operator op = new Operator();
	
	//������
	public void mainUI(){
		System.out.println("========ѧ������ϵͳ========");
		System.out.println("1- ��ʾ����ѧ����Ϣ");
		System.out.println("2- ����ѧ����ʾָ��ѧ����Ϣ");
		System.out.println("3- ���ѧ����Ϣ");
		System.out.println("4- ����ѧ���޸�ѧ����Ϣ");
		System.out.println("5- ɾ������ѧ����Ϣ");
		System.out.println("6- ����ѧ��ɾ��ָ��ѧ����Ϣ");
		System.out.println("7- ϵͳ�˳�");
		System.out.println("========================");
	}
	
	//����
	public void start(){
		while(true){
			run();
		}
	}

	public void run() {
		mainUI();
		//��ʾ�û�������Ҫִ�еĹ������
		System.out.println("��������Ҫѡ��Ĺ��ܣ�ѡ�Χ[1~7]: ");
		int option = scan.nextInt();
		//�ж��û������ѡ��
		switch(option){
		case 1:
//			System.out.println("1");
			op.showAll();
			break;
		case 2:
			op.findById();
//			System.out.println("2");
			break;
		case 3:
			op.add();
//			System.out.println("3");
			break;
		case 4:
			op.updataById();
//			System.out.println("4");
			break;
		case 5:
			op.deleteAll();
//			System.out.println("5");
			break;
		case 6:
			op.deleteById();
//			System.out.println("6");
			break;
		case 7:
			System.out.println("�´�������лл���٣�");
			System.exit(0);//ʹ��Java������رգ�ֹͣ����
			break;
		default:
			System.out.println("default");
		
		}
	}
	
	
}
