package com.flnet.treasure.service;

import com.flnet.treasure.domain.TOrder;
import java.util.List;

/**
 * 订单 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITOrderService 
{
	/**
     * 查询订单信息
     * 
     * @param orderId 订单ID
     * @return 订单信息
     */
	public TOrder selectTOrderById(Long orderId);
	
	/**
     * 查询订单列表
     * 
     * @param tOrder 订单信息
     * @return 订单集合
     */
	public List<TOrder> selectTOrderList(TOrder tOrder);
	
	/**
     * 新增订单
     * 
     * @param tOrder 订单信息
     * @return 结果
     */
	public int insertTOrder(TOrder tOrder);
	
	/**
     * 修改订单
     * 
     * @param tOrder 订单信息
     * @return 结果
     */
	public int updateTOrder(TOrder tOrder);
		
	/**
     * 删除订单信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTOrderByIds(String ids);
	
}
