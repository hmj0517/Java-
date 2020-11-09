package com.hmj.experiment;

import java.util.Scanner;

import com.hmj.experiment.bean.PhdStudent;
import com.hmj.experiment.utils.TaxUtils;

/**
 * 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。
 * 根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）
 * @author 小米
 *
 */
public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//初始化张三  
		PhdStudent zhangSanPhd = new PhdStudent(scanner);
		//计算张三的年收入
		double zhangSanYearIncome = TaxUtils.countYearIncome(zhangSanPhd); 
		//计算张三的税款并打印
		System.out.println(zhangSanPhd.getName() + "年收入:" + zhangSanYearIncome +
				 "应缴纳税额:" + TaxUtils.countTax(zhangSanYearIncome));
		//初始化李四
		PhdStudent liSiPhd = new PhdStudent(scanner);
		//计算李四的年收入
		double liSiYearIncome = TaxUtils.countYearIncome(liSiPhd);
		//计算李四的税款并打印
		System.out.println(liSiPhd.getName()+"年收入:"+liSiYearIncome + 
				"应缴纳税额:"+TaxUtils.countTax(liSiYearIncome));
	}

}
