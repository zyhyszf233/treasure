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
import com.flnet.treasure.domain.TOrderLog;
import com.flnet.treasure.service.ITOrderLogService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 订单记录 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tOrderLog")
public class TOrderLogController extends BaseController
{
    private String prefix = "treasure/tOrderLog";
	
	@Autowired
	private ITOrderLogService tOrderLogService;
	
	@RequiresPermissions("treasure:tOrderLog:view")
	@GetMapping()
	public String tOrderLog()
	{
	    return prefix + "/tOrderLog";
	}
	
	/**
	 * 查询订单记录列表
	 */
	@RequiresPermissions("treasure:tOrderLog:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TOrderLog tOrderLog)
	{
		startPage();
        List<TOrderLog> list = tOrderLogService.selectTOrderLogList(tOrderLog);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出订单记录列表
	 */
	@RequiresPermissions("treasure:tOrderLog:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TOrderLog tOrderLog)
    {
    	List<TOrderLog> list = tOrderLogService.selectTOrderLogList(tOrderLog);
        ExcelUtil<TOrderLog> util = new ExcelUtil<TOrderLog>(TOrderLog.class);
        return util.exportExcel(list, "tOrderLog");
    }
	
	/**
	 * 新增订单记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存订单记录
	 */
	@RequiresPermissions("treasure:tOrderLog:add")
	@Log(title = "订单记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TOrderLog tOrderLog)
	{		
		return toAjax(tOrderLogService.insertTOrderLog(tOrderLog));
	}

	/**
	 * 修改订单记录
	 */
	@GetMapping("/edit/{orderLogId}")
	public String edit(@PathVariable("orderLogId") Long orderLogId, ModelMap mmap)
	{
		TOrderLog tOrderLog = tOrderLogService.selectTOrderLogById(orderLogId);
		mmap.put("tOrderLog", tOrderLog);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存订单记录
	 */
	@RequiresPermissions("treasure:tOrderLog:edit")
	@Log(title = "订单记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TOrderLog tOrderLog)
	{		
		return toAjax(tOrderLogService.updateTOrderLog(tOrderLog));
	}
	
	/**
	 * 删除订单记录
	 */
	@RequiresPermissions("treasure:tOrderLog:remove")
	@Log(title = "订单记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tOrderLogService.deleteTOrderLogByIds(ids));
	}
	
}
