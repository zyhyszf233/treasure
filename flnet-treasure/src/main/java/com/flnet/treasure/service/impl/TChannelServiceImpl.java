package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TChannelMapper;
import com.flnet.treasure.domain.TChannel;
import com.flnet.treasure.service.ITChannelService;
import com.flnet.common.support.Convert;

/**
 * 渠道管理 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TChannelServiceImpl implements ITChannelService 
{
	@Autowired
	private TChannelMapper tChannelMapper;

	/**
     * 查询渠道管理信息
     * 
     * @param channelId 渠道管理ID
     * @return 渠道管理信息
     */
    @Override
	public TChannel selectTChannelById(Long channelId)
	{
	    return tChannelMapper.selectTChannelById(channelId);
	}
	
	/**
     * 查询渠道管理列表
     * 
     * @param tChannel 渠道管理信息
     * @return 渠道管理集合
     */
	@Override
	public List<TChannel> selectTChannelList(TChannel tChannel)
	{
	    return tChannelMapper.selectTChannelList(tChannel);
	}
	
    /**
     * 新增渠道管理
     * 
     * @param tChannel 渠道管理信息
     * @return 结果
     */
	@Override
	public int insertTChannel(TChannel tChannel)
	{
	    return tChannelMapper.insertTChannel(tChannel);
	}
	
	/**
     * 修改渠道管理
     * 
     * @param tChannel 渠道管理信息
     * @return 结果
     */
	@Override
	public int updateTChannel(TChannel tChannel)
	{
	    return tChannelMapper.updateTChannel(tChannel);
	}

	/**
     * 删除渠道管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTChannelByIds(String ids)
	{
		return tChannelMapper.deleteTChannelByIds(Convert.toStrArray(ids));
	}
	
}
