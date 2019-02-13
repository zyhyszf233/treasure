package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TSigninRewardsFixed;
import java.util.List;	

/**
 * 签到奖励记录 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TSigninRewardsFixedMapper 
{
	/**
     * 查询签到奖励记录信息
     * 
     * @param tSigninRewardsFixedId 签到奖励记录ID
     * @return 签到奖励记录信息
     */
	public TSigninRewardsFixed selectTSigninRewardsFixedById(Long tSigninRewardsFixedId);
	
	/**
     * 查询签到奖励记录列表
     * 
     * @param tSigninRewardsFixed 签到奖励记录信息
     * @return 签到奖励记录集合
     */
	public List<TSigninRewardsFixed> selectTSigninRewardsFixedList(TSigninRewardsFixed tSigninRewardsFixed);
	
	/**
     * 新增签到奖励记录
     * 
     * @param tSigninRewardsFixed 签到奖励记录信息
     * @return 结果
     */
	public int insertTSigninRewardsFixed(TSigninRewardsFixed tSigninRewardsFixed);
	
	/**
     * 修改签到奖励记录
     * 
     * @param tSigninRewardsFixed 签到奖励记录信息
     * @return 结果
     */
	public int updateTSigninRewardsFixed(TSigninRewardsFixed tSigninRewardsFixed);
	
	/**
     * 删除签到奖励记录
     * 
     * @param tSigninRewardsFixedId 签到奖励记录ID
     * @return 结果
     */
	public int deleteTSigninRewardsFixedById(Long tSigninRewardsFixedId);
	
	/**
     * 批量删除签到奖励记录
     * 
     * @param tSigninRewardsFixedIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTSigninRewardsFixedByIds(String[] tSigninRewardsFixedIds);
	
}