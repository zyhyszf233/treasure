package com.flnet.treasure.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flnet.treasure.mapper.TSigninMapper;
import com.flnet.treasure.domain.TSignin;
import com.flnet.treasure.service.ITSigninService;
import com.flnet.common.support.Convert;

/**
 * 签到 服务层实现
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Service
public class TSigninServiceImpl implements ITSigninService 
{
	@Autowired
	private TSigninMapper tSigninMapper;

	/**
     * 查询签到信息
     * 
     * @param tSigninId 签到ID
     * @return 签到信息
     */
    @Override
	public TSignin selectTSigninById(Long tSigninId)
	{
	    return tSigninMapper.selectTSigninById(tSigninId);
	}
	
	/**
     * 查询签到列表
     * 
     * @param tSignin 签到信息
     * @return 签到集合
     */
	@Override
	public List<TSignin> selectTSigninList(TSignin tSignin)
	{
	    return tSigninMapper.selectTSigninList(tSignin);
	}
	
    /**
     * 新增签到
     * 
     * @param tSignin 签到信息
     * @return 结果
     */
	@Override
	public int insertTSignin(TSignin tSignin)
	{
	    return tSigninMapper.insertTSignin(tSignin);
	}
	
	/**
     * 修改签到
     * 
     * @param tSignin 签到信息
     * @return 结果
     */
	@Override
	public int updateTSignin(TSignin tSignin)
	{
	    return tSigninMapper.updateTSignin(tSignin);
	}

	/**
     * 删除签到对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTSigninByIds(String ids)
	{
		return tSigninMapper.deleteTSigninByIds(Convert.toStrArray(ids));
	}
	
}
