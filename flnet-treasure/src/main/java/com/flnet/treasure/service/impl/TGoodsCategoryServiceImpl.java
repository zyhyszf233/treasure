package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TGoodsCategoryMapper;
import com.flnet.treasure.domain.TGoodsCategory;
import com.flnet.treasure.service.ITGoodsCategoryService;
import com.flnet.common.support.Convert;

/**
 * 商品分类 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TGoodsCategoryServiceImpl implements ITGoodsCategoryService 
{
	@Autowired
	private TGoodsCategoryMapper tGoodsCategoryMapper;

	/**
     * 查询商品分类信息
     * 
     * @param categoryId 商品分类ID
     * @return 商品分类信息
     */
    @Override
	public TGoodsCategory selectTGoodsCategoryById(Long categoryId)
	{
	    return tGoodsCategoryMapper.selectTGoodsCategoryById(categoryId);
	}
	
	/**
     * 查询商品分类列表
     * 
     * @param tGoodsCategory 商品分类信息
     * @return 商品分类集合
     */
	@Override
	public List<TGoodsCategory> selectTGoodsCategoryList(TGoodsCategory tGoodsCategory)
	{
	    return tGoodsCategoryMapper.selectTGoodsCategoryList(tGoodsCategory);
	}
	
    /**
     * 新增商品分类
     * 
     * @param tGoodsCategory 商品分类信息
     * @return 结果
     */
	@Override
	public int insertTGoodsCategory(TGoodsCategory tGoodsCategory)
	{
	    return tGoodsCategoryMapper.insertTGoodsCategory(tGoodsCategory);
	}
	
	/**
     * 修改商品分类
     * 
     * @param tGoodsCategory 商品分类信息
     * @return 结果
     */
	@Override
	public int updateTGoodsCategory(TGoodsCategory tGoodsCategory)
	{
	    return tGoodsCategoryMapper.updateTGoodsCategory(tGoodsCategory);
	}

	/**
     * 删除商品分类对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTGoodsCategoryByIds(String ids)
	{
		return tGoodsCategoryMapper.deleteTGoodsCategoryByIds(Convert.toStrArray(ids));
	}
	
}
