package com.hmj.experiment.interfaces;

/**
 * 教师管理接口
 * 
 * @author 小米
 *
 */
public interface ITeaManager {
	/**
	 * 发放工资
	 */
	void grantSalary();

	/**
	 * 查询工资
	 * 
	 * @return
	 */
	double querySalary();

}
