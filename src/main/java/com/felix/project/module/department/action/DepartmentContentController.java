
package com.felix.project.module.department.action;

import com.felix.project.dto.DepartmentDTO;
import com.felix.project.module.department.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/department/content")
public class DepartmentContentController {
	
	@Autowired
	private DepartmentServiceImpl departmentService;
	
	/**
	 * 新增部门页面
	 *
	 * @return
	 */
	@RequestMapping("/add")
	public String main(Model model, @RequestParam("departmentId") Long departmentId) {
		model.addAttribute("department", departmentService.getDepartment(departmentId));
		
		return "/department/content/add";
	}
	
	/**
	 * 保存部门
	 *
	 * @param department
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public String save(@ModelAttribute DepartmentDTO department) {
		departmentService.saveOrUpdateDepartment(department);
		
		return "success";
	}
	
	/**
	 * 删除部门
	 *
	 * @param departmentId
	 * @return
	 */
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public String remove(@RequestParam("departmentId") Long departmentId) {
		departmentService.removeDepartment(departmentId);
		
		return "success";
	}
	
	/**
	 * 删除多个部门
	 *
	 * @param departmentIds
	 * @return
	 */
	@RequestMapping(value = "/removes", method = RequestMethod.POST)
	@ResponseBody
	public String removes(@RequestParam("departmentIds") String departmentIds) {
		departmentService.removeDepartments(departmentIds);
		
		return "success";
	}
	
}
