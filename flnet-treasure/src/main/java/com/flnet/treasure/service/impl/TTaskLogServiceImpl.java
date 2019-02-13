package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TTaskLogMapper;
import com.flnet.treasure.domain.TTaskLog;
import com.flnet.treasure.service.ITTaskLogService;
import com.flnet.common.support.Convert;

/**
 * 用户任务记录 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TTaskLogServiceImpl implements ITTaskLogService 
{
	@Autowired
	private TTaskLogMapper tTaskLogMapper;

	/**
     * 查询用户任务记录信息
     * 
     * @param taskLogId 用户任务记录ID
     * @return 用户任务记录信息
     */
    @Override
	public TTaskLog selectTTaskLogById(Long taskLogId)
	{
	    return tTaskLogMapper.selectTTaskLogById(taskLogId);
	}
	
	/**
     * 查询用户任务记录列表
     * 
     * @param tTaskLog 用户任务记录信息
     * @return 用户任务记录集合
     */
	@Override
	public List<TTaskLog> selectTTaskLogList(TTaskLog tTaskLog)
	{
	    return tTaskLogMapper.selectTTaskLogList(tTaskLog);
	}
	
    /**
     * 新增用户任务记录
     * 
     * @param tTaskLog 用户任务记录信息
     * @return 结果
     */
	@Override
	public int insertTTaskLog(TTaskLog tTaskLog)
	{
	    return tTaskLogMapper.insertTTaskLog(tTaskLog);
	}
	
	/**
     * 修改用户任务记录
     * 
     * @param tTaskLog 用户任务记录信息
     * @return 结果
     */
	@Override
	public int updateTTaskLog(TTaskLog tTaskLog)
	{
	    return tTaskLogMapper.updateTTaskLog(tTaskLog);
	}

	/**
     * 删除用户任务记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTTaskLogByIds(String ids)
	{
		return tTaskLogMapper.deleteTTaskLogByIds(Convert.toStrArray(ids));
	}
	
}
