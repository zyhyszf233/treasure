package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 任务表 t_task
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TTask extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long taskId;
	/** 任务名称 */
	private String taskName;
	/** 缩略图 */
	private String iconPath;
	/** 任务名称 */
	private String qrcodePath;
	/** Appid */
	private String appId;
	/** 跳转方式 */
	private String jumpMode;
	/** 路径 */
	private String path;
	/** 说明 */
	private String descr;
	/** 奖励 */
	private Float reward;
	/** 次数限制 */
	private Integer limitCount;
	/**  */
	private Date createTime;
	/**  */
	private Long creator;
	/**  */
	private Date modifyTime;
	/**  */
	private Long modifier;
	/** 任务时间 */
	private Integer taskTime;

	public void setTaskId(Long taskId) 
	{
		this.taskId = taskId;
	}

	public Long getTaskId() 
	{
		return taskId;
	}
	public void setTaskName(String taskName) 
	{
		this.taskName = taskName;
	}

	public String getTaskName() 
	{
		return taskName;
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
	public void setAppId(String appId) 
	{
		this.appId = appId;
	}

	public String getAppId() 
	{
		return appId;
	}
	public void setJumpMode(String jumpMode) 
	{
		this.jumpMode = jumpMode;
	}

	public String getJumpMode() 
	{
		return jumpMode;
	}
	public void setPath(String path) 
	{
		this.path = path;
	}

	public String getPath() 
	{
		return path;
	}
	public void setDescr(String descr) 
	{
		this.descr = descr;
	}

	public String getDescr() 
	{
		return descr;
	}
	public void setReward(Float reward) 
	{
		this.reward = reward;
	}

	public Float getReward() 
	{
		return reward;
	}
	public void setLimitCount(Integer limitCount) 
	{
		this.limitCount = limitCount;
	}

	public Integer getLimitCount() 
	{
		return limitCount;
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
	public void setTaskTime(Integer taskTime) 
	{
		this.taskTime = taskTime;
	}

	public Integer getTaskTime() 
	{
		return taskTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskId", getTaskId())
            .append("taskName", getTaskName())
            .append("iconPath", getIconPath())
            .append("qrcodePath", getQrcodePath())
            .append("appId", getAppId())
            .append("jumpMode", getJumpMode())
            .append("path", getPath())
            .append("descr", getDescr())
            .append("reward", getReward())
            .append("limitCount", getLimitCount())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("taskTime", getTaskTime())
            .toString();
    }
}
