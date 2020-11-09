package com.hmj.experiment.bean;

import java.util.Scanner;

import com.hmj.experiment.interfaces.IStuManager;
import com.hmj.experiment.interfaces.ITeaManager;

/**
 * ��ʿ�о�����
 * @author С��
 *
 */
public class PhdStudent implements IStuManager,ITeaManager{

	private String name;  //����
	private String sex;  //�Ա�
	private Integer age; //����
	private Double tuition; //ÿѧ��ѧ��
	private Double salary; //ÿ��нˮ
	private Double balance; //���
	
	
	
	/**
	 * ��ʿ�о����๹�캯����ʹ��Scanner��ֵ      
	 * @param scanner 
	 */
	public PhdStudent(Scanner scanner) {
		//ʹ��scanner��ѧ��������и�ֵ
		try {
			System.out.print("������ѧ��������");
			this.name = scanner.next();
			System.out.print("������ѧ���Ա�");
			this.sex = scanner.next();
			System.out.print("������ѧ�����䣺");
			this.age = scanner.nextInt();
			System.out.print("������ѧ��ÿѧ��ѧ�ѣ�");
			this.tuition = scanner.nextDouble();
			System.out.print("������ѧ��ÿ���¹��ʣ�");
			this.salary = scanner.nextDouble();	
			System.out.print("������ѧ����");
			this.balance = scanner.nextDouble();
		}catch (Exception e) {
			e.printStackTrace(); //��ӡ�쳣��Ϣ 
			System.out.println("��ʼ��ѧ��ʱ���ִ���---" + e.getMessage());
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
		//ģ�ⷢ���ʶ��� ����� = ��ǰ���+н�� 
		double newBalance = getBalance() + getSalary();
		setBalance(newBalance);
		
	}
	@Override
	public double querySalary() {
		//��д��ʦ�ӿڲ�ѯ���ʵķ��� 
		return getSalary();
	}
	@Override
	public void payTuition() {
		// ģ�⽻ѧ�Ѷ���  �����ж�
		if(balance - tuition < 0) {
			System.out.println("����");
			return;
		}
		setBalance(getBalance() - getTuition());
	}
	@Override
	public double queryTuition() {
		return getTuition(); 
	}
	
}
