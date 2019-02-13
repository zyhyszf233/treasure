package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TKeyDebrisDetail;
import java.util.List;	

/**
 * 获取碎片钥匙记录 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TKeyDebrisDetailMapper 
{
	/**
     * 查询获取碎片钥匙记录信息
     * 
     * @param keyDebrisDetailId 获取碎片钥匙记录ID
     * @return 获取碎片钥匙记录信息
     */
	public TKeyDebrisDetail selectTKeyDebrisDetailById(Long keyDebrisDetailId);
	
	/**
     * 查询获取碎片钥匙记录列表
     * 
     * @param tKeyDebrisDetail 获取碎片钥匙记录信息
     * @return 获取碎片钥匙记录集合
     */
	public List<TKeyDebrisDetail> selectTKeyDebrisDetailList(TKeyDebrisDetail tKeyDebrisDetail);
	
	/**
     * 新增获取碎片钥匙记录
     * 
     * @param tKeyDebrisDetail 获取碎片钥匙记录信息
     * @return 结果
     */
	public int insertTKeyDebrisDetail(TKeyDebrisDetail tKeyDebrisDetail);
	
	/**
     * 修改获取碎片钥匙记录
     * 
     * @param tKeyDebrisDetail 获取碎片钥匙记录信息
     * @return 结果
     */
	public int updateTKeyDebrisDetail(TKeyDebrisDetail tKeyDebrisDetail);
	
	/**
     * 删除获取碎片钥匙记录
     * 
     * @param keyDebrisDetailId 获取碎片钥匙记录ID
     * @return 结果
     */
	public int deleteTKeyDebrisDetailById(Long keyDebrisDetailId);
	
	/**
     * 批量删除获取碎片钥匙记录
     * 
     * @param keyDebrisDetailIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTKeyDebrisDetailByIds(String[] keyDebrisDetailIds);
	
}