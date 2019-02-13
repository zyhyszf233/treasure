package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TSigninRewardsFixedConfig;
import java.util.List;	

/**
 * 连续签到奖励配置 数据层
 * 
 * @author flnet
 * @date 2019-02-12
 */
public interface TSigninRewardsFixedConfigMapper 
{
	/**
     * 查询连续签到奖励配置信息
     * 
     * @param tSigninRewardsFixedConfigId 连续签到奖励配置ID
     * @return 连续签到奖励配置信息
     */
	public TSigninRewardsFixedConfig selectTSigninRewardsFixedConfigById(Long tSigninRewardsFixedConfigId);
	
	/**
     * 查询连续签到奖励配置列表
     * 
     * @param tSigninRewardsFixedConfig 连续签到奖励配置信息
     * @return 连续签到奖励配置集合
     */
	public List<TSigninRewardsFixedConfig> selectTSigninRewardsFixedConfigList(TSigninRewardsFixedConfig tSigninRewardsFixedConfig);
	
	/**
     * 新增连续签到奖励配置
     * 
     * @param tSigninRewardsFixedConfig 连续签到奖励配置信息
     * @return 结果
     */
	public int insertTSigninRewardsFixedConfig(TSigninRewardsFixedConfig tSigninRewardsFixedConfig);
	
	/**
     * 修改连续签到奖励配置
     * 
     * @param tSigninRewardsFixedConfig 连续签到奖励配置信息
     * @return 结果
     */
	public int updateTSigninRewardsFixedConfig(TSigninRewardsFixedConfig tSigninRewardsFixedConfig);
	
	/**
     * 删除连续签到奖励配置
     * 
     * @param tSigninRewardsFixedConfigId 连续签到奖励配置ID
     * @return 结果
     */
	public int deleteTSigninRewardsFixedConfigById(Long tSigninRewardsFixedConfigId);
	
	/**
     * 批量删除连续签到奖励配置
     * 
     * @param tSigninRewardsFixedConfigIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTSigninRewardsFixedConfigByIds(String[] tSigninRewardsFixedConfigIds);
	
}