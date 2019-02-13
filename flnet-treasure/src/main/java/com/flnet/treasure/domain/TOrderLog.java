package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 订单记录�? t_order_log
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TOrderLog extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long orderLogId;
	/**  */
	private Long orderId;

	/** 订单状�?? */
	private String orderState;
	/**  */
	private String changeState;
	/** 状�?�信�? */
	private String stateInfo;
	/**  */
	private Date createTime;
	/** 操作�? */
	private Long operator;

	public void setOrderLogId(Long orderLogId) 
	{
		this.orderLogId = orderLogId;
	}

	public Long getOrderLogId() 
	{
		return orderLogId;
	}
	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public Long getOrderId() 
	{
		return orderId;
	}

	public void setOrderState(String orderState) 
	{
		this.orderState = orderState;
	}

	public String getOrderState() 
	{
		return orderState;
	}
	public void setChangeState(String changeState) 
	{
		this.changeState = changeState;
	}

	public String getChangeState() 
	{
		return changeState;
	}
	public void setStateInfo(String stateInfo) 
	{
		this.stateInfo = stateInfo;
	}

	public String getStateInfo() 
	{
		return stateInfo;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setOperator(Long operator) 
	{
		this.operator = operator;
	}

	public Long getOperator() 
	{
		return operator;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderLogId", getOrderLogId())
            .append("orderId", getOrderId())
            .append("orderState", getOrderState())
            .append("changeState", getChangeState())
            .append("stateInfo", getStateInfo())
            .append("createTime", getCreateTime())
            .append("operator", getOperator())
            .toString();
    }
}
