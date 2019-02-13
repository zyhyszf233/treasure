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
import com.flnet.treasure.domain.TSigninRewardsFixed;
import com.flnet.treasure.service.ITSigninRewardsFixedService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 签到奖励记录 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tSigninRewardsFixed")
public class TSigninRewardsFixedController extends BaseController
{
    private String prefix = "treasure/tSigninRewardsFixed";
	
	@Autowired
	private ITSigninRewardsFixedService tSigninRewardsFixedService;
	
	@RequiresPermissions("treasure:tSigninRewardsFixed:view")
	@GetMapping()
	public String tSigninRewardsFixed()
	{
	    return prefix + "/tSigninRewardsFixed";
	}
	
	/**
	 * 查询签到奖励记录列表
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixed:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TSigninRewardsFixed tSigninRewardsFixed)
	{
		startPage();
        List<TSigninRewardsFixed> list = tSigninRewardsFixedService.selectTSigninRewardsFixedList(tSigninRewardsFixed);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出签到奖励记录列表
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixed:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TSigninRewardsFixed tSigninRewardsFixed)
    {
    	List<TSigninRewardsFixed> list = tSigninRewardsFixedService.selectTSigninRewardsFixedList(tSigninRewardsFixed);
        ExcelUtil<TSigninRewardsFixed> util = new ExcelUtil<TSigninRewardsFixed>(TSigninRewardsFixed.class);
        return util.exportExcel(list, "tSigninRewardsFixed");
    }
	
	/**
	 * 新增签到奖励记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存签到奖励记录
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixed:add")
	@Log(title = "签到奖励记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TSigninRewardsFixed tSigninRewardsFixed)
	{		
		return toAjax(tSigninRewardsFixedService.insertTSigninRewardsFixed(tSigninRewardsFixed));
	}

	/**
	 * 修改签到奖励记录
	 */
	@GetMapping("/edit/{tSigninRewardsFixedId}")
	public String edit(@PathVariable("tSigninRewardsFixedId") Long tSigninRewardsFixedId, ModelMap mmap)
	{
		TSigninRewardsFixed tSigninRewardsFixed = tSigninRewardsFixedService.selectTSigninRewardsFixedById(tSigninRewardsFixedId);
		mmap.put("tSigninRewardsFixed", tSigninRewardsFixed);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存签到奖励记录
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixed:edit")
	@Log(title = "签到奖励记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TSigninRewardsFixed tSigninRewardsFixed)
	{		
		return toAjax(tSigninRewardsFixedService.updateTSigninRewardsFixed(tSigninRewardsFixed));
	}
	
	/**
	 * 删除签到奖励记录
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixed:remove")
	@Log(title = "签到奖励记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tSigninRewardsFixedService.deleteTSigninRewardsFixedByIds(ids));
	}
	
}
