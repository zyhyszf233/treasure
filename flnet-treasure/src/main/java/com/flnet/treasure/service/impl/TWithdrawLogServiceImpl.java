package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TWithdrawLogMapper;
import com.flnet.treasure.domain.TWithdrawLog;
import com.flnet.treasure.service.ITWithdrawLogService;
import com.flnet.common.support.Convert;

/**
 * 提现记录 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TWithdrawLogServiceImpl implements ITWithdrawLogService 
{
	@Autowired
	private TWithdrawLogMapper tWithdrawLogMapper;

	/**
     * 查询提现记录信息
     * 
     * @param withdrawLogId 提现记录ID
     * @return 提现记录信息
     */
    @Override
	public TWithdrawLog selectTWithdrawLogById(Long withdrawLogId)
	{
	    return tWithdrawLogMapper.selectTWithdrawLogById(withdrawLogId);
	}
	
	/**
     * 查询提现记录列表
     * 
     * @param tWithdrawLog 提现记录信息
     * @return 提现记录集合
     */
	@Override
	public List<TWithdrawLog> selectTWithdrawLogList(TWithdrawLog tWithdrawLog)
	{
	    return tWithdrawLogMapper.selectTWithdrawLogList(tWithdrawLog);
	}
	
    /**
     * 新增提现记录
     * 
     * @param tWithdrawLog 提现记录信息
     * @return 结果
     */
	@Override
	public int insertTWithdrawLog(TWithdrawLog tWithdrawLog)
	{
	    return tWithdrawLogMapper.insertTWithdrawLog(tWithdrawLog);
	}
	
	/**
     * 修改提现记录
     * 
     * @param tWithdrawLog 提现记录信息
     * @return 结果
     */
	@Override
	public int updateTWithdrawLog(TWithdrawLog tWithdrawLog)
	{
	    return tWithdrawLogMapper.updateTWithdrawLog(tWithdrawLog);
	}

	/**
     * 删除提现记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTWithdrawLogByIds(String ids)
	{
		return tWithdrawLogMapper.deleteTWithdrawLogByIds(Convert.toStrArray(ids));
	}
	
}
