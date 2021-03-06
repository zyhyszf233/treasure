package com.flnet.treasure.service;

import com.flnet.treasure.domain.TBalanceDetail;
import java.util.List;

/**
 * 获取奖励记录 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITBalanceDetailService 
{
	/**
     * 查询获取奖励记录信息
     * 
     * @param balanceDetailId 获取奖励记录ID
     * @return 获取奖励记录信息
     */
	public TBalanceDetail selectTBalanceDetailById(Long balanceDetailId);
	
	/**
     * 查询获取奖励记录列表
     * 
     * @param tBalanceDetail 获取奖励记录信息
     * @return 获取奖励记录集合
     */
	public List<TBalanceDetail> selectTBalanceDetailList(TBalanceDetail tBalanceDetail);
	
	/**
     * 新增获取奖励记录
     * 
     * @param tBalanceDetail 获取奖励记录信息
     * @return 结果
     */
	public int insertTBalanceDetail(TBalanceDetail tBalanceDetail);
	
	/**
     * 修改获取奖励记录
     * 
     * @param tBalanceDetail 获取奖励记录信息
     * @return 结果
     */
	public int updateTBalanceDetail(TBalanceDetail tBalanceDetail);
		
	/**
     * 删除获取奖励记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTBalanceDetailByIds(String ids);
	
}
