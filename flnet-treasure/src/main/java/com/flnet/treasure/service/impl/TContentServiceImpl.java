package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TContentMapper;
import com.flnet.treasure.domain.TContent;
import com.flnet.treasure.service.ITContentService;
import com.flnet.common.support.Convert;

/**
 * 内容管理 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TContentServiceImpl implements ITContentService 
{
	@Autowired
	private TContentMapper tContentMapper;

	/**
     * 查询内容管理信息
     * 
     * @param contentId 内容管理ID
     * @return 内容管理信息
     */
    @Override
	public TContent selectTContentById(Long contentId)
	{
	    return tContentMapper.selectTContentById(contentId);
	}
	
	/**
     * 查询内容管理列表
     * 
     * @param tContent 内容管理信息
     * @return 内容管理集合
     */
	@Override
	public List<TContent> selectTContentList(TContent tContent)
	{
	    return tContentMapper.selectTContentList(tContent);
	}
	
    /**
     * 新增内容管理
     * 
     * @param tContent 内容管理信息
     * @return 结果
     */
	@Override
	public int insertTContent(TContent tContent)
	{
	    return tContentMapper.insertTContent(tContent);
	}
	
	/**
     * 修改内容管理
     * 
     * @param tContent 内容管理信息
     * @return 结果
     */
	@Override
	public int updateTContent(TContent tContent)
	{
	    return tContentMapper.updateTContent(tContent);
	}

	/**
     * 删除内容管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTContentByIds(String ids)
	{
		return tContentMapper.deleteTContentByIds(Convert.toStrArray(ids));
	}
	
}
