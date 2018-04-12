package cn.tedu.sms;

import java.util.Arrays;
import java.util.Scanner;

public class Operator { 
	//��Ҫһ�����ϣ���������Student����
	Student[] db = new Student[0];
	Scanner scan = new Scanner(System.in);
	
	//��ʾ����ѧ����Ϣ
	public void showAll(){
		for(int i = 0; i < db.length; i++){
			Student s = db[i];
			System.out.println(s.sno + "\t" + s.name + "\t" + s.age);
		}
	}
	
	//����ѧ��ѧ�ţ���ѯָ��ѧ����Ϣ
	public void findById(){
		System.out.println("��������Ҫ��ѯ��ѧ��ѧ�ţ� ");
		int sno = scan.nextInt();
		int index = -1;
		
		for(int i = 0; i < db.length; i++){
			Student s = db[i];
			if(s.sno == sno){
				index = i;
				break;
			}
		}
		
		if(index != -1){
			System.out.println(db[index].sno + "\t" + db[index].name + "\t" + db[index].age);
		}else{
			System.out.println("����ѯ��ѧ��Ϊ" + sno + "��ѧ��������.");
		}
	}
	
	//���ѧ����Ϣ
	//ÿ��ѧ��ѧ�Ų�����ͬ
	public void add(){
		System.out.println("������ѧ��ѧ�ţ� ");
		int sno = scan.nextInt();
		//�ж��Ƿ���ѧ���ظ�������У���ʾ�û�ѧ���ظ��������û���������ѧ��
		System.out.println("������ѧ�������� ");
		String name = scan.next();
		System.out.println("������ѧ�����䣺 ");
		int age = scan.nextInt();
		
		Student stu = new Student();
		stu.sno = sno;
		stu.name = name;
		stu.age = age;
		
		db = Arrays.copyOf(db, db.length + 1);
		db[db.length - 1] = stu;
		
		System.out.println("ѧ����Ϣ��ӳɹ�");
	}
	//����ѧ����ѧ�ţ��޸�ָ��ѧ����Ϣ
	public void updataById(){
		System.out.println("��������Ҫ��ѯ��ѧ��ѧ�ţ� ");
		int sno = scan.nextInt();
		int index = -1;
		
		for(int i = 0; i < db.length; i++){
			Student s = db[i];
			if(s.sno == sno){
				index = i;
				break;
			}
		}
		
		if(index != -1){
			System.out.println("ѧ��Ϊ" + sno + "ѧ��ԭ����Ϊ" + db[index].name + "���������޸ĺ��ѧ�������� ");
			String name = scan.next();
			System.out.println("ѧ��Ϊ" + sno + "ѧ��ԭ����Ϊ" + db[index].age + "��������Ҫ�޸ĵ�ѧ�����䣺 ");
			int age = scan.nextInt();
			db[index].name = name;
			db[index].age = age;
			System.out.println("�޸ĳɹ���");
		}else{
			System.out.println("��Ҫ�޸ĵ�ѧ��Ϊ" + sno + "��ѧ��������.");
		}
	}
	//ɾ������ѧ����Ϣ
	public void deleteAll(){
		db = new Student[0];
		System.out.println("ȫ��ɾ���ɹ���");
	}
	
	//����ѧ��ɾ��ָ��ѧ��id
	public void deleteById(){
		System.out.println("��������Ҫɾ����ѧ��ѧ�ţ� ");
		int sno = scan.nextInt();
		
		int index = -1;
		for(int i = 0; i < db.length; i++){
			Student s = db[i];
			if(s.sno == sno){
				index = i;
				break;
			}
		}
		
		if(index != -1){
			Student[] newdb = new Student[db.length - 1];
			
			for(int i = 0; i < db.length - 1; i++){
				newdb[i] = db[i + 1];
			}
			
			db = newdb;
			System.out.println("ɾ���ɹ���������");
		}else{
			System.out.println("��Ҫɾ����ѧ��Ϊ" + sno + "��ѧ��������");
		}
		
	}
}
