package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;

/**
 * 等级管理表 t_level
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TLevel extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long levelId;
	/** 帐号状态（0正常 1停用） */
	private String status;
	/** 等级名称 */
	private String levelName;
	/** 级别 */
	private Integer levelGrade;
	/** 钥匙上限数量 */
	private Integer keyAmount;
	/** 钥匙下限数量 */
	private Integer keyLowAmount;
	/** 碎片上限数量 */
	private Integer debrisAmount;
	/** 碎片下限数量 */
	private Integer debrisLowAmount;
	/** 金额奖励 */
	private Float awardMoney;
	/** 商品奖励 */
	private Long awardGoodsId;
	/**  */
	private String remark;

	public void setLevelId(Long levelId) 
	{
		this.levelId = levelId;
	}

	public Long getLevelId() 
	{
		return levelId;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setLevelName(String levelName) 
	{
		this.levelName = levelName;
	}

	public String getLevelName() 
	{
		return levelName;
	}
	public void setLevelGrade(Integer levelGrade) 
	{
		this.levelGrade = levelGrade;
	}

	public Integer getLevelGrade() 
	{
		return levelGrade;
	}
	public void setKeyAmount(Integer keyAmount) 
	{
		this.keyAmount = keyAmount;
	}

	public Integer getKeyAmount() 
	{
		return keyAmount;
	}
	public void setKeyLowAmount(Integer keyLowAmount) 
	{
		this.keyLowAmount = keyLowAmount;
	}

	public Integer getKeyLowAmount() 
	{
		return keyLowAmount;
	}
	public void setDebrisAmount(Integer debrisAmount) 
	{
		this.debrisAmount = debrisAmount;
	}

	public Integer getDebrisAmount() 
	{
		return debrisAmount;
	}
	public void setDebrisLowAmount(Integer debrisLowAmount) 
	{
		this.debrisLowAmount = debrisLowAmount;
	}

	public Integer getDebrisLowAmount() 
	{
		return debrisLowAmount;
	}
	public void setAwardMoney(Float awardMoney) 
	{
		this.awardMoney = awardMoney;
	}

	public Float getAwardMoney() 
	{
		return awardMoney;
	}
	public void setAwardGoodsId(Long awardGoodsId) 
	{
		this.awardGoodsId = awardGoodsId;
	}

	public Long getAwardGoodsId() 
	{
		return awardGoodsId;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("levelId", getLevelId())
            .append("status", getStatus())
            .append("levelName", getLevelName())
            .append("levelGrade", getLevelGrade())
            .append("keyAmount", getKeyAmount())
            .append("keyLowAmount", getKeyLowAmount())
            .append("debrisAmount", getDebrisAmount())
            .append("debrisLowAmount", getDebrisLowAmount())
            .append("awardMoney", getAwardMoney())
            .append("awardGoodsId", getAwardGoodsId())
            .append("remark", getRemark())
            .toString();
    }
}
