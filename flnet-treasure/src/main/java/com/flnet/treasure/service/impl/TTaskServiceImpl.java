package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TTaskMapper;
import com.flnet.treasure.domain.TTask;
import com.flnet.treasure.service.ITTaskService;
import com.flnet.common.support.Convert;

/**
 * 任务 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TTaskServiceImpl implements ITTaskService 
{
	@Autowired
	private TTaskMapper tTaskMapper;

	/**
     * 查询任务信息
     * 
     * @param taskId 任务ID
     * @return 任务信息
     */
    @Override
	public TTask selectTTaskById(Long taskId)
	{
	    return tTaskMapper.selectTTaskById(taskId);
	}
	
	/**
     * 查询任务列表
     * 
     * @param tTask 任务信息
     * @return 任务集合
     */
	@Override
	public List<TTask> selectTTaskList(TTask tTask)
	{
	    return tTaskMapper.selectTTaskList(tTask);
	}
	
    /**
     * 新增任务
     * 
     * @param tTask 任务信息
     * @return 结果
     */
	@Override
	public int insertTTask(TTask tTask)
	{
	    return tTaskMapper.insertTTask(tTask);
	}
	
	/**
     * 修改任务
     * 
     * @param tTask 任务信息
     * @return 结果
     */
	@Override
	public int updateTTask(TTask tTask)
	{
	    return tTaskMapper.updateTTask(tTask);
	}

	/**
     * 删除任务对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTTaskByIds(String ids)
	{
		return tTaskMapper.deleteTTaskByIds(Convert.toStrArray(ids));
	}
	
}
