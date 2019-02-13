package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TKeyDebrisDetailMapper;
import com.flnet.treasure.domain.TKeyDebrisDetail;
import com.flnet.treasure.service.ITKeyDebrisDetailService;
import com.flnet.common.support.Convert;

/**
 * 获取碎片钥匙记录 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TKeyDebrisDetailServiceImpl implements ITKeyDebrisDetailService 
{
	@Autowired
	private TKeyDebrisDetailMapper tKeyDebrisDetailMapper;

	/**
     * 查询获取碎片钥匙记录信息
     * 
     * @param keyDebrisDetailId 获取碎片钥匙记录ID
     * @return 获取碎片钥匙记录信息
     */
    @Override
	public TKeyDebrisDetail selectTKeyDebrisDetailById(Long keyDebrisDetailId)
	{
	    return tKeyDebrisDetailMapper.selectTKeyDebrisDetailById(keyDebrisDetailId);
	}
	
	/**
     * 查询获取碎片钥匙记录列表
     * 
     * @param tKeyDebrisDetail 获取碎片钥匙记录信息
     * @return 获取碎片钥匙记录集合
     */
	@Override
	public List<TKeyDebrisDetail> selectTKeyDebrisDetailList(TKeyDebrisDetail tKeyDebrisDetail)
	{
	    return tKeyDebrisDetailMapper.selectTKeyDebrisDetailList(tKeyDebrisDetail);
	}
	
    /**
     * 新增获取碎片钥匙记录
     * 
     * @param tKeyDebrisDetail 获取碎片钥匙记录信息
     * @return 结果
     */
	@Override
	public int insertTKeyDebrisDetail(TKeyDebrisDetail tKeyDebrisDetail)
	{
	    return tKeyDebrisDetailMapper.insertTKeyDebrisDetail(tKeyDebrisDetail);
	}
	
	/**
     * 修改获取碎片钥匙记录
     * 
     * @param tKeyDebrisDetail 获取碎片钥匙记录信息
     * @return 结果
     */
	@Override
	public int updateTKeyDebrisDetail(TKeyDebrisDetail tKeyDebrisDetail)
	{
	    return tKeyDebrisDetailMapper.updateTKeyDebrisDetail(tKeyDebrisDetail);
	}

	/**
     * 删除获取碎片钥匙记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTKeyDebrisDetailByIds(String ids)
	{
		return tKeyDebrisDetailMapper.deleteTKeyDebrisDetailByIds(Convert.toStrArray(ids));
	}
	
}
