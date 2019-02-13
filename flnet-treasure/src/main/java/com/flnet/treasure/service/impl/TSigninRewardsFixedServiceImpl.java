package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TSigninRewardsFixedMapper;
import com.flnet.treasure.domain.TSigninRewardsFixed;
import com.flnet.treasure.service.ITSigninRewardsFixedService;
import com.flnet.common.support.Convert;

/**
 * 签到奖励记录 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TSigninRewardsFixedServiceImpl implements ITSigninRewardsFixedService 
{
	@Autowired
	private TSigninRewardsFixedMapper tSigninRewardsFixedMapper;

	/**
     * 查询签到奖励记录信息
     * 
     * @param tSigninRewardsFixedId 签到奖励记录ID
     * @return 签到奖励记录信息
     */
    @Override
	public TSigninRewardsFixed selectTSigninRewardsFixedById(Long tSigninRewardsFixedId)
	{
	    return tSigninRewardsFixedMapper.selectTSigninRewardsFixedById(tSigninRewardsFixedId);
	}
	
	/**
     * 查询签到奖励记录列表
     * 
     * @param tSigninRewardsFixed 签到奖励记录信息
     * @return 签到奖励记录集合
     */
	@Override
	public List<TSigninRewardsFixed> selectTSigninRewardsFixedList(TSigninRewardsFixed tSigninRewardsFixed)
	{
	    return tSigninRewardsFixedMapper.selectTSigninRewardsFixedList(tSigninRewardsFixed);
	}
	
    /**
     * 新增签到奖励记录
     * 
     * @param tSigninRewardsFixed 签到奖励记录信息
     * @return 结果
     */
	@Override
	public int insertTSigninRewardsFixed(TSigninRewardsFixed tSigninRewardsFixed)
	{
	    return tSigninRewardsFixedMapper.insertTSigninRewardsFixed(tSigninRewardsFixed);
	}
	
	/**
     * 修改签到奖励记录
     * 
     * @param tSigninRewardsFixed 签到奖励记录信息
     * @return 结果
     */
	@Override
	public int updateTSigninRewardsFixed(TSigninRewardsFixed tSigninRewardsFixed)
	{
	    return tSigninRewardsFixedMapper.updateTSigninRewardsFixed(tSigninRewardsFixed);
	}

	/**
     * 删除签到奖励记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTSigninRewardsFixedByIds(String ids)
	{
		return tSigninRewardsFixedMapper.deleteTSigninRewardsFixedByIds(Convert.toStrArray(ids));
	}
	
}
