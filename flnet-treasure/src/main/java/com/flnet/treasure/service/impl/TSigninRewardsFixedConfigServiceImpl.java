package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TSigninRewardsFixedConfigMapper;
import com.flnet.treasure.domain.TSigninRewardsFixedConfig;
import com.flnet.treasure.service.ITSigninRewardsFixedConfigService;
import com.flnet.common.support.Convert;

/**
 * 连续签到奖励配置 服务层实现
 * 
 * @author flnet
 * @date 2019-02-12
 */
@Service
public class TSigninRewardsFixedConfigServiceImpl implements ITSigninRewardsFixedConfigService 
{
	@Autowired
	private TSigninRewardsFixedConfigMapper tSigninRewardsFixedConfigMapper;

	/**
     * 查询连续签到奖励配置信息
     * 
     * @param tSigninRewardsFixedConfigId 连续签到奖励配置ID
     * @return 连续签到奖励配置信息
     */
    @Override
	public TSigninRewardsFixedConfig selectTSigninRewardsFixedConfigById(Long tSigninRewardsFixedConfigId)
	{
	    return tSigninRewardsFixedConfigMapper.selectTSigninRewardsFixedConfigById(tSigninRewardsFixedConfigId);
	}
	
	/**
     * 查询连续签到奖励配置列表
     * 
     * @param tSigninRewardsFixedConfig 连续签到奖励配置信息
     * @return 连续签到奖励配置集合
     */
	@Override
	public List<TSigninRewardsFixedConfig> selectTSigninRewardsFixedConfigList(TSigninRewardsFixedConfig tSigninRewardsFixedConfig)
	{
	    return tSigninRewardsFixedConfigMapper.selectTSigninRewardsFixedConfigList(tSigninRewardsFixedConfig);
	}
	
    /**
     * 新增连续签到奖励配置
     * 
     * @param tSigninRewardsFixedConfig 连续签到奖励配置信息
     * @return 结果
     */
	@Override
	public int insertTSigninRewardsFixedConfig(TSigninRewardsFixedConfig tSigninRewardsFixedConfig)
	{
	    return tSigninRewardsFixedConfigMapper.insertTSigninRewardsFixedConfig(tSigninRewardsFixedConfig);
	}
	
	/**
     * 修改连续签到奖励配置
     * 
     * @param tSigninRewardsFixedConfig 连续签到奖励配置信息
     * @return 结果
     */
	@Override
	public int updateTSigninRewardsFixedConfig(TSigninRewardsFixedConfig tSigninRewardsFixedConfig)
	{
	    return tSigninRewardsFixedConfigMapper.updateTSigninRewardsFixedConfig(tSigninRewardsFixedConfig);
	}

	/**
     * 删除连续签到奖励配置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTSigninRewardsFixedConfigByIds(String ids)
	{
		return tSigninRewardsFixedConfigMapper.deleteTSigninRewardsFixedConfigByIds(Convert.toStrArray(ids));
	}
	
}
