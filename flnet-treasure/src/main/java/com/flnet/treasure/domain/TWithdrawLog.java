package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 提现记录表 t_withdraw_log
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TWithdrawLog extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long withdrawLogId;
	/**  */
	private Date createTime;
	/**  */
	private Long creator;
	/** 提现金额 */
	private Float money;
	/**  */
	private String remark;
	/**  */
	private Long memberId;

	public void setWithdrawLogId(Long withdrawLogId) 
	{
		this.withdrawLogId = withdrawLogId;
	}

	public Long getWithdrawLogId() 
	{
		return withdrawLogId;
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
	public void setMoney(Float money) 
	{
		this.money = money;
	}

	public Float getMoney() 
	{
		return money;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
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
            .append("withdrawLogId", getWithdrawLogId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("money", getMoney())
            .append("remark", getRemark())
            .append("memberId", getMemberId())
            .toString();
    }
}
