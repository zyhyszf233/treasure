package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TSigninGroupMapper;
import com.flnet.treasure.domain.TSigninGroup;
import com.flnet.treasure.service.ITSigninGroupService;
import com.flnet.common.support.Convert;

/**
 * 连续签到记录 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TSigninGroupServiceImpl implements ITSigninGroupService 
{
	@Autowired
	private TSigninGroupMapper tSigninGroupMapper;

	/**
     * 查询连续签到记录信息
     * 
     * @param tSigninGroupId 连续签到记录ID
     * @return 连续签到记录信息
     */
    @Override
	public TSigninGroup selectTSigninGroupById(Long tSigninGroupId)
	{
	    return tSigninGroupMapper.selectTSigninGroupById(tSigninGroupId);
	}
	
	/**
     * 查询连续签到记录列表
     * 
     * @param tSigninGroup 连续签到记录信息
     * @return 连续签到记录集合
     */
	@Override
	public List<TSigninGroup> selectTSigninGroupList(TSigninGroup tSigninGroup)
	{
	    return tSigninGroupMapper.selectTSigninGroupList(tSigninGroup);
	}
	
    /**
     * 新增连续签到记录
     * 
     * @param tSigninGroup 连续签到记录信息
     * @return 结果
     */
	@Override
	public int insertTSigninGroup(TSigninGroup tSigninGroup)
	{
	    return tSigninGroupMapper.insertTSigninGroup(tSigninGroup);
	}
	
	/**
     * 修改连续签到记录
     * 
     * @param tSigninGroup 连续签到记录信息
     * @return 结果
     */
	@Override
	public int updateTSigninGroup(TSigninGroup tSigninGroup)
	{
	    return tSigninGroupMapper.updateTSigninGroup(tSigninGroup);
	}

	/**
     * 删除连续签到记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTSigninGroupByIds(String ids)
	{
		return tSigninGroupMapper.deleteTSigninGroupByIds(Convert.toStrArray(ids));
	}
	
}
