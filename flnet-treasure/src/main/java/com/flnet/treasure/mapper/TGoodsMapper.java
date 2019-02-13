package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TGoods;
import java.util.List;	

/**
 * 商品管理 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TGoodsMapper 
{
	/**
     * 查询商品管理信息
     * 
     * @param goodsId 商品管理ID
     * @return 商品管理信息
     */
	public TGoods selectTGoodsById(Long goodsId);
	
	/**
     * 查询商品管理列表
     * 
     * @param tGoods 商品管理信息
     * @return 商品管理集合
     */
	public List<TGoods> selectTGoodsList(TGoods tGoods);
	
	/**
     * 新增商品管理
     * 
     * @param tGoods 商品管理信息
     * @return 结果
     */
	public int insertTGoods(TGoods tGoods);
	
	/**
     * 修改商品管理
     * 
     * @param tGoods 商品管理信息
     * @return 结果
     */
	public int updateTGoods(TGoods tGoods);
	
	/**
     * 删除商品管理
     * 
     * @param goodsId 商品管理ID
     * @return 结果
     */
	public int deleteTGoodsById(Long goodsId);
	
	/**
     * 批量删除商品管理
     * 
     * @param goodsIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTGoodsByIds(String[] goodsIds);
	
}