package com.flnet.web.controller.treasure;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.flnet.common.annotation.Log;
import com.flnet.common.enums.BusinessType;
import com.flnet.treasure.domain.TAddress;
import com.flnet.treasure.service.ITAddressService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 地址 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tAddress")
public class TAddressController extends BaseController
{
    private String prefix = "treasure/tAddress";
	
	@Autowired
	private ITAddressService tAddressService;
	
	@RequiresPermissions("treasure:tAddress:view")
	@GetMapping()
	public String tAddress()
	{
	    return prefix + "/tAddress";
	}
	
	/**
	 * 查询地址列表
	 */
	@RequiresPermissions("treasure:tAddress:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TAddress tAddress)
	{
		startPage();
        List<TAddress> list = tAddressService.selectTAddressList(tAddress);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出地址列表
	 */
	@RequiresPermissions("treasure:tAddress:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TAddress tAddress)
    {
    	List<TAddress> list = tAddressService.selectTAddressList(tAddress);
        ExcelUtil<TAddress> util = new ExcelUtil<TAddress>(TAddress.class);
        return util.exportExcel(list, "tAddress");
    }
	
	/**
	 * 新增地址
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存地址
	 */
	@RequiresPermissions("treasure:tAddress:add")
	@Log(title = "地址", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TAddress tAddress)
	{		
		return toAjax(tAddressService.insertTAddress(tAddress));
	}

	/**
	 * 修改地址
	 */
	@GetMapping("/edit/{addressId}")
	public String edit(@PathVariable("addressId") Long addressId, ModelMap mmap)
	{
		TAddress tAddress = tAddressService.selectTAddressById(addressId);
		mmap.put("tAddress", tAddress);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存地址
	 */
	@RequiresPermissions("treasure:tAddress:edit")
	@Log(title = "地址", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TAddress tAddress)
	{		
		return toAjax(tAddressService.updateTAddress(tAddress));
	}
	
	/**
	 * 删除地址
	 */
	@RequiresPermissions("treasure:tAddress:remove")
	@Log(title = "地址", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tAddressService.deleteTAddressByIds(ids));
	}
	
}
