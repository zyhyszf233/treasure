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
import com.flnet.treasure.domain.TMember;
import com.flnet.treasure.service.ITMemberService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 用户管理 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tMember")
public class TMemberController extends BaseController
{
    private String prefix = "treasure/tMember";
	
	@Autowired
	private ITMemberService tMemberService;
	
	@RequiresPermissions("treasure:tMember:view")
	@GetMapping()
	public String tMember()
	{
	    return prefix + "/tMember";
	}
	
	/**
	 * 查询用户管理列表
	 */
	@RequiresPermissions("treasure:tMember:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TMember tMember)
	{
		startPage();
        List<TMember> list = tMemberService.selectTMemberList(tMember);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户管理列表
	 */
	@RequiresPermissions("treasure:tMember:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TMember tMember)
    {
    	List<TMember> list = tMemberService.selectTMemberList(tMember);
        ExcelUtil<TMember> util = new ExcelUtil<TMember>(TMember.class);
        return util.exportExcel(list, "tMember");
    }
	
	/**
	 * 新增用户管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户管理
	 */
	@RequiresPermissions("treasure:tMember:add")
	@Log(title = "用户管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TMember tMember)
	{		
		return toAjax(tMemberService.insertTMember(tMember));
	}

	/**
	 * 修改用户管理
	 */
	@GetMapping("/edit/{memberId}")
	public String edit(@PathVariable("memberId") Long memberId, ModelMap mmap)
	{
		TMember tMember = tMemberService.selectTMemberById(memberId);
		mmap.put("tMember", tMember);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户管理
	 */
	@RequiresPermissions("treasure:tMember:edit")
	@Log(title = "用户管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TMember tMember)
	{		
		return toAjax(tMemberService.updateTMember(tMember));
	}
	
	/**
	 * 删除用户管理
	 */
	@RequiresPermissions("treasure:tMember:remove")
	@Log(title = "用户管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tMemberService.deleteTMemberByIds(ids));
	}
	
}
