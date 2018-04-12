package cn.tedu.sms;

import java.util.Scanner;

public class UI {
	Scanner scan = new Scanner(System.in);
	Operator op = new Operator();
	
	//主界面
	public void mainUI(){
		System.out.println("========学生管理系统========");
		System.out.println("1- 显示所有学生信息");
		System.out.println("2- 根据学号显示指定学生信息");
		System.out.println("3- 添加学生信息");
		System.out.println("4- 根据学号修改学生信息");
		System.out.println("5- 删除所有学生信息");
		System.out.println("6- 根据学号删除指定学生信息");
		System.out.println("7- 系统退出");
		System.out.println("========================");
	}
	
	//启动
	public void start(){
		while(true){
			run();
		}
	}

	public void run() {
		mainUI();
		//提示用户，输入要执行的功能序号
		System.out.println("请输入您要选择的功能，选项范围[1~7]: ");
		int option = scan.nextInt();
		//判断用户输入的选项
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
			System.out.println("下次再来，谢谢光临！");
			System.exit(0);//使得Java虚拟机关闭，停止运行
			break;
		default:
			System.out.println("default");
		
		}
	}
	
	
}
