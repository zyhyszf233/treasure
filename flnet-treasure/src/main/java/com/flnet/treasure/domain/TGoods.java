package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 商品管理表 t_goods
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TGoods extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long goodsId;
	/** 商品名称 */
	private String name;
	/** 商品描述 */
	private String title;
	/**  */
	private String goodsCode;
	/** 图片 */
	private String iconPath;
	/** 市价 */
	private Float price;
	/** 兑换价 */
	private Float exchangePrice;
	/** 积分 */
	private Integer coin;
	/** 限购 */
	private Integer limitateBuy;
	/** 库存 */
	private Integer stock;
	/** 已售 */
	private Integer sold;
	/** 帐号状态（0正常 1停用） */
	private String status;
	/**  */
	private Date createTime;
	/**  */
	private Long creator;
	/**  */
	private Date modifyTime;
	/**  */
	private Long modifier;
	/** 类型 */
	private Long categoryId;
	/**  */
	private String remark;

	public void setGoodsId(Long goodsId) 
	{
		this.goodsId = goodsId;
	}

	public Long getGoodsId() 
	{
		return goodsId;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	public void setGoodsCode(String goodsCode) 
	{
		this.goodsCode = goodsCode;
	}

	public String getGoodsCode() 
	{
		return goodsCode;
	}
	public void setIconPath(String iconPath) 
	{
		this.iconPath = iconPath;
	}

	public String getIconPath() 
	{
		return iconPath;
	}
	public void setPrice(Float price) 
	{
		this.price = price;
	}

	public Float getPrice() 
	{
		return price;
	}
	public void setExchangePrice(Float exchangePrice) 
	{
		this.exchangePrice = exchangePrice;
	}

	public Float getExchangePrice() 
	{
		return exchangePrice;
	}
	public void setCoin(Integer coin) 
	{
		this.coin = coin;
	}

	public Integer getCoin() 
	{
		return coin;
	}
	public void setLimitateBuy(Integer limitateBuy) 
	{
		this.limitateBuy = limitateBuy;
	}

	public Integer getLimitateBuy() 
	{
		return limitateBuy;
	}
	public void setStock(Integer stock) 
	{
		this.stock = stock;
	}

	public Integer getStock() 
	{
		return stock;
	}
	public void setSold(Integer sold) 
	{
		this.sold = sold;
	}

	public Integer getSold() 
	{
		return sold;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
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
	public void setCategoryId(Long categoryId) 
	{
		this.categoryId = categoryId;
	}

	public Long getCategoryId() 
	{
		return categoryId;
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
            .append("goodsId", getGoodsId())
            .append("name", getName())
            .append("title", getTitle())
            .append("goodsCode", getGoodsCode())
            .append("iconPath", getIconPath())
            .append("price", getPrice())
            .append("exchangePrice", getExchangePrice())
            .append("coin", getCoin())
            .append("limitateBuy", getLimitateBuy())
            .append("stock", getStock())
            .append("sold", getSold())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("categoryId", getCategoryId())
            .append("remark", getRemark())
            .toString();
    }
}
