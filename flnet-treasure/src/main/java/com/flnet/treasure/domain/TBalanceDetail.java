package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 获取奖励记录表 t_balance_detail
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TBalanceDetail extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long balanceDetailId;
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
	/** 分润的金额 */
	private Float tradeAmount;
	/** 账户余额 */
	private Float remainder;
	/** 收益类型 */
	private String type;
	/**  */
	private Long memberId;

	public void setBalanceDetailId(Long balanceDetailId) 
	{
		this.balanceDetailId = balanceDetailId;
	}

	public Long getBalanceDetailId() 
	{
		return balanceDetailId;
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
	public void setTradeAmount(Float tradeAmount) 
	{
		this.tradeAmount = tradeAmount;
	}

	public Float getTradeAmount() 
	{
		return tradeAmount;
	}
	public void setRemainder(Float remainder) 
	{
		this.remainder = remainder;
	}

	public Float getRemainder() 
	{
		return remainder;
	}
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
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
            .append("balanceDetailId", getBalanceDetailId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("remark", getRemark())
            .append("tradeAmount", getTradeAmount())
            .append("remainder", getRemainder())
            .append("type", getType())
            .append("memberId", getMemberId())
            .toString();
    }
}
