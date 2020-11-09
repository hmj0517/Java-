package com.hmj.experiment.interfaces;

/**
 * 学生管理接口
 * 
 * @author 小米
 *
 */
public interface IStuManager {
	/**
	 * 缴纳学费
	 */
	void payTuition();

	/**
	 * 查询学费
	 * 
	 * @return
	 */
	double queryTuition();

}
