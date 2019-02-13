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
import com.flnet.treasure.domain.TSignin;
import com.flnet.treasure.service.ITSigninService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 签到 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tSignin")
public class TSigninController extends BaseController
{
    private String prefix = "treasure/tSignin";
	
	@Autowired
	private ITSigninService tSigninService;
	
	@RequiresPermissions("treasure:tSignin:view")
	@GetMapping()
	public String tSignin()
	{
	    return prefix + "/tSignin";
	}
	
	/**
	 * 查询签到列表
	 */
	@RequiresPermissions("treasure:tSignin:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TSignin tSignin)
	{
		startPage();
        List<TSignin> list = tSigninService.selectTSigninList(tSignin);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出签到列表
	 */
	@RequiresPermissions("treasure:tSignin:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TSignin tSignin)
    {
    	List<TSignin> list = tSigninService.selectTSigninList(tSignin);
        ExcelUtil<TSignin> util = new ExcelUtil<TSignin>(TSignin.class);
        return util.exportExcel(list, "tSignin");
    }
	
	/**
	 * 新增签到
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存签到
	 */
	@RequiresPermissions("treasure:tSignin:add")
	@Log(title = "签到", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TSignin tSignin)
	{		
		return toAjax(tSigninService.insertTSignin(tSignin));
	}

	/**
	 * 修改签到
	 */
	@GetMapping("/edit/{tSigninId}")
	public String edit(@PathVariable("tSigninId") Long tSigninId, ModelMap mmap)
	{
		TSignin tSignin = tSigninService.selectTSigninById(tSigninId);
		mmap.put("tSignin", tSignin);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存签到
	 */
	@RequiresPermissions("treasure:tSignin:edit")
	@Log(title = "签到", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TSignin tSignin)
	{		
		return toAjax(tSigninService.updateTSignin(tSignin));
	}
	
	/**
	 * 删除签到
	 */
	@RequiresPermissions("treasure:tSignin:remove")
	@Log(title = "签到", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tSigninService.deleteTSigninByIds(ids));
	}
	
}
