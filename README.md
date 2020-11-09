## 计G201  贺梦杰  2020322077 
## 一、实验目的 
1. 掌握Java中抽象类和抽象方法的区别 
2. 掌握Java中接口的定义、形式、方法 
3. 了解Java中接口和抽象类的区别 
4. 了解异常的使用方法，锻炼在程序中处理和避免异常的能力 
5. 了解throw以及throws关键字的区别 
## 二、实验要求 
1. 在博士研究生类中，实现各个接口定义的抽象方法 
2. 根据国家最新纳税标准，进行税费计算 
3. 适当进行异常的处理 
## 三、实验过程 
1. 创建学生管理接口，并定义查询学费和缴纳学费方法 
2. 创建教师管理接口，并定义查询薪资和发放薪资方法  
3. 创建博士研究生类，声明姓名、性别、年龄、余额等属性，实现上述两个接口，添加基于Scanner的构造函数，创建对象时使用Scanner赋值，并重写上述接口中的方法，发放薪资和缴纳学费，围绕余额属性进行 
4. 创建TaxUtils.java工具类   
   4.1 定义全年收入免征点常量，TAX_START,免征点每月5000,全年就是5000 * 12，使用static final修饰，与对象无关 
   4.2 编写统计博士研究生年收入静态方法，将博士研究生对象作为参数传入，将统计好的年收入作为返回值返回，(每月薪资 * 12) - (每学期学费 * 2) 
   4.3 编写统计税费静态方法，将博士研究生的年收入作为参数传入，将税费作为返回值返回，如果博士研究生年收入小于等于免征点，则直接返回0；大于免征点时，将年收入减去免征点作为应纳税所得额，按照税率表进行税费统计 
5. 创建Main.java类，添加main方法，作为主类 
   5.1 创建一个Scanner对象，用于输入博士研究生信息 
   5.2 创建博士研究生对象，并将scanner对象传入构造函数中，对属性进行一一赋值 
   5.3 调用TaxUtils中的统计年收入方法，对该名博士研究生进行年收入统计，并使用变量保存 
   5.4 调用TaxUtils中的统计税费方法，将年收入作为参数传入，并获取返回的税费 
   5.5 打印年收入和税费信息 
## 四、核心代码
``` 
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
  ```
  ```
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
``` 
## 五、实验结果 
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/PiajxSqBRaELcQnCatfx2OLUmQn1DXyeeRKsMHV0FjdVJpZE6t5JkibKN2QXD3dTXib2hUYffG4g58/0)  
## 六、编程感想  
1. 了解了Java编程中接口的定义方法和特性  
2. 基本掌握了接口和抽象类的区别 
3. 了解了static final 关键字的使用场景 
4. 锻炼了在程序中处理异常的能力
