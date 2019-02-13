package com.flnet.treasure.service;

import com.flnet.treasure.domain.TWithdrawLog;
import java.util.List;

/**
 * 提现记录 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITWithdrawLogService 
{
	/**
     * 查询提现记录信息
     * 
     * @param withdrawLogId 提现记录ID
     * @return 提现记录信息
     */
	public TWithdrawLog selectTWithdrawLogById(Long withdrawLogId);
	
	/**
     * 查询提现记录列表
     * 
     * @param tWithdrawLog 提现记录信息
     * @return 提现记录集合
     */
	public List<TWithdrawLog> selectTWithdrawLogList(TWithdrawLog tWithdrawLog);
	
	/**
     * 新增提现记录
     * 
     * @param tWithdrawLog 提现记录信息
     * @return 结果
     */
	public int insertTWithdrawLog(TWithdrawLog tWithdrawLog);
	
	/**
     * 修改提现记录
     * 
     * @param tWithdrawLog 提现记录信息
     * @return 结果
     */
	public int updateTWithdrawLog(TWithdrawLog tWithdrawLog);
		
	/**
     * 删除提现记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTWithdrawLogByIds(String ids);
	
}
