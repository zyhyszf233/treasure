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
import com.flnet.treasure.domain.TSigninGroup;
import com.flnet.treasure.service.ITSigninGroupService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 连续签到记录 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tSigninGroup")
public class TSigninGroupController extends BaseController
{
    private String prefix = "treasure/tSigninGroup";
	
	@Autowired
	private ITSigninGroupService tSigninGroupService;
	
	@RequiresPermissions("treasure:tSigninGroup:view")
	@GetMapping()
	public String tSigninGroup()
	{
	    return prefix + "/tSigninGroup";
	}
	
	/**
	 * 查询连续签到记录列表
	 */
	@RequiresPermissions("treasure:tSigninGroup:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TSigninGroup tSigninGroup)
	{
		startPage();
        List<TSigninGroup> list = tSigninGroupService.selectTSigninGroupList(tSigninGroup);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出连续签到记录列表
	 */
	@RequiresPermissions("treasure:tSigninGroup:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TSigninGroup tSigninGroup)
    {
    	List<TSigninGroup> list = tSigninGroupService.selectTSigninGroupList(tSigninGroup);
        ExcelUtil<TSigninGroup> util = new ExcelUtil<TSigninGroup>(TSigninGroup.class);
        return util.exportExcel(list, "tSigninGroup");
    }
	
	/**
	 * 新增连续签到记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存连续签到记录
	 */
	@RequiresPermissions("treasure:tSigninGroup:add")
	@Log(title = "连续签到记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TSigninGroup tSigninGroup)
	{		
		return toAjax(tSigninGroupService.insertTSigninGroup(tSigninGroup));
	}

	/**
	 * 修改连续签到记录
	 */
	@GetMapping("/edit/{tSigninGroupId}")
	public String edit(@PathVariable("tSigninGroupId") Long tSigninGroupId, ModelMap mmap)
	{
		TSigninGroup tSigninGroup = tSigninGroupService.selectTSigninGroupById(tSigninGroupId);
		mmap.put("tSigninGroup", tSigninGroup);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存连续签到记录
	 */
	@RequiresPermissions("treasure:tSigninGroup:edit")
	@Log(title = "连续签到记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TSigninGroup tSigninGroup)
	{		
		return toAjax(tSigninGroupService.updateTSigninGroup(tSigninGroup));
	}
	
	/**
	 * 删除连续签到记录
	 */
	@RequiresPermissions("treasure:tSigninGroup:remove")
	@Log(title = "连续签到记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tSigninGroupService.deleteTSigninGroupByIds(ids));
	}
	
}
