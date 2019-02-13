package com.flnet.treasure.service;

import com.flnet.treasure.domain.TAddress;
import java.util.List;

/**
 * 地址 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITAddressService 
{
	/**
     * 查询地址信息
     * 
     * @param addressId 地址ID
     * @return 地址信息
     */
	public TAddress selectTAddressById(Long addressId);
	
	/**
     * 查询地址列表
     * 
     * @param tAddress 地址信息
     * @return 地址集合
     */
	public List<TAddress> selectTAddressList(TAddress tAddress);
	
	/**
     * 新增地址
     * 
     * @param tAddress 地址信息
     * @return 结果
     */
	public int insertTAddress(TAddress tAddress);
	
	/**
     * 修改地址
     * 
     * @param tAddress 地址信息
     * @return 结果
     */
	public int updateTAddress(TAddress tAddress);
		
	/**
     * 删除地址信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTAddressByIds(String ids);
	
}
