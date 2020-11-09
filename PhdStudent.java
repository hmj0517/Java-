package com.hmj.experiment.bean;

import java.util.Scanner;

import com.hmj.experiment.interfaces.IStuManager;
import com.hmj.experiment.interfaces.ITeaManager;

/**
 * 博士研究生类
 * @author 小米
 *
 */
public class PhdStudent implements IStuManager,ITeaManager{

	private String name;  //姓名
	private String sex;  //性别
	private Integer age; //年龄
	private Double tuition; //每学期学费
	private Double salary; //每月薪水
	private Double balance; //余额
	
	
	
	/**
	 * 博士研究生类构造函数，使用Scanner赋值      
	 * @param scanner 
	 */
	public PhdStudent(Scanner scanner) {
		//使用scanner对学生对象进行赋值
		try {
			System.out.print("请输入学生姓名：");
			this.name = scanner.next();
			System.out.print("请输入学生性别：");
			this.sex = scanner.next();
			System.out.print("请输入学生年龄：");
			this.age = scanner.nextInt();
			System.out.print("请输入学生每学期学费：");
			this.tuition = scanner.nextDouble();
			System.out.print("请输入学生每个月工资：");
			this.salary = scanner.nextDouble();	
			System.out.print("请输入学生余额：");
			this.balance = scanner.nextDouble();
		}catch (Exception e) {
			e.printStackTrace(); //打印异常信息 
			System.out.println("初始化学生时出现错误！---" + e.getMessage());
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getTuition() {
		return tuition;
	}
	public void setTuition(Double tuition) {
		this.tuition = tuition;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public void grantSalary() {
		//模拟发工资动作 新余额 = 当前余额+薪资 
		double newBalance = getBalance() + getSalary();
		setBalance(newBalance);
		
	}
	@Override
	public double querySalary() {
		//重写教师接口查询工资的方法 
		return getSalary();
	}
	@Override
	public void payTuition() {
		// 模拟交学费动作  余额不足判断
		if(balance - tuition < 0) {
			System.out.println("余额不足");
			return;
		}
		setBalance(getBalance() - getTuition());
	}
	@Override
	public double queryTuition() {
		return getTuition(); 
	}
	
}
