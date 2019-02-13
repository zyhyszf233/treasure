package com.flnet.treasure.service;

import com.flnet.treasure.domain.TContent;
import java.util.List;

/**
 * 内容管理 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITContentService 
{
	/**
     * 查询内容管理信息
     * 
     * @param contentId 内容管理ID
     * @return 内容管理信息
     */
	public TContent selectTContentById(Long contentId);
	
	/**
     * 查询内容管理列表
     * 
     * @param tContent 内容管理信息
     * @return 内容管理集合
     */
	public List<TContent> selectTContentList(TContent tContent);
	
	/**
     * 新增内容管理
     * 
     * @param tContent 内容管理信息
     * @return 结果
     */
	public int insertTContent(TContent tContent);
	
	/**
     * 修改内容管理
     * 
     * @param tContent 内容管理信息
     * @return 结果
     */
	public int updateTContent(TContent tContent);
		
	/**
     * 删除内容管理信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTContentByIds(String ids);
	
}
