package com.flnet.treasure.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.flnet.common.base.BaseEntity;
import java.util.Date;

/**
 * 地址表 t_address
 * 
 * @author flnet
 * @date 2019-02-13
 */
public class TAddress extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/**  */
	private Long addressId;
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
	/** 省 */
	private String province;
	/** 市 */
	private String city;
	/** 县/区 */
	private String county;
	/** 省市县 */
	private String brief;
	/** 详细地址 */
	private String detail;
	/** 是否默认 */
	private Integer isdefault;
	/** 用户姓名 */
	private String name;
	/** 电话号码 */
	private String telephone;
	/** 帐号状态（0正常 1停用） */
	private String status;
	/**  */
	private Long memberId;

	public void setAddressId(Long addressId) 
	{
		this.addressId = addressId;
	}

	public Long getAddressId() 
	{
		return addressId;
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
	public void setProvince(String province) 
	{
		this.province = province;
	}

	public String getProvince() 
	{
		return province;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}

	public String getCity() 
	{
		return city;
	}
	public void setCounty(String county) 
	{
		this.county = county;
	}

	public String getCounty() 
	{
		return county;
	}
	public void setBrief(String brief) 
	{
		this.brief = brief;
	}

	public String getBrief() 
	{
		return brief;
	}
	public void setDetail(String detail) 
	{
		this.detail = detail;
	}

	public String getDetail() 
	{
		return detail;
	}
	public void setIsdefault(Integer isdefault) 
	{
		this.isdefault = isdefault;
	}

	public Integer getIsdefault() 
	{
		return isdefault;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setTelephone(String telephone) 
	{
		this.telephone = telephone;
	}

	public String getTelephone() 
	{
		return telephone;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
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
            .append("addressId", getAddressId())
            .append("createTime", getCreateTime())
            .append("creator", getCreator())
            .append("modifyTime", getModifyTime())
            .append("modifier", getModifier())
            .append("remark", getRemark())
            .append("province", getProvince())
            .append("city", getCity())
            .append("county", getCounty())
            .append("brief", getBrief())
            .append("detail", getDetail())
            .append("isdefault", getIsdefault())
            .append("name", getName())
            .append("telephone", getTelephone())
            .append("status", getStatus())
            .append("memberId", getMemberId())
            .toString();
    }
}
