package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 用户管理表 t_member
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TMember extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long memberId;
	/** 登录次数 */
	private Integer loginCount;
	/** 用户级别 */
	private Integer levelGrade;
	/** 碎片数量 */
	private Integer debrisQuantity;
	/** 钥匙数量 */
	private Integer keyQuantity;
	/** 余额 */
	private Float balance;
	/**  */
	private Date createTime;
	/**  */
	private Long creator;
	/**  */
	private Date modifyTime;
	/**  */
	private Long modifier;
	/** 用户代码 */
	private String code;
	/** 用户性别（0男 1女 2未知） */
	private String gender;
	/** 头像路径 */
	private String iconPath;
	/** 用户手机号 */
	private String mobile;
	/** 微信昵称 */
	private String nickname;
	/**  */
	private Long parentMemberId;
	/** 用户状态（0正常 1停用） */
	private String status;
	/**  */
	private Long userId;
	/**  */
	private String address;
	/** 微信号 */
	private String weixin;
	/**  */
	private String openId;

	public void setMemberId(Long memberId) 
	{
		this.memberId = memberId;
	}

	public Long getMemberId() 
	{
		return memberId;
	}
	public void setLoginCount(Integer loginCount) 
	{
		this.loginCount = loginCount;
	}

	public Integer getLoginCount() 
	{
		return loginCount;
	}
	public void setLevelGrade(Integer levelGrade) 
	{
		this.levelGrade = levelGrade;
	}

	public Integer getLevelGrade() 
	{
		return levelGrade;
	}
	public void setDebrisQuantity(Integer debrisQuantity) 
	{
		this.debrisQuantity = debrisQuantity;
	}

	public Integer getDebrisQuantity() 
	{
		return debrisQuantity;
	}
	public void setKeyQuantity(Integer keyQuantity) 
	{
		this.keyQuantity = keyQuantity;
	}

	public Integer getKeyQuantity() 
	{
		return keyQuantity;
	}
	public void setBalance(Float balance) 
	{
		this.balance = balance;
	}

	public Float getBalance() 
	{
		return balance;
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
	public void setCode(String code) 
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public String getGender() 
	{
		return gender;
	}
	public void setIconPath(String iconPath) 
	{
		this.iconPath = iconPath;
	}

	public String getIconPath() 
	{
		return iconPath;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}

	public String getMobile() 
	{
		return mobile;
	}
	public void setNickname(String nickname) 
	{
		this.nickname = nickname;
	}

	public String getNickname() 
	{
		return nickname;
	}
	public void setParentMemberId(Long parentMemberId) 
	{
		this.parentMemberId = parentMemberId;
	}

	public Long getParentMemberId() 
	{
		return parentMemberId;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getAddress() 
	{
		return address;
	}
	public void setWeixin(String weixin) 
	{
		this.weixin = weixin;
	}

	public String getWeixin() 
	{
		return weixin;
	}
	public void setOpenId(String openId) 
	{
		this.openId = openId;
	}

	public String getOpenId() 
	{
		return openId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("memberId", getMemberId())
            .append("loginCount", getLoginCount())
            .append("levelGrade", getLevelGrade())
            .append("debrisQuantity", getDebrisQuantity())
            .append("keyQuantity", getKeyQuantity())
            .append("balance", getBalance())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("code", getCode())
            .append("gender", getGender())
            .append("iconPath", getIconPath())
            .append("mobile", getMobile())
            .append("nickname", getNickname())
            .append("parentMemberId", getParentMemberId())
            .append("status", getStatus())
            .append("userId", getUserId())
            .append("address", getAddress())
            .append("weixin", getWeixin())
            .append("openId", getOpenId())
            .toString();
    }
}
