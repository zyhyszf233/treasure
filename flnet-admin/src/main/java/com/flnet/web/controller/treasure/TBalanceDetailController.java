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
import com.flnet.treasure.domain.TBalanceDetail;
import com.flnet.treasure.service.ITBalanceDetailService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 获取奖励记录 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tBalanceDetail")
public class TBalanceDetailController extends BaseController
{
    private String prefix = "treasure/tBalanceDetail";
	
	@Autowired
	private ITBalanceDetailService tBalanceDetailService;
	
	@RequiresPermissions("treasure:tBalanceDetail:view")
	@GetMapping()
	public String tBalanceDetail()
	{
	    return prefix + "/tBalanceDetail";
	}
	
	/**
	 * 查询获取奖励记录列表
	 */
	@RequiresPermissions("treasure:tBalanceDetail:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TBalanceDetail tBalanceDetail)
	{
		startPage();
        List<TBalanceDetail> list = tBalanceDetailService.selectTBalanceDetailList(tBalanceDetail);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出获取奖励记录列表
	 */
	@RequiresPermissions("treasure:tBalanceDetail:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TBalanceDetail tBalanceDetail)
    {
    	List<TBalanceDetail> list = tBalanceDetailService.selectTBalanceDetailList(tBalanceDetail);
        ExcelUtil<TBalanceDetail> util = new ExcelUtil<TBalanceDetail>(TBalanceDetail.class);
        return util.exportExcel(list, "tBalanceDetail");
    }
	
	/**
	 * 新增获取奖励记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存获取奖励记录
	 */
	@RequiresPermissions("treasure:tBalanceDetail:add")
	@Log(title = "获取奖励记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TBalanceDetail tBalanceDetail)
	{		
		return toAjax(tBalanceDetailService.insertTBalanceDetail(tBalanceDetail));
	}

	/**
	 * 修改获取奖励记录
	 */
	@GetMapping("/edit/{balanceDetailId}")
	public String edit(@PathVariable("balanceDetailId") Long balanceDetailId, ModelMap mmap)
	{
		TBalanceDetail tBalanceDetail = tBalanceDetailService.selectTBalanceDetailById(balanceDetailId);
		mmap.put("tBalanceDetail", tBalanceDetail);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存获取奖励记录
	 */
	@RequiresPermissions("treasure:tBalanceDetail:edit")
	@Log(title = "获取奖励记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TBalanceDetail tBalanceDetail)
	{		
		return toAjax(tBalanceDetailService.updateTBalanceDetail(tBalanceDetail));
	}
	
	/**
	 * 删除获取奖励记录
	 */
	@RequiresPermissions("treasure:tBalanceDetail:remove")
	@Log(title = "获取奖励记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tBalanceDetailService.deleteTBalanceDetailByIds(ids));
	}
	
}
