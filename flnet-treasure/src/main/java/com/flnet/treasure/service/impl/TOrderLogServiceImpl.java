package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TOrderLogMapper;
import com.flnet.treasure.domain.TOrderLog;
import com.flnet.treasure.service.ITOrderLogService;
import com.flnet.common.support.Convert;

/**
 * 订单记录 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TOrderLogServiceImpl implements ITOrderLogService 
{
	@Autowired
	private TOrderLogMapper tOrderLogMapper;

	/**
     * 查询订单记录信息
     * 
     * @param orderLogId 订单记录ID
     * @return 订单记录信息
     */
    @Override
	public TOrderLog selectTOrderLogById(Long orderLogId)
	{
	    return tOrderLogMapper.selectTOrderLogById(orderLogId);
	}
	
	/**
     * 查询订单记录列表
     * 
     * @param tOrderLog 订单记录信息
     * @return 订单记录集合
     */
	@Override
	public List<TOrderLog> selectTOrderLogList(TOrderLog tOrderLog)
	{
	    return tOrderLogMapper.selectTOrderLogList(tOrderLog);
	}
	
    /**
     * 新增订单记录
     * 
     * @param tOrderLog 订单记录信息
     * @return 结果
     */
	@Override
	public int insertTOrderLog(TOrderLog tOrderLog)
	{
	    return tOrderLogMapper.insertTOrderLog(tOrderLog);
	}
	
	/**
     * 修改订单记录
     * 
     * @param tOrderLog 订单记录信息
     * @return 结果
     */
	@Override
	public int updateTOrderLog(TOrderLog tOrderLog)
	{
	    return tOrderLogMapper.updateTOrderLog(tOrderLog);
	}

	/**
     * 删除订单记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTOrderLogByIds(String ids)
	{
		return tOrderLogMapper.deleteTOrderLogByIds(Convert.toStrArray(ids));
	}
	
}
