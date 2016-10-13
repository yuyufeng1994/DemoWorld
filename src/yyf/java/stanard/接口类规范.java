package yyf.java.stanard;
//package com.hundsun......;

/**
 * 数据集的基础接口，在这里定义了数据集的工作方式 <br>
 * <p> 系统版本: v1.0 <br>
 * 开发人员: test <br>
 * 开发时间: 2015-6-30 <br>
 * <br>
 */
public interface 接口类规范 //IDatasetBase
{
	/**
	 * Dataset的工作模式：在获取列值失败的情况下，抛出运行期异常
	 */
	public static final int	MODE_EXCEPTION	= 0;

	/**
	 * Dataset的工作模式：在获取列值失败的情况下，采用默认值
	 */
	public static final int	MODE_DEFAULT	= 1;

	/**
	 * 获取Dataset的工作模式，Dataset在获取数据的时候，根据工作模式判断是抛出异常还是采用默认值
	 * 
	 * @return IDatasetBase.MODE_EXCEPTION 在获取列值失败的情况下，抛出异常 <br>
	 *         IDatasetBase.MODE_DEFAULT 在获取列值失败的情况下，采用默认值
	 */
	int getMode();

	/**
	 * 获取Dataset的工作模式，Dataset在获取数据的时候，根据工作模式判断是抛出异常还是采用默认值
	 * 
	 * @return IDatasetBase.MODE_EXCEPTION 在获取列值失败的情况下，抛出异常 <br>
	 *         IDatasetBase.MODE_DEFAULT 在获取列值失败的情况下，采用默认值
	 */
	void setMode(int mode);

	/**
	 * 返回 DataSet 中的记录数
	 * 
	 * @return 行数
	 */
	int getRowCount();

}

