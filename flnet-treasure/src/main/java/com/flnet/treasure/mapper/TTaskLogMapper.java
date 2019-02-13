package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TTaskLog;
import java.util.List;	

/**
 * 用户任务记录 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TTaskLogMapper 
{
	/**
     * 查询用户任务记录信息
     * 
     * @param taskLogId 用户任务记录ID
     * @return 用户任务记录信息
     */
	public TTaskLog selectTTaskLogById(Long taskLogId);
	
	/**
     * 查询用户任务记录列表
     * 
     * @param tTaskLog 用户任务记录信息
     * @return 用户任务记录集合
     */
	public List<TTaskLog> selectTTaskLogList(TTaskLog tTaskLog);
	
	/**
     * 新增用户任务记录
     * 
     * @param tTaskLog 用户任务记录信息
     * @return 结果
     */
	public int insertTTaskLog(TTaskLog tTaskLog);
	
	/**
     * 修改用户任务记录
     * 
     * @param tTaskLog 用户任务记录信息
     * @return 结果
     */
	public int updateTTaskLog(TTaskLog tTaskLog);
	
	/**
     * 删除用户任务记录
     * 
     * @param taskLogId 用户任务记录ID
     * @return 结果
     */
	public int deleteTTaskLogById(Long taskLogId);
	
	/**
     * 批量删除用户任务记录
     * 
     * @param taskLogIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTTaskLogByIds(String[] taskLogIds);
	
}