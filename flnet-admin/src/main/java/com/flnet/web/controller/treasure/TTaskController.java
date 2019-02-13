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
import com.flnet.treasure.domain.TTask;
import com.flnet.treasure.service.ITTaskService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 任务 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tTask")
public class TTaskController extends BaseController
{
    private String prefix = "treasure/tTask";
	
	@Autowired
	private ITTaskService tTaskService;
	
	@RequiresPermissions("treasure:tTask:view")
	@GetMapping()
	public String tTask()
	{
	    return prefix + "/tTask";
	}
	
	/**
	 * 查询任务列表
	 */
	@RequiresPermissions("treasure:tTask:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TTask tTask)
	{
		startPage();
        List<TTask> list = tTaskService.selectTTaskList(tTask);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出任务列表
	 */
	@RequiresPermissions("treasure:tTask:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TTask tTask)
    {
    	List<TTask> list = tTaskService.selectTTaskList(tTask);
        ExcelUtil<TTask> util = new ExcelUtil<TTask>(TTask.class);
        return util.exportExcel(list, "tTask");
    }
	
	/**
	 * 新增任务
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存任务
	 */
	@RequiresPermissions("treasure:tTask:add")
	@Log(title = "任务", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TTask tTask)
	{		
		return toAjax(tTaskService.insertTTask(tTask));
	}

	/**
	 * 修改任务
	 */
	@GetMapping("/edit/{taskId}")
	public String edit(@PathVariable("taskId") Long taskId, ModelMap mmap)
	{
		TTask tTask = tTaskService.selectTTaskById(taskId);
		mmap.put("tTask", tTask);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存任务
	 */
	@RequiresPermissions("treasure:tTask:edit")
	@Log(title = "任务", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TTask tTask)
	{		
		return toAjax(tTaskService.updateTTask(tTask));
	}
	
	/**
	 * 删除任务
	 */
	@RequiresPermissions("treasure:tTask:remove")
	@Log(title = "任务", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tTaskService.deleteTTaskByIds(ids));
	}
	
}
