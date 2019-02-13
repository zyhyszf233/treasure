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
import com.flnet.treasure.domain.TGoodsCategory;
import com.flnet.treasure.service.ITGoodsCategoryService;
import com.flnet.framework.web.base.BaseController;
import com.flnet.common.page.TableDataInfo;
import com.flnet.common.base.AjaxResult;
import com.flnet.common.utils.poi.ExcelUtil;

/**
 * 商品分类 信息操作处理
 * 
 * @author flnet
 * @date 2019-02-13
 */
@Controller
@RequestMapping("/treasure/tGoodsCategory")
public class TGoodsCategoryController extends BaseController
{
    private String prefix = "treasure/tGoodsCategory";
	
	@Autowired
	private ITGoodsCategoryService tGoodsCategoryService;
	
	@RequiresPermissions("treasure:tGoodsCategory:view")
	@GetMapping()
	public String tGoodsCategory()
	{
	    return prefix + "/tGoodsCategory";
	}
	
	/**
	 * 查询商品分类列表
	 */
	@RequiresPermissions("treasure:tGoodsCategory:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TGoodsCategory tGoodsCategory)
	{
		startPage();
        List<TGoodsCategory> list = tGoodsCategoryService.selectTGoodsCategoryList(tGoodsCategory);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出商品分类列表
	 */
	@RequiresPermissions("treasure:tGoodsCategory:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TGoodsCategory tGoodsCategory)
    {
    	List<TGoodsCategory> list = tGoodsCategoryService.selectTGoodsCategoryList(tGoodsCategory);
        ExcelUtil<TGoodsCategory> util = new ExcelUtil<TGoodsCategory>(TGoodsCategory.class);
        return util.exportExcel(list, "tGoodsCategory");
    }
	
	/**
	 * 新增商品分类
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存商品分类
	 */
	@RequiresPermissions("treasure:tGoodsCategory:add")
	@Log(title = "商品分类", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TGoodsCategory tGoodsCategory)
	{		
		return toAjax(tGoodsCategoryService.insertTGoodsCategory(tGoodsCategory));
	}

	/**
	 * 修改商品分类
	 */
	@GetMapping("/edit/{categoryId}")
	public String edit(@PathVariable("categoryId") Long categoryId, ModelMap mmap)
	{
		TGoodsCategory tGoodsCategory = tGoodsCategoryService.selectTGoodsCategoryById(categoryId);
		mmap.put("tGoodsCategory", tGoodsCategory);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存商品分类
	 */
	@RequiresPermissions("treasure:tGoodsCategory:edit")
	@Log(title = "商品分类", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TGoodsCategory tGoodsCategory)
	{		
		return toAjax(tGoodsCategoryService.updateTGoodsCategory(tGoodsCategory));
	}
	
	/**
	 * 删除商品分类
	 */
	@RequiresPermissions("treasure:tGoodsCategory:remove")
	@Log(title = "商品分类", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tGoodsCategoryService.deleteTGoodsCategoryByIds(ids));
	}
	
}
