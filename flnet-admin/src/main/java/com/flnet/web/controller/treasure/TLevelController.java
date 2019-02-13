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
import com.flnet.treasure.domain.TLevel;
import com.flnet.treasure.service.ITLevelService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 等级管理 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tLevel")
public class TLevelController extends BaseController
{
    private String prefix = "treasure/tLevel";
	
	@Autowired
	private ITLevelService tLevelService;
	
	@RequiresPermissions("treasure:tLevel:view")
	@GetMapping()
	public String tLevel()
	{
	    return prefix + "/tLevel";
	}
	
	/**
	 * 查询等级管理列表
	 */
	@RequiresPermissions("treasure:tLevel:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TLevel tLevel)
	{
		startPage();
        List<TLevel> list = tLevelService.selectTLevelList(tLevel);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出等级管理列表
	 */
	@RequiresPermissions("treasure:tLevel:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TLevel tLevel)
    {
    	List<TLevel> list = tLevelService.selectTLevelList(tLevel);
        ExcelUtil<TLevel> util = new ExcelUtil<TLevel>(TLevel.class);
        return util.exportExcel(list, "tLevel");
    }
	
	/**
	 * 新增等级管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存等级管理
	 */
	@RequiresPermissions("treasure:tLevel:add")
	@Log(title = "等级管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TLevel tLevel)
	{		
		return toAjax(tLevelService.insertTLevel(tLevel));
	}

	/**
	 * 修改等级管理
	 */
	@GetMapping("/edit/{levelId}")
	public String edit(@PathVariable("levelId") Long levelId, ModelMap mmap)
	{
		TLevel tLevel = tLevelService.selectTLevelById(levelId);
		mmap.put("tLevel", tLevel);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存等级管理
	 */
	@RequiresPermissions("treasure:tLevel:edit")
	@Log(title = "等级管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TLevel tLevel)
	{		
		return toAjax(tLevelService.updateTLevel(tLevel));
	}
	
	/**
	 * 删除等级管理
	 */
	@RequiresPermissions("treasure:tLevel:remove")
	@Log(title = "等级管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tLevelService.deleteTLevelByIds(ids));
	}
	
}
