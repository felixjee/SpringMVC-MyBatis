
package com.felix.project.module.role.action;

import com.felix.project.module.role.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/role/manage")
public class RoleManageController {
	
	@Autowired
	private RoleServiceImpl roleService;
	
	/**
	 * 角色列表
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping("list")
	public String main(Model model) {
		model.addAttribute("roles", roleService.getRoles());
		
		return "/role/manage/list";
	}
	
}
