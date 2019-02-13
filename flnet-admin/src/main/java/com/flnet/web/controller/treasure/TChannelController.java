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
import com.flnet.treasure.domain.TChannel;
import com.flnet.treasure.service.ITChannelService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 渠道管理 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tChannel")
public class TChannelController extends BaseController
{
    private String prefix = "treasure/tChannel";
	
	@Autowired
	private ITChannelService tChannelService;
	
	@RequiresPermissions("treasure:tChannel:view")
	@GetMapping()
	public String tChannel()
	{
	    return prefix + "/tChannel";
	}
	
	/**
	 * 查询渠道管理列表
	 */
	@RequiresPermissions("treasure:tChannel:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TChannel tChannel)
	{
		startPage();
        List<TChannel> list = tChannelService.selectTChannelList(tChannel);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出渠道管理列表
	 */
	@RequiresPermissions("treasure:tChannel:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TChannel tChannel)
    {
    	List<TChannel> list = tChannelService.selectTChannelList(tChannel);
        ExcelUtil<TChannel> util = new ExcelUtil<TChannel>(TChannel.class);
        return util.exportExcel(list, "tChannel");
    }
	
	/**
	 * 新增渠道管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存渠道管理
	 */
	@RequiresPermissions("treasure:tChannel:add")
	@Log(title = "渠道管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TChannel tChannel)
	{		
		return toAjax(tChannelService.insertTChannel(tChannel));
	}

	/**
	 * 修改渠道管理
	 */
	@GetMapping("/edit/{channelId}")
	public String edit(@PathVariable("channelId") Long channelId, ModelMap mmap)
	{
		TChannel tChannel = tChannelService.selectTChannelById(channelId);
		mmap.put("tChannel", tChannel);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存渠道管理
	 */
	@RequiresPermissions("treasure:tChannel:edit")
	@Log(title = "渠道管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TChannel tChannel)
	{		
		return toAjax(tChannelService.updateTChannel(tChannel));
	}
	
	/**
	 * 删除渠道管理
	 */
	@RequiresPermissions("treasure:tChannel:remove")
	@Log(title = "渠道管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tChannelService.deleteTChannelByIds(ids));
	}
	
}
