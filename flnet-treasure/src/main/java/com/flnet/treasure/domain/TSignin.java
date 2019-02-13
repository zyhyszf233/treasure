package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 签到表 t_signin
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TSignin extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 用户签到ID */
	private Long tSigninId;
	/** 用户签到时间 */
	private Date createTime;
	/**  */
	private Long creator;
	/** 用户签到标注 */
	private String remark;
	/**  */
	private Date modifyTime;
	/**  */
	private Long modifier;

	public void setTSigninId(Long tSigninId) 
	{
		this.tSigninId = tSigninId;
	}

	public Long getTSigninId() 
	{
		return tSigninId;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setCreator(Long creator) 
	{
		this.creator = creator;
	}

	public Long getCreator() 
	{
		return creator;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}
	public void setModifyTime(Date modifyTime) 
	{
		this.modifyTime = modifyTime;
	}

	public Date getModifyTime() 
	{
		return modifyTime;
	}
	public void setModifier(Long modifier) 
	{
		this.modifier = modifier;
	}

	public Long getModifier() 
	{
		return modifier;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tSigninId", getTSigninId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("remark", getRemark())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .toString();
    }
}
