package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TOrderMapper;
import com.flnet.treasure.domain.TOrder;
import com.flnet.treasure.service.ITOrderService;
import com.flnet.common.support.Convert;

/**
 * 订单 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TOrderServiceImpl implements ITOrderService 
{
	@Autowired
	private TOrderMapper tOrderMapper;

	/**
     * 查询订单信息
     * 
     * @param orderId 订单ID
     * @return 订单信息
     */
    @Override
	public TOrder selectTOrderById(Long orderId)
	{
	    return tOrderMapper.selectTOrderById(orderId);
	}
	
	/**
     * 查询订单列表
     * 
     * @param tOrder 订单信息
     * @return 订单集合
     */
	@Override
	public List<TOrder> selectTOrderList(TOrder tOrder)
	{
	    return tOrderMapper.selectTOrderList(tOrder);
	}
	
    /**
     * 新增订单
     * 
     * @param tOrder 订单信息
     * @return 结果
     */
	@Override
	public int insertTOrder(TOrder tOrder)
	{
	    return tOrderMapper.insertTOrder(tOrder);
	}
	
	/**
     * 修改订单
     * 
     * @param tOrder 订单信息
     * @return 结果
     */
	@Override
	public int updateTOrder(TOrder tOrder)
	{
	    return tOrderMapper.updateTOrder(tOrder);
	}

	/**
     * 删除订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTOrderByIds(String ids)
	{
		return tOrderMapper.deleteTOrderByIds(Convert.toStrArray(ids));
	}
	
}
