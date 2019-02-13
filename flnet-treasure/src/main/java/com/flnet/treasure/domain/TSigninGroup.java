package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 连续签到记录表 t_signin_group
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TSigninGroup extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long tSigninGroupId;
	/** 用户签到开始时间 */
	private Date createTime;
	/**  */
	private Long creator;
	/**  */
	private Long modifier;
	/**  */
	private Date modifyTime;
	/**  */
	private String remark;
	/**  */
	private String status;
	/** 连续签到次数 */
	private Integer continueQuantity;
	/**  */
	private Long memberId;

	public void setTSigninGroupId(Long tSigninGroupId) 
	{
		this.tSigninGroupId = tSigninGroupId;
	}

	public Long getTSigninGroupId() 
	{
		return tSigninGroupId;
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
	public void setModifier(Long modifier) 
	{
		this.modifier = modifier;
	}

	public Long getModifier() 
	{
		return modifier;
	}
	public void setModifyTime(Date modifyTime) 
	{
		this.modifyTime = modifyTime;
	}

	public Date getModifyTime() 
	{
		return modifyTime;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setContinueQuantity(Integer continueQuantity) 
	{
		this.continueQuantity = continueQuantity;
	}

	public Integer getContinueQuantity() 
	{
		return continueQuantity;
	}
	public void setMemberId(Long memberId) 
	{
		this.memberId = memberId;
	}

	public Long getMemberId() 
	{
		return memberId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tSigninGroupId", getTSigninGroupId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifier", getModifier())
            .append("modifyTime", getModifyTime())
            .append("remark", getRemark())
            .append("status", getStatus())
            .append("continueQuantity", getContinueQuantity())
            .append("memberId", getMemberId())
            .toString();
    }
}
