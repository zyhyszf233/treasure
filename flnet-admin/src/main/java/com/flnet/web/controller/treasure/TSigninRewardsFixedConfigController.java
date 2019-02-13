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
import com.flnet.treasure.domain.TSigninRewardsFixedConfig;
import com.flnet.treasure.service.ITSigninRewardsFixedConfigService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 连续签到奖励配置 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-12
 */
@Controller
@RequestMapping("/treasure/tSigninRewardsFixedConfig")
public class TSigninRewardsFixedConfigController extends BaseController
{
    private String prefix = "treasure/tSigninRewardsFixedConfig";
	
	@Autowired
	private ITSigninRewardsFixedConfigService tSigninRewardsFixedConfigService;
	
	@RequiresPermissions("treasure:tSigninRewardsFixedConfig:view")
	@GetMapping()
	public String tSigninRewardsFixedConfig()
	{
	    return prefix + "/tSigninRewardsFixedConfig";
	}
	
	/**
	 * 查询连续签到奖励配置列表
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixedConfig:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TSigninRewardsFixedConfig tSigninRewardsFixedConfig)
	{
		startPage();
        List<TSigninRewardsFixedConfig> list = tSigninRewardsFixedConfigService.selectTSigninRewardsFixedConfigList(tSigninRewardsFixedConfig);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出连续签到奖励配置列表
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixedConfig:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TSigninRewardsFixedConfig tSigninRewardsFixedConfig)
    {
    	List<TSigninRewardsFixedConfig> list = tSigninRewardsFixedConfigService.selectTSigninRewardsFixedConfigList(tSigninRewardsFixedConfig);
        ExcelUtil<TSigninRewardsFixedConfig> util = new ExcelUtil<TSigninRewardsFixedConfig>(TSigninRewardsFixedConfig.class);
        return util.exportExcel(list, "tSigninRewardsFixedConfig");
    }
	
	/**
	 * 新增连续签到奖励配置
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存连续签到奖励配置
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixedConfig:add")
	@Log(title = "连续签到奖励配置", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TSigninRewardsFixedConfig tSigninRewardsFixedConfig)
	{		
		return toAjax(tSigninRewardsFixedConfigService.insertTSigninRewardsFixedConfig(tSigninRewardsFixedConfig));
	}

	/**
	 * 修改连续签到奖励配置
	 */
	@GetMapping("/edit/{tSigninRewardsFixedConfigId}")
	public String edit(@PathVariable("tSigninRewardsFixedConfigId") Long tSigninRewardsFixedConfigId, ModelMap mmap)
	{
		TSigninRewardsFixedConfig tSigninRewardsFixedConfig = tSigninRewardsFixedConfigService.selectTSigninRewardsFixedConfigById(tSigninRewardsFixedConfigId);
		mmap.put("tSigninRewardsFixedConfig", tSigninRewardsFixedConfig);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存连续签到奖励配置
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixedConfig:edit")
	@Log(title = "连续签到奖励配置", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TSigninRewardsFixedConfig tSigninRewardsFixedConfig)
	{		
		return toAjax(tSigninRewardsFixedConfigService.updateTSigninRewardsFixedConfig(tSigninRewardsFixedConfig));
	}
	
	/**
	 * 删除连续签到奖励配置
	 */
	@RequiresPermissions("treasure:tSigninRewardsFixedConfig:remove")
	@Log(title = "连续签到奖励配置", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tSigninRewardsFixedConfigService.deleteTSigninRewardsFixedConfigByIds(ids));
	}
	
}
