package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TOrder;
import java.util.List;	

/**
 * 订单 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TOrderMapper 
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
     * 删除订单
     * 
     * @param orderId 订单ID
     * @return 结果
     */
	public int deleteTOrderById(Long orderId);
	
	/**
     * 批量删除订单
     * 
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTOrderByIds(String[] orderIds);
	
}