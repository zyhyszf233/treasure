package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TLevel;
import java.util.List;	

/**
 * 等级管理 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TLevelMapper 
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
     * 删除等级管理
     * 
     * @param levelId 等级管理ID
     * @return 结果
     */
	public int deleteTLevelById(Long levelId);
	
	/**
     * 批量删除等级管理
     * 
     * @param levelIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTLevelByIds(String[] levelIds);
	
}