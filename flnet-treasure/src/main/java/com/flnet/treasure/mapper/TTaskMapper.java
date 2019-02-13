package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TTask;
import java.util.List;	

/**
 * 任务 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TTaskMapper 
{
	/**
     * 查询任务信息
     * 
     * @param taskId 任务ID
     * @return 任务信息
     */
	public TTask selectTTaskById(Long taskId);
	
	/**
     * 查询任务列表
     * 
     * @param tTask 任务信息
     * @return 任务集合
     */
	public List<TTask> selectTTaskList(TTask tTask);
	
	/**
     * 新增任务
     * 
     * @param tTask 任务信息
     * @return 结果
     */
	public int insertTTask(TTask tTask);
	
	/**
     * 修改任务
     * 
     * @param tTask 任务信息
     * @return 结果
     */
	public int updateTTask(TTask tTask);
	
	/**
     * 删除任务
     * 
     * @param taskId 任务ID
     * @return 结果
     */
	public int deleteTTaskById(Long taskId);
	
	/**
     * 批量删除任务
     * 
     * @param taskIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTTaskByIds(String[] taskIds);
	
}