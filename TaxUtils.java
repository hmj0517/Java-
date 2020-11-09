package com.hmj.experiment.utils;

import com.hmj.experiment.bean.PhdStudent;

/**
 * 算税工具类
 * @author 小米
 *
 */
public class TaxUtils {
	
	/**
	 * 全年个税起征点  (5000一个月 一年就是5000 * 12)
	 */
	public static final Integer TAX_START = 5000 * 12;
	
	/**
	 * 计算年收入
	 * @param phdStudent
	 * @return
	 */
	public static double countYearIncome(PhdStudent phdStudent) {
		if(phdStudent == null) {
			throw new RuntimeException("学生对象为空！！");
		}
		//计算一年工资
		double yearIncome = phdStudent.getSalary() * 12;
		//计算一年学费
		double yearTuition = phdStudent.getTuition() * 2;
		//两者相减返回结果
		return yearIncome - yearTuition;
	}
	
	/**
	 * 计算税款
	 * @param payable 年收入
	 * @return 税额 = 应纳税额 * 税率 - 速算扣除数
	 */
	public static double countTax(double yearIncome) {
		if(yearIncome <= TAX_START) {
			//免征 
			return 0;
		}
		//应纳税额 = 年收入 - 免征点
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
