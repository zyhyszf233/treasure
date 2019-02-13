package com.flnet.treasure.service;

import com.flnet.treasure.domain.TSigninRewardsFixed;
import java.util.List;

/**
 * 签到奖励记录 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITSigninRewardsFixedService 
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
     * 删除签到奖励记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTSigninRewardsFixedByIds(String ids);
	
}
