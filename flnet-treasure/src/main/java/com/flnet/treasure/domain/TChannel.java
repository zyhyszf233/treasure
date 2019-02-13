package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 渠道管理表 t_channel
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TChannel extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long channelId;
	/**  */
	private Date createTime;
	/**  */
	private Long creator;
	/**  */
	private Date modifyTime;
	/**  */
	private Long modifier;
	/** 名称 */
	private String name;
	/** Appid */
	private String appId;
	/** 缩略图 */
	private String iconPath;
	/** 二维码图 */
	private String qrcodePath;
	/** 对方路径 */
	private String pagePath;
	/** 我方路径 */
	private String mePagePath;
	/** 描述 */
	private String descr;
	/** 帐号状态（0正常 1停用） */
	private String status;

	public void setChannelId(Long channelId) 
	{
		this.channelId = channelId;
	}

	public Long getChannelId() 
	{
		return channelId;
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
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setAppId(String appId) 
	{
		this.appId = appId;
	}

	public String getAppId() 
	{
		return appId;
	}
	public void setIconPath(String iconPath) 
	{
		this.iconPath = iconPath;
	}

	public String getIconPath() 
	{
		return iconPath;
	}
	public void setQrcodePath(String qrcodePath) 
	{
		this.qrcodePath = qrcodePath;
	}

	public String getQrcodePath() 
	{
		return qrcodePath;
	}
	public void setPagePath(String pagePath) 
	{
		this.pagePath = pagePath;
	}

	public String getPagePath() 
	{
		return pagePath;
	}
	public void setMePagePath(String mePagePath) 
	{
		this.mePagePath = mePagePath;
	}

	public String getMePagePath() 
	{
		return mePagePath;
	}
	public void setDescr(String descr) 
	{
		this.descr = descr;
	}

	public String getDescr() 
	{
		return descr;
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
            .append("channelId", getChannelId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("name", getName())
            .append("appId", getAppId())
            .append("iconPath", getIconPath())
            .append("qrcodePath", getQrcodePath())
            .append("pagePath", getPagePath())
            .append("mePagePath", getMePagePath())
            .append("descr", getDescr())
            .append("status", getStatus())
            .toString();
    }
}
