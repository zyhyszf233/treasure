package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 签到奖励记录�? t_signin_rewards_fixed
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TSigninRewardsFixed extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long tSigninRewardsFixedId;
	/**  */
	private Date createTime;
	/**  */
	private Long creator;
	/**  */
	private Date modifyTime;
	/**  */
	private Long modifier;
	/**  */
	private String remark;
	/**  */
	private Long tSigninId;
	/**  */
	private Long tSigninGroupId;
	/**  */
	private Long tSigninRewardsFixedConfigId;
	/**  */
	private Long memberId;
	/** 奖励数量 */
	private Integer continuesQuantity;
	/** 奖励数量 */
	private Integer rewardsQuantity;
	/**  */
	private String status;
	/** 奖励类型 */
	private Integer rewardsType;

	public void setTSigninRewardsFixedId(Long tSigninRewardsFixedId) 
	{
		this.tSigninRewardsFixedId = tSigninRewardsFixedId;
	}

	public Long getTSigninRewardsFixedId() 
	{
		return tSigninRewardsFixedId;
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
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}
	public void setTSigninId(Long tSigninId) 
	{
		this.tSigninId = tSigninId;
	}

	public Long getTSigninId() 
	{
		return tSigninId;
	}
	public void setTSigninGroupId(Long tSigninGroupId) 
	{
		this.tSigninGroupId = tSigninGroupId;
	}

	public Long getTSigninGroupId() 
	{
		return tSigninGroupId;
	}
	public void setTSigninRewardsFixedConfigId(Long tSigninRewardsFixedConfigId) 
	{
		this.tSigninRewardsFixedConfigId = tSigninRewardsFixedConfigId;
	}

	public Long getTSigninRewardsFixedConfigId() 
	{
		return tSigninRewardsFixedConfigId;
	}
	public void setMemberId(Long memberId) 
	{
		this.memberId = memberId;
	}

	public Long getMemberId() 
	{
		return memberId;
	}

	public void setContinuesQuantity(Integer continuesQuantity) 
	{
		this.continuesQuantity = continuesQuantity;
	}

	public Integer getContinuesQuantity() 
	{
		return continuesQuantity;
	}
	public void setRewardsQuantity(Integer rewardsQuantity) 
	{
		this.rewardsQuantity = rewardsQuantity;
	}

	public Integer getRewardsQuantity() 
	{
		return rewardsQuantity;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setRewardsType(Integer rewardsType) 
	{
		this.rewardsType = rewardsType;
	}

	public Integer getRewardsType() 
	{
		return rewardsType;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tSigninRewardsFixedId", getTSigninRewardsFixedId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("remark", getRemark())
            .append("tSigninId", getTSigninId())
            .append("tSigninGroupId", getTSigninGroupId())
            .append("tSigninRewardsFixedConfigId", getTSigninRewardsFixedConfigId())
            .append("memberId", getMemberId())
            .append("continuesQuantity", getContinuesQuantity())
            .append("rewardsQuantity", getRewardsQuantity())
            .append("status", getStatus())
            .append("rewardsType", getRewardsType())
            .toString();
    }
}
