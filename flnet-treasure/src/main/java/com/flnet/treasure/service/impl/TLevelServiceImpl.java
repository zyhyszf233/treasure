package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TLevelMapper;
import com.flnet.treasure.domain.TLevel;
import com.flnet.treasure.service.ITLevelService;
import com.flnet.common.support.Convert;

/**
 * 等级管理 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TLevelServiceImpl implements ITLevelService 
{
	@Autowired
	private TLevelMapper tLevelMapper;

	/**
     * 查询等级管理信息
     * 
     * @param levelId 等级管理ID
     * @return 等级管理信息
     */
    @Override
	public TLevel selectTLevelById(Long levelId)
	{
	    return tLevelMapper.selectTLevelById(levelId);
	}
	
	/**
     * 查询等级管理列表
     * 
     * @param tLevel 等级管理信息
     * @return 等级管理集合
     */
	@Override
	public List<TLevel> selectTLevelList(TLevel tLevel)
	{
	    return tLevelMapper.selectTLevelList(tLevel);
	}
	
    /**
     * 新增等级管理
     * 
     * @param tLevel 等级管理信息
     * @return 结果
     */
	@Override
	public int insertTLevel(TLevel tLevel)
	{
	    return tLevelMapper.insertTLevel(tLevel);
	}
	
	/**
     * 修改等级管理
     * 
     * @param tLevel 等级管理信息
     * @return 结果
     */
	@Override
	public int updateTLevel(TLevel tLevel)
	{
	    return tLevelMapper.updateTLevel(tLevel);
	}

	/**
     * 删除等级管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTLevelByIds(String ids)
	{
		return tLevelMapper.deleteTLevelByIds(Convert.toStrArray(ids));
	}
	
}
