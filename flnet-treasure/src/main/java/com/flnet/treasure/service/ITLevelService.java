package com.flnet.treasure.service;

import com.flnet.treasure.domain.TLevel;
import java.util.List;

/**
 * 等级管理 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITLevelService 
{
	/**
     * 查询等级管理信息
     * 
     * @param levelId 等级管理ID
     * @return 等级管理信息
     */
	public TLevel selectTLevelById(Long levelId);
	
	/**
     * 查询等级管理列表
     * 
     * @param tLevel 等级管理信息
     * @return 等级管理集合
     */
	public List<TLevel> selectTLevelList(TLevel tLevel);
	
	/**
     * 新增等级管理
     * 
     * @param tLevel 等级管理信息
     * @return 结果
     */
	public int insertTLevel(TLevel tLevel);
	
	/**
     * 修改等级管理
     * 
     * @param tLevel 等级管理信息
     * @return 结果
     */
	public int updateTLevel(TLevel tLevel);
		
	/**
     * 删除等级管理信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTLevelByIds(String ids);
	
}
