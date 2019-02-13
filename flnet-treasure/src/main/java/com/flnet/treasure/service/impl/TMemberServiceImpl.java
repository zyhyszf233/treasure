package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TMemberMapper;
import com.flnet.treasure.domain.TMember;
import com.flnet.treasure.service.ITMemberService;
import com.flnet.common.support.Convert;

/**
 * 用户管理 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TMemberServiceImpl implements ITMemberService 
{
	@Autowired
	private TMemberMapper tMemberMapper;

	/**
     * 查询用户管理信息
     * 
     * @param memberId 用户管理ID
     * @return 用户管理信息
     */
    @Override
	public TMember selectTMemberById(Long memberId)
	{
	    return tMemberMapper.selectTMemberById(memberId);
	}
	
	/**
     * 查询用户管理列表
     * 
     * @param tMember 用户管理信息
     * @return 用户管理集合
     */
	@Override
	public List<TMember> selectTMemberList(TMember tMember)
	{
	    return tMemberMapper.selectTMemberList(tMember);
	}
	
    /**
     * 新增用户管理
     * 
     * @param tMember 用户管理信息
     * @return 结果
     */
	@Override
	public int insertTMember(TMember tMember)
	{
	    return tMemberMapper.insertTMember(tMember);
	}
	
	/**
     * 修改用户管理
     * 
     * @param tMember 用户管理信息
     * @return 结果
     */
	@Override
	public int updateTMember(TMember tMember)
	{
	    return tMemberMapper.updateTMember(tMember);
	}

	/**
     * 删除用户管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTMemberByIds(String ids)
	{
		return tMemberMapper.deleteTMemberByIds(Convert.toStrArray(ids));
	}
	
}
