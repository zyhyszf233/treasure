package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TChannel;
import java.util.List;	

/**
 * 渠道管理 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TChannelMapper 
{
	/**
     * 查询渠道管理信息
     * 
     * @param channelId 渠道管理ID
     * @return 渠道管理信息
     */
	public TChannel selectTChannelById(Long channelId);
	
	/**
     * 查询渠道管理列表
     * 
     * @param tChannel 渠道管理信息
     * @return 渠道管理集合
     */
	public List<TChannel> selectTChannelList(TChannel tChannel);
	
	/**
     * 新增渠道管理
     * 
     * @param tChannel 渠道管理信息
     * @return 结果
     */
	public int insertTChannel(TChannel tChannel);
	
	/**
     * 修改渠道管理
     * 
     * @param tChannel 渠道管理信息
     * @return 结果
     */
	public int updateTChannel(TChannel tChannel);
	
	/**
     * 删除渠道管理
     * 
     * @param channelId 渠道管理ID
     * @return 结果
     */
	public int deleteTChannelById(Long channelId);
	
	/**
     * 批量删除渠道管理
     * 
     * @param channelIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTChannelByIds(String[] channelIds);
	
}