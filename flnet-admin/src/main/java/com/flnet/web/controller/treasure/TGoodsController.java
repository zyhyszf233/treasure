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
import com.flnet.treasure.domain.TGoods;
import com.flnet.treasure.service.ITGoodsService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 商品管理 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tGoods")
public class TGoodsController extends BaseController
{
    private String prefix = "treasure/tGoods";
	
	@Autowired
	private ITGoodsService tGoodsService;
	
	@RequiresPermissions("treasure:tGoods:view")
	@GetMapping()
	public String tGoods()
	{
	    return prefix + "/tGoods";
	}
	
	/**
	 * 查询商品管理列表
	 */
	@RequiresPermissions("treasure:tGoods:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TGoods tGoods)
	{
		startPage();
        List<TGoods> list = tGoodsService.selectTGoodsList(tGoods);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出商品管理列表
	 */
	@RequiresPermissions("treasure:tGoods:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TGoods tGoods)
    {
    	List<TGoods> list = tGoodsService.selectTGoodsList(tGoods);
        ExcelUtil<TGoods> util = new ExcelUtil<TGoods>(TGoods.class);
        return util.exportExcel(list, "tGoods");
    }
	
	/**
	 * 新增商品管理
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存商品管理
	 */
	@RequiresPermissions("treasure:tGoods:add")
	@Log(title = "商品管理", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TGoods tGoods)
	{		
		return toAjax(tGoodsService.insertTGoods(tGoods));
	}

	/**
	 * 修改商品管理
	 */
	@GetMapping("/edit/{goodsId}")
	public String edit(@PathVariable("goodsId") Long goodsId, ModelMap mmap)
	{
		TGoods tGoods = tGoodsService.selectTGoodsById(goodsId);
		mmap.put("tGoods", tGoods);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存商品管理
	 */
	@RequiresPermissions("treasure:tGoods:edit")
	@Log(title = "商品管理", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TGoods tGoods)
	{		
		return toAjax(tGoodsService.updateTGoods(tGoods));
	}
	
	/**
	 * 删除商品管理
	 */
	@RequiresPermissions("treasure:tGoods:remove")
	@Log(title = "商品管理", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tGoodsService.deleteTGoodsByIds(ids));
	}
	
}
