package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TBalanceDetailMapper;
import com.flnet.treasure.domain.TBalanceDetail;
import com.flnet.treasure.service.ITBalanceDetailService;
import com.flnet.common.support.Convert;

/**
 * 获取奖励记录 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TBalanceDetailServiceImpl implements ITBalanceDetailService 
{
	@Autowired
	private TBalanceDetailMapper tBalanceDetailMapper;

	/**
     * 查询获取奖励记录信息
     * 
     * @param balanceDetailId 获取奖励记录ID
     * @return 获取奖励记录信息
     */
    @Override
	public TBalanceDetail selectTBalanceDetailById(Long balanceDetailId)
	{
	    return tBalanceDetailMapper.selectTBalanceDetailById(balanceDetailId);
	}
	
	/**
     * 查询获取奖励记录列表
     * 
     * @param tBalanceDetail 获取奖励记录信息
     * @return 获取奖励记录集合
     */
	@Override
	public List<TBalanceDetail> selectTBalanceDetailList(TBalanceDetail tBalanceDetail)
	{
	    return tBalanceDetailMapper.selectTBalanceDetailList(tBalanceDetail);
	}
	
    /**
     * 新增获取奖励记录
     * 
     * @param tBalanceDetail 获取奖励记录信息
     * @return 结果
     */
	@Override
	public int insertTBalanceDetail(TBalanceDetail tBalanceDetail)
	{
	    return tBalanceDetailMapper.insertTBalanceDetail(tBalanceDetail);
	}
	
	/**
     * 修改获取奖励记录
     * 
     * @param tBalanceDetail 获取奖励记录信息
     * @return 结果
     */
	@Override
	public int updateTBalanceDetail(TBalanceDetail tBalanceDetail)
	{
	    return tBalanceDetailMapper.updateTBalanceDetail(tBalanceDetail);
	}

	/**
     * 删除获取奖励记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTBalanceDetailByIds(String ids)
	{
		return tBalanceDetailMapper.deleteTBalanceDetailByIds(Convert.toStrArray(ids));
	}
	
}
