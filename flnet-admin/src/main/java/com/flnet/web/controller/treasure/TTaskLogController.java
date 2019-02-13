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
import com.flnet.treasure.domain.TTaskLog;
import com.flnet.treasure.service.ITTaskLogService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 用户任务记录 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tTaskLog")
public class TTaskLogController extends BaseController
{
    private String prefix = "treasure/tTaskLog";
	
	@Autowired
	private ITTaskLogService tTaskLogService;
	
	@RequiresPermissions("treasure:tTaskLog:view")
	@GetMapping()
	public String tTaskLog()
	{
	    return prefix + "/tTaskLog";
	}
	
	/**
	 * 查询用户任务记录列表
	 */
	@RequiresPermissions("treasure:tTaskLog:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TTaskLog tTaskLog)
	{
		startPage();
        List<TTaskLog> list = tTaskLogService.selectTTaskLogList(tTaskLog);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户任务记录列表
	 */
	@RequiresPermissions("treasure:tTaskLog:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TTaskLog tTaskLog)
    {
    	List<TTaskLog> list = tTaskLogService.selectTTaskLogList(tTaskLog);
        ExcelUtil<TTaskLog> util = new ExcelUtil<TTaskLog>(TTaskLog.class);
        return util.exportExcel(list, "tTaskLog");
    }
	
	/**
	 * 新增用户任务记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户任务记录
	 */
	@RequiresPermissions("treasure:tTaskLog:add")
	@Log(title = "用户任务记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TTaskLog tTaskLog)
	{		
		return toAjax(tTaskLogService.insertTTaskLog(tTaskLog));
	}

	/**
	 * 修改用户任务记录
	 */
	@GetMapping("/edit/{taskLogId}")
	public String edit(@PathVariable("taskLogId") Long taskLogId, ModelMap mmap)
	{
		TTaskLog tTaskLog = tTaskLogService.selectTTaskLogById(taskLogId);
		mmap.put("tTaskLog", tTaskLog);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户任务记录
	 */
	@RequiresPermissions("treasure:tTaskLog:edit")
	@Log(title = "用户任务记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TTaskLog tTaskLog)
	{		
		return toAjax(tTaskLogService.updateTTaskLog(tTaskLog));
	}
	
	/**
	 * 删除用户任务记录
	 */
	@RequiresPermissions("treasure:tTaskLog:remove")
	@Log(title = "用户任务记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tTaskLogService.deleteTTaskLogByIds(ids));
	}
	
}
