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
import com.flnet.treasure.domain.TOrder;
import com.flnet.treasure.service.ITOrderService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 订单 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tOrder")
public class TOrderController extends BaseController
{
    private String prefix = "treasure/tOrder";
	
	@Autowired
	private ITOrderService tOrderService;
	
	@RequiresPermissions("treasure:tOrder:view")
	@GetMapping()
	public String tOrder()
	{
	    return prefix + "/tOrder";
	}
	
	/**
	 * 查询订单列表
	 */
	@RequiresPermissions("treasure:tOrder:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TOrder tOrder)
	{
		startPage();
        List<TOrder> list = tOrderService.selectTOrderList(tOrder);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出订单列表
	 */
	@RequiresPermissions("treasure:tOrder:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TOrder tOrder)
    {
    	List<TOrder> list = tOrderService.selectTOrderList(tOrder);
        ExcelUtil<TOrder> util = new ExcelUtil<TOrder>(TOrder.class);
        return util.exportExcel(list, "tOrder");
    }
	
	/**
	 * 新增订单
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存订单
	 */
	@RequiresPermissions("treasure:tOrder:add")
	@Log(title = "订单", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TOrder tOrder)
	{		
		return toAjax(tOrderService.insertTOrder(tOrder));
	}

	/**
	 * 修改订单
	 */
	@GetMapping("/edit/{orderId}")
	public String edit(@PathVariable("orderId") Long orderId, ModelMap mmap)
	{
		TOrder tOrder = tOrderService.selectTOrderById(orderId);
		mmap.put("tOrder", tOrder);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存订单
	 */
	@RequiresPermissions("treasure:tOrder:edit")
	@Log(title = "订单", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TOrder tOrder)
	{		
		return toAjax(tOrderService.updateTOrder(tOrder));
	}
	
	/**
	 * 删除订单
	 */
	@RequiresPermissions("treasure:tOrder:remove")
	@Log(title = "订单", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tOrderService.deleteTOrderByIds(ids));
	}
	
}
