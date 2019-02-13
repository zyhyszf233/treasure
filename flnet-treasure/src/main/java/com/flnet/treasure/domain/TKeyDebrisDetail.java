package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 获取碎片钥匙记录表 t_key_debris_detail
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TKeyDebrisDetail extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long keyDebrisDetailId;
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
	/** 分润的数量 */
	private Float tradeQuantity;
	/** 得到的数量 */
	private Float remainder;
	/** 奖励类型（碎片0或钥匙1） */
	private String type;
	/**  */
	private Long memberId;

	public void setKeyDebrisDetailId(Long keyDebrisDetailId) 
	{
		this.keyDebrisDetailId = keyDebrisDetailId;
	}

	public Long getKeyDebrisDetailId() 
	{
		return keyDebrisDetailId;
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
	public void setTradeQuantity(Float tradeQuantity) 
	{
		this.tradeQuantity = tradeQuantity;
	}

	public Float getTradeQuantity() 
	{
		return tradeQuantity;
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
            .append("keyDebrisDetailId", getKeyDebrisDetailId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("remark", getRemark())
            .append("tradeQuantity", getTradeQuantity())
            .append("remainder", getRemainder())
            .append("type", getType())
            .append("memberId", getMemberId())
            .toString();
    }
}
