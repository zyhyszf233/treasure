package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TGoodsMapper;
import com.flnet.treasure.domain.TGoods;
import com.flnet.treasure.service.ITGoodsService;
import com.flnet.common.support.Convert;

/**
 * 商品管理 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TGoodsServiceImpl implements ITGoodsService 
{
	@Autowired
	private TGoodsMapper tGoodsMapper;

	/**
     * 查询商品管理信息
     * 
     * @param goodsId 商品管理ID
     * @return 商品管理信息
     */
    @Override
	public TGoods selectTGoodsById(Long goodsId)
	{
	    return tGoodsMapper.selectTGoodsById(goodsId);
	}
	
	/**
     * 查询商品管理列表
     * 
     * @param tGoods 商品管理信息
     * @return 商品管理集合
     */
	@Override
	public List<TGoods> selectTGoodsList(TGoods tGoods)
	{
	    return tGoodsMapper.selectTGoodsList(tGoods);
	}
	
    /**
     * 新增商品管理
     * 
     * @param tGoods 商品管理信息
     * @return 结果
     */
	@Override
	public int insertTGoods(TGoods tGoods)
	{
	    return tGoodsMapper.insertTGoods(tGoods);
	}
	
	/**
     * 修改商品管理
     * 
     * @param tGoods 商品管理信息
     * @return 结果
     */
	@Override
	public int updateTGoods(TGoods tGoods)
	{
	    return tGoodsMapper.updateTGoods(tGoods);
	}

	/**
     * 删除商品管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTGoodsByIds(String ids)
	{
		return tGoodsMapper.deleteTGoodsByIds(Convert.toStrArray(ids));
	}
	
}
