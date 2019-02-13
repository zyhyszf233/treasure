package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 用户任务记录表 t_task_log
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TTaskLog extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long taskLogId;
	/**  */
	private Long memberId;
	/**  */
	private Long taskId;
	/**  */
	private Date createTime;
	/**  */
	private Long creator;

	public void setTaskLogId(Long taskLogId) 
	{
		this.taskLogId = taskLogId;
	}

	public Long getTaskLogId() 
	{
		return taskLogId;
	}
	public void setMemberId(Long memberId) 
	{
		this.memberId = memberId;
	}

	public Long getMemberId() 
	{
		return memberId;
	}
	public void setTaskId(Long taskId) 
	{
		this.taskId = taskId;
	}

	public Long getTaskId() 
	{
		return taskId;
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

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("taskLogId", getTaskLogId())
            .append("memberId", getMemberId())
            .append("taskId", getTaskId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .toString();
    }
}
