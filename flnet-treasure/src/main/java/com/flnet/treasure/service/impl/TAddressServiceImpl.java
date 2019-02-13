package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TAddressMapper;
import com.flnet.treasure.domain.TAddress;
import com.flnet.treasure.service.ITAddressService;
import com.flnet.common.support.Convert;

/**
 * 地址 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TAddressServiceImpl implements ITAddressService 
{
	@Autowired
	private TAddressMapper tAddressMapper;

	/**
     * 查询地址信息
     * 
     * @param addressId 地址ID
     * @return 地址信息
     */
    @Override
	public TAddress selectTAddressById(Long addressId)
	{
	    return tAddressMapper.selectTAddressById(addressId);
	}
	
	/**
     * 查询地址列表
     * 
     * @param tAddress 地址信息
     * @return 地址集合
     */
	@Override
	public List<TAddress> selectTAddressList(TAddress tAddress)
	{
	    return tAddressMapper.selectTAddressList(tAddress);
	}
	
    /**
     * 新增地址
     * 
     * @param tAddress 地址信息
     * @return 结果
     */
	@Override
	public int insertTAddress(TAddress tAddress)
	{
	    return tAddressMapper.insertTAddress(tAddress);
	}
	
	/**
     * 修改地址
     * 
     * @param tAddress 地址信息
     * @return 结果
     */
	@Override
	public int updateTAddress(TAddress tAddress)
	{
	    return tAddressMapper.updateTAddress(tAddress);
	}

	/**
     * 删除地址对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTAddressByIds(String ids)
	{
		return tAddressMapper.deleteTAddressByIds(Convert.toStrArray(ids));
	}
	
}
