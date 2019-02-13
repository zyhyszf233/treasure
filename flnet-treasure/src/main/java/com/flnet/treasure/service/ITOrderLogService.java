package com.flnet.treasure.service;

import com.flnet.treasure.domain.TOrderLog;
import java.util.List;

/**
 * 订单记录 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITOrderLogService 
{
	/**
     * 查询订单记录信息
     * 
     * @param orderLogId 订单记录ID
     * @return 订单记录信息
     */
	public TOrderLog selectTOrderLogById(Long orderLogId);
	
	/**
     * 查询订单记录列表
     * 
     * @param tOrderLog 订单记录信息
     * @return 订单记录集合
     */
	public List<TOrderLog> selectTOrderLogList(TOrderLog tOrderLog);
	
	/**
     * 新增订单记录
     * 
     * @param tOrderLog 订单记录信息
     * @return 结果
     */
	public int insertTOrderLog(TOrderLog tOrderLog);
	
	/**
     * 修改订单记录
     * 
     * @param tOrderLog 订单记录信息
     * @return 结果
     */
	public int updateTOrderLog(TOrderLog tOrderLog);
		
	/**
     * 删除订单记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTOrderLogByIds(String ids);
	
}
