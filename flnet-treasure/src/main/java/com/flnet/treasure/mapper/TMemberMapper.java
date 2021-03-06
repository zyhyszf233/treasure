package com.flnet.treasure.mapper;

import com.flnet.treasure.domain.TMember;
import java.util.List;	

/**
 * 用户管理 数据层
 * 
 * @author flnet
 * @date 2019-02-13
 */
public interface TMemberMapper 
{
	/**
     * 查询用户管理信息
     * 
     * @param memberId 用户管理ID
     * @return 用户管理信息
     */
	public TMember selectTMemberById(Long memberId);
	
	/**
     * 查询用户管理列表
     * 
     * @param tMember 用户管理信息
     * @return 用户管理集合
     */
	public List<TMember> selectTMemberList(TMember tMember);
	
	/**
     * 新增用户管理
     * 
     * @param tMember 用户管理信息
     * @return 结果
     */
	public int insertTMember(TMember tMember);
	
	/**
     * 修改用户管理
     * 
     * @param tMember 用户管理信息
     * @return 结果
     */
	public int updateTMember(TMember tMember);
	
	/**
     * 删除用户管理
     * 
     * @param memberId 用户管理ID
     * @return 结果
     */
	public int deleteTMemberById(Long memberId);
	
	/**
     * 批量删除用户管理
     * 
     * @param memberIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTMemberByIds(String[] memberIds);
	
}