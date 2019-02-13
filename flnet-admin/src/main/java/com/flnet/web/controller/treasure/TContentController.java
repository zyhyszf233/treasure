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
import com.flnet.treasure.domain.TContent;
import com.flnet.treasure.service.ITContentService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 内容管理 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tContent")
public class TContentController extends BaseController
{
    private String prefix = "treasure/tContent";
	
	@Autowired
	private ITContentService tContentService;
	
	@RequiresPermissions("treasure:tContent:view")
	@GetMapping()
	public String tContent()
	{
	    return prefix + "/tContent";
	}
	
	/**
	 * 查询内容管理列表
	 */
	@RequiresPermissions("treasure:tContent:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TContent tContent)
	{
		startPage();
        List<TContent> list = tContentService.selectTContentList(tContent);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出内容管理列表
	 */
	@RequiresPermissions("treasure:tContent:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TContent tContent)
    {
    	List<TContent> list = tContentService.selectTContentList(tContent);
        ExcelUtil<TContent> util = new ExcelUtil<TContent>(TContent.class);
        return util.exportExcel(list, "tContent");
    }
	
	/**
	 * 新增内容管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存内容管理
	 */
	@RequiresPermissions("treasure:tContent:add")
	@Log(title = "内容管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TContent tContent)
	{		
		return toAjax(tContentService.insertTContent(tContent));
	}

	/**
	 * 修改内容管理
	 */
	@GetMapping("/edit/{contentId}")
	public String edit(@PathVariable("contentId") Long contentId, ModelMap mmap)
	{
		TContent tContent = tContentService.selectTContentById(contentId);
		mmap.put("tContent", tContent);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存内容管理
	 */
	@RequiresPermissions("treasure:tContent:edit")
	@Log(title = "内容管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TContent tContent)
	{		
		return toAjax(tContentService.updateTContent(tContent));
	}
	
	/**
	 * 删除内容管理
	 */
	@RequiresPermissions("treasure:tContent:remove")
	@Log(title = "内容管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tContentService.deleteTContentByIds(ids));
	}
	
}
