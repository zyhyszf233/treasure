package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;

/**
 * 商品分类表 t_goods_category
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TGoodsCategory extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long categoryId;
	/** 商品类型 */
	private String name;
	/**  */
	private String pic;
	/** 帐号状态（0正常 1停用） */
	private String status;
	/**  */
	private String title;
	/**  */
	private Long pid;
	/**  */
	private String parentIds;

	public void setCategoryId(Long categoryId) 
	{
		this.categoryId = categoryId;
	}

	public Long getCategoryId() 
	{
		return categoryId;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPic(String pic) 
	{
		this.pic = pic;
	}

	public String getPic() 
	{
		return pic;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getTitle() 
	{
		return title;
	}
	public void setPid(Long pid) 
	{
		this.pid = pid;
	}

	public Long getPid() 
	{
		return pid;
	}
	public void setParentIds(String parentIds) 
	{
		this.parentIds = parentIds;
	}

	public String getParentIds() 
	{
		return parentIds;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("categoryId", getCategoryId())
            .append("name", getName())
            .append("pic", getPic())
            .append("status", getStatus())
            .append("title", getTitle())
            .append("pid", getPid())
            .append("parentIds", getParentIds())
            .toString();
    }
}
