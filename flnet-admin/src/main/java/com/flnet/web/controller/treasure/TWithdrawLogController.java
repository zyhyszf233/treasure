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
import com.flnet.treasure.domain.TWithdrawLog;
import com.flnet.treasure.service.ITWithdrawLogService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 提现记录 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tWithdrawLog")
public class TWithdrawLogController extends BaseController
{
    private String prefix = "treasure/tWithdrawLog";
	
	@Autowired
	private ITWithdrawLogService tWithdrawLogService;
	
	@RequiresPermissions("treasure:tWithdrawLog:view")
	@GetMapping()
	public String tWithdrawLog()
	{
	    return prefix + "/tWithdrawLog";
	}
	
	/**
	 * 查询提现记录列表
	 */
	@RequiresPermissions("treasure:tWithdrawLog:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TWithdrawLog tWithdrawLog)
	{
		startPage();
        List<TWithdrawLog> list = tWithdrawLogService.selectTWithdrawLogList(tWithdrawLog);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出提现记录列表
	 */
	@RequiresPermissions("treasure:tWithdrawLog:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TWithdrawLog tWithdrawLog)
    {
    	List<TWithdrawLog> list = tWithdrawLogService.selectTWithdrawLogList(tWithdrawLog);
        ExcelUtil<TWithdrawLog> util = new ExcelUtil<TWithdrawLog>(TWithdrawLog.class);
        return util.exportExcel(list, "tWithdrawLog");
    }
	
	/**
	 * 新增提现记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存提现记录
	 */
	@RequiresPermissions("treasure:tWithdrawLog:add")
	@Log(title = "提现记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TWithdrawLog tWithdrawLog)
	{		
		return toAjax(tWithdrawLogService.insertTWithdrawLog(tWithdrawLog));
	}

	/**
	 * 修改提现记录
	 */
	@GetMapping("/edit/{withdrawLogId}")
	public String edit(@PathVariable("withdrawLogId") Long withdrawLogId, ModelMap mmap)
	{
		TWithdrawLog tWithdrawLog = tWithdrawLogService.selectTWithdrawLogById(withdrawLogId);
		mmap.put("tWithdrawLog", tWithdrawLog);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存提现记录
	 */
	@RequiresPermissions("treasure:tWithdrawLog:edit")
	@Log(title = "提现记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TWithdrawLog tWithdrawLog)
	{		
		return toAjax(tWithdrawLogService.updateTWithdrawLog(tWithdrawLog));
	}
	
	/**
	 * 删除提现记录
	 */
	@RequiresPermissions("treasure:tWithdrawLog:remove")
	@Log(title = "提现记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tWithdrawLogService.deleteTWithdrawLogByIds(ids));
	}
	
}
