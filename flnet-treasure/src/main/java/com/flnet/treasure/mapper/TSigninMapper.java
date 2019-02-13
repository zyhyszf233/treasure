package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TSignin;
import java.util.List;	

/**
 * 签到 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TSigninMapper 
{
	/**
     * 查询签到信息
     * 
     * @param tSigninId 签到ID
     * @return 签到信息
     */
	public TSignin selectTSigninById(Long tSigninId);
	
	/**
     * 查询签到列表
     * 
     * @param tSignin 签到信息
     * @return 签到集合
     */
	public List<TSignin> selectTSigninList(TSignin tSignin);
	
	/**
     * 新增签到
     * 
     * @param tSignin 签到信息
     * @return 结果
     */
	public int insertTSignin(TSignin tSignin);
	
	/**
     * 修改签到
     * 
     * @param tSignin 签到信息
     * @return 结果
     */
	public int updateTSignin(TSignin tSignin);
	
	/**
     * 删除签到
     * 
     * @param tSigninId 签到ID
     * @return 结果
     */
	public int deleteTSigninById(Long tSigninId);
	
	/**
     * 批量删除签到
     * 
     * @param tSigninIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTSigninByIds(String[] tSigninIds);
	
}