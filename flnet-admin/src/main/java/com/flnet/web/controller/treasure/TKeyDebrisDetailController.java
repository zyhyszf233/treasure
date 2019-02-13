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
import com.flnet.treasure.domain.TKeyDebrisDetail;
import com.flnet.treasure.service.ITKeyDebrisDetailService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 获取碎片钥匙记录 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tKeyDebrisDetail")
public class TKeyDebrisDetailController extends BaseController
{
    private String prefix = "treasure/tKeyDebrisDetail";
	
	@Autowired
	private ITKeyDebrisDetailService tKeyDebrisDetailService;
	
	@RequiresPermissions("treasure:tKeyDebrisDetail:view")
	@GetMapping()
	public String tKeyDebrisDetail()
	{
	    return prefix + "/tKeyDebrisDetail";
	}
	
	/**
	 * 查询获取碎片钥匙记录列表
	 */
	@RequiresPermissions("treasure:tKeyDebrisDetail:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TKeyDebrisDetail tKeyDebrisDetail)
	{
		startPage();
        List<TKeyDebrisDetail> list = tKeyDebrisDetailService.selectTKeyDebrisDetailList(tKeyDebrisDetail);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出获取碎片钥匙记录列表
	 */
	@RequiresPermissions("treasure:tKeyDebrisDetail:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TKeyDebrisDetail tKeyDebrisDetail)
    {
    	List<TKeyDebrisDetail> list = tKeyDebrisDetailService.selectTKeyDebrisDetailList(tKeyDebrisDetail);
        ExcelUtil<TKeyDebrisDetail> util = new ExcelUtil<TKeyDebrisDetail>(TKeyDebrisDetail.class);
        return util.exportExcel(list, "tKeyDebrisDetail");
    }
	
	/**
	 * 新增获取碎片钥匙记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存获取碎片钥匙记录
	 */
	@RequiresPermissions("treasure:tKeyDebrisDetail:add")
	@Log(title = "获取碎片钥匙记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TKeyDebrisDetail tKeyDebrisDetail)
	{		
		return toAjax(tKeyDebrisDetailService.insertTKeyDebrisDetail(tKeyDebrisDetail));
	}

	/**
	 * 修改获取碎片钥匙记录
	 */
	@GetMapping("/edit/{keyDebrisDetailId}")
	public String edit(@PathVariable("keyDebrisDetailId") Long keyDebrisDetailId, ModelMap mmap)
	{
		TKeyDebrisDetail tKeyDebrisDetail = tKeyDebrisDetailService.selectTKeyDebrisDetailById(keyDebrisDetailId);
		mmap.put("tKeyDebrisDetail", tKeyDebrisDetail);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存获取碎片钥匙记录
	 */
	@RequiresPermissions("treasure:tKeyDebrisDetail:edit")
	@Log(title = "获取碎片钥匙记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TKeyDebrisDetail tKeyDebrisDetail)
	{		
		return toAjax(tKeyDebrisDetailService.updateTKeyDebrisDetail(tKeyDebrisDetail));
	}
	
	/**
	 * 删除获取碎片钥匙记录
	 */
	@RequiresPermissions("treasure:tKeyDebrisDetail:remove")
	@Log(title = "获取碎片钥匙记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tKeyDebrisDetailService.deleteTKeyDebrisDetailByIds(ids));
	}
	
}
