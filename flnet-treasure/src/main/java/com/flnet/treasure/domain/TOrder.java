package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 订单表 t_order
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TOrder extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long orderId;
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
	/** 订单状态 */
	private String state;
	/** 收货信息 */
	private Long addressId;
	/** 买家留言 */
	private String buyerRemark;
	/** 订单编码 */
	private String code;
	/**  */
	private Float freeFee;
	/** 兑换类型 */
	private String orderType;
	/** 运费 */
	private Float freightFee;
	/** 发货提醒 */
	private String remindSendRemark;
	/** 商品信息 */
	private Long goodsId;
	/** 订单号 */
	private String orderNo;
	/** 运单号 */
	private String sendNo;
	/**  */
	private Long memberId;

	public void setOrderId(Long orderId) 
	{
		this.orderId = orderId;
	}

	public Long getOrderId() 
	{
		return orderId;
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
	public void setState(String state) 
	{
		this.state = state;
	}

	public String getState() 
	{
		return state;
	}
	public void setAddressId(Long addressId) 
	{
		this.addressId = addressId;
	}

	public Long getAddressId() 
	{
		return addressId;
	}
	public void setBuyerRemark(String buyerRemark) 
	{
		this.buyerRemark = buyerRemark;
	}

	public String getBuyerRemark() 
	{
		return buyerRemark;
	}
	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	public void setFreeFee(Float freeFee) 
	{
		this.freeFee = freeFee;
	}

	public Float getFreeFee() 
	{
		return freeFee;
	}
	public void setOrderType(String orderType) 
	{
		this.orderType = orderType;
	}

	public String getOrderType() 
	{
		return orderType;
	}
	public void setFreightFee(Float freightFee) 
	{
		this.freightFee = freightFee;
	}

	public Float getFreightFee() 
	{
		return freightFee;
	}
	public void setRemindSendRemark(String remindSendRemark) 
	{
		this.remindSendRemark = remindSendRemark;
	}

	public String getRemindSendRemark() 
	{
		return remindSendRemark;
	}
	public void setGoodsId(Long goodsId) 
	{
		this.goodsId = goodsId;
	}

	public Long getGoodsId() 
	{
		return goodsId;
	}
	public void setOrderNo(String orderNo) 
	{
		this.orderNo = orderNo;
	}

	public String getOrderNo() 
	{
		return orderNo;
	}
	public void setSendNo(String sendNo) 
	{
		this.sendNo = sendNo;
	}

	public String getSendNo() 
	{
		return sendNo;
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
            .append("orderId", getOrderId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("remark", getRemark())
            .append("state", getState())
            .append("addressId", getAddressId())
            .append("buyerRemark", getBuyerRemark())
            .append("code", getCode())
            .append("freeFee", getFreeFee())
            .append("orderType", getOrderType())
            .append("freightFee", getFreightFee())
            .append("remindSendRemark", getRemindSendRemark())
            .append("goodsId", getGoodsId())
            .append("orderNo", getOrderNo())
            .append("sendNo", getSendNo())
            .append("memberId", getMemberId())
            .toString();
    }
}
