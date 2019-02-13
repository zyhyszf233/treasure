package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 连续签到奖励配置表 t_signin_rewards_fixed_config
 * 
 * @author flnet
 * @date 2019-02-12
 */
public class TSigninRewardsFixedConfig extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long tSigninRewardsFixedConfigId;
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
	/** 奖励数量 */
	private Integer rewardsQuantity;
	/** 连续次数 */
	private Integer continuesQuantity;
	/** 奖励类型 */
	private Integer rewardsType;
	/** 用户状态（0正常 1停用） */
	private String status;

	public void setTSigninRewardsFixedConfigId(Long tSigninRewardsFixedConfigId) 
	{
		this.tSigninRewardsFixedConfigId = tSigninRewardsFixedConfigId;
	}

	public Long getTSigninRewardsFixedConfigId() 
	{
		return tSigninRewardsFixedConfigId;
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
	public void setRewardsQuantity(Integer rewardsQuantity) 
	{
		this.rewardsQuantity = rewardsQuantity;
	}

	public Integer getRewardsQuantity() 
	{
		return rewardsQuantity;
	}
	public void setContinuesQuantity(Integer continuesQuantity) 
	{
		this.continuesQuantity = continuesQuantity;
	}

	public Integer getContinuesQuantity() 
	{
		return continuesQuantity;
	}
	public void setRewardsType(Integer rewardsType) 
	{
		this.rewardsType = rewardsType;
	}

	public Integer getRewardsType() 
	{
		return rewardsType;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tSigninRewardsFixedConfigId", getTSigninRewardsFixedConfigId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("remark", getRemark())
            .append("rewardsQuantity", getRewardsQuantity())
            .append("continuesQuantity", getContinuesQuantity())
            .append("rewardsType", getRewardsType())
            .append("status", getStatus())
            .toString();
    }
}
