package cn.tedu.sms;

import java.util.Arrays;
import java.util.Scanner;

public class Operator { 
	//需要一个集合，来保存多个Student对象。
	Student[] db = new Student[0];
	Scanner scan = new Scanner(System.in);
	
	//显示所有学生信息
	public void showAll(){
		for(int i = 0; i < db.length; i++){
			Student s = db[i];
			System.out.println(s.sno + "\t" + s.name + "\t" + s.age);
		}
	}
	
	//根据学生学号，查询指定学生信息
	public void findById(){
		System.out.println("请输入您要查询的学生学号： ");
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
			System.out.println("您查询的学号为" + sno + "的学生不存在.");
		}
	}
	
	//添加学生信息
	//每个学生学号不能相同
	public void add(){
		System.out.println("请输入学生学号： ");
		int sno = scan.nextInt();
		//判断是否有学号重复，如果有，提示用户学号重复，并让用户重新输入学号
		System.out.println("请输入学生姓名： ");
		String name = scan.next();
		System.out.println("请输入学生年龄： ");
		int age = scan.nextInt();
		
		Student stu = new Student();
		stu.sno = sno;
		stu.name = name;
		stu.age = age;
		
		db = Arrays.copyOf(db, db.length + 1);
		db[db.length - 1] = stu;
		
		System.out.println("学生信息添加成功");
	}
	//根据学生的学号，修改指定学生信息
	public void updataById(){
		System.out.println("请输入您要查询的学生学号： ");
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
			System.out.println("学号为" + sno + "学生原姓名为" + db[index].name + "请输入您修改后的学生姓名： ");
			String name = scan.next();
			System.out.println("学号为" + sno + "学生原年龄为" + db[index].age + "请输入您要修改的学生年龄： ");
			int age = scan.nextInt();
			db[index].name = name;
			db[index].age = age;
			System.out.println("修改成功！");
		}else{
			System.out.println("您要修改的学号为" + sno + "的学生不存在.");
		}
	}
	//删除所有学生信息
	public void deleteAll(){
		db = new Student[0];
		System.out.println("全部删除成功！");
	}
	
	//根据学号删除指定学生id
	public void deleteById(){
		System.out.println("请输入您要删除的学生学号： ");
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
			System.out.println("删除成功！！！！");
		}else{
			System.out.println("您要删除的学号为" + sno + "的学生不存在");
		}
		
	}
}
