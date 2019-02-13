package com.flnet.treasure.service;

import com.flnet.treasure.domain.TGoodsCategory;
import java.util.List;

/**
 * 商品分类 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITGoodsCategoryService 
{
	/**
     * 查询商品分类信息
     * 
     * @param categoryId 商品分类ID
     * @return 商品分类信息
     */
	public TGoodsCategory selectTGoodsCategoryById(Long categoryId);
	
	/**
     * 查询商品分类列表
     * 
     * @param tGoodsCategory 商品分类信息
     * @return 商品分类集合
     */
	public List<TGoodsCategory> selectTGoodsCategoryList(TGoodsCategory tGoodsCategory);
	
	/**
     * 新增商品分类
     * 
     * @param tGoodsCategory 商品分类信息
     * @return 结果
     */
	public int insertTGoodsCategory(TGoodsCategory tGoodsCategory);
	
	/**
     * 修改商品分类
     * 
     * @param tGoodsCategory 商品分类信息
     * @return 结果
     */
	public int updateTGoodsCategory(TGoodsCategory tGoodsCategory);
		
	/**
     * 删除商品分类信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTGoodsCategoryByIds(String ids);
	
}
