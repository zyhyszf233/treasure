package com.flnet.treasure.service;

import com.flnet.treasure.domain.TSigninGroup;
import java.util.List;

/**
 * 连续签到记录 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITSigninGroupService 
{
	/**
     * 查询连续签到记录信息
     * 
     * @param tSigninGroupId 连续签到记录ID
     * @return 连续签到记录信息
     */
	public TSigninGroup selectTSigninGroupById(Long tSigninGroupId);
	
	/**
     * 查询连续签到记录列表
     * 
     * @param tSigninGroup 连续签到记录信息
     * @return 连续签到记录集合
     */
	public List<TSigninGroup> selectTSigninGroupList(TSigninGroup tSigninGroup);
	
	/**
     * 新增连续签到记录
     * 
     * @param tSigninGroup 连续签到记录信息
     * @return 结果
     */
	public int insertTSigninGroup(TSigninGroup tSigninGroup);
	
	/**
     * 修改连续签到记录
     * 
     * @param tSigninGroup 连续签到记录信息
     * @return 结果
     */
	public int updateTSigninGroup(TSigninGroup tSigninGroup);
		
	/**
     * 删除连续签到记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTSigninGroupByIds(String ids);
	
}
