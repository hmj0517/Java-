package com.hmj.experiment.utils;

import com.hmj.experiment.bean.PhdStudent;

/**
 * ��˰������
 * @author С��
 *
 */
public class TaxUtils {
	
	/**
	 * ȫ���˰������  (5000һ���� һ�����5000 * 12)
	 */
	public static final Integer TAX_START = 5000 * 12;
	
	/**
	 * ����������
	 * @param phdStudent
	 * @return
	 */
	public static double countYearIncome(PhdStudent phdStudent) {
		if(phdStudent == null) {
			throw new RuntimeException("ѧ������Ϊ�գ���");
		}
		//����һ�깤��
		double yearIncome = phdStudent.getSalary() * 12;
		//����һ��ѧ��
		double yearTuition = phdStudent.getTuition() * 2;
		//����������ؽ��
		return yearIncome - yearTuition;
	}
	
	/**
	 * ����˰��
	 * @param payable ������
	 * @return ˰�� = Ӧ��˰�� * ˰�� - ����۳���
	 */
	public static double countTax(double yearIncome) {
		if(yearIncome <= TAX_START) {
			//���� 
			return 0;
		}
		//Ӧ��˰�� = ������ - ������
		double payable = yearIncome - TAX_START;
		if(payable <= 36000) {
			return payable * 0.03 - 0;
		}else if(payable <= 144000) {
			return payable * 0.1 - 2520;
		}else if(payable <= 300000) {
			return payable * 0.2 - 16920;
		}else if(payable <= 420000) {
			return payable * 0.25 - 31920;
		}else if(payable <= 660000) {
			return payable * 0.3 - 52920;
		}else if(payable <= 960000) {
			return payable * 0.35 - 85920;
		}else {
			return payable * 0.45 - 181920;
		}
	}
}
