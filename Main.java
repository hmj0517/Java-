package com.hmj.experiment;

import java.util.Scanner;

import com.hmj.experiment.bean.PhdStudent;
import com.hmj.experiment.utils.TaxUtils;

/**
 * ��д�����࣬��ʵ��������������ʿ�о�����ͳ�����ǵ��������ѧ�ѡ�
 * ��������֮����ÿ����ʿ�о�������Ӧ��˰���������¹�����˰��׼�������м�����
 * @author С��
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//��ʼ������  
		PhdStudent zhangSanPhd = new PhdStudent(scanner);
		//����������������
		double zhangSanYearIncome = TaxUtils.countYearIncome(zhangSanPhd); 
		//����������˰���ӡ
		System.out.println(zhangSanPhd.getName() + "������:" + zhangSanYearIncome +
				 "Ӧ����˰��:" + TaxUtils.countTax(zhangSanYearIncome));
		//��ʼ������
		PhdStudent liSiPhd = new PhdStudent(scanner);
		//�������ĵ�������
		double liSiYearIncome = TaxUtils.countYearIncome(liSiPhd);
		//�������ĵ�˰���ӡ
		System.out.println(liSiPhd.getName()+"������:"+liSiYearIncome + 
				"Ӧ����˰��:"+TaxUtils.countTax(liSiYearIncome));
	}

}
