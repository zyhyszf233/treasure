package com.flnet.treasure.service;

import com.flnet.treasure.domain.TKeyDebrisDetail;
import java.util.List;

/**
 * 获取碎片钥匙记录 服务层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface ITKeyDebrisDetailService 
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
     * 删除获取碎片钥匙记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTKeyDebrisDetailByIds(String ids);
	
}
