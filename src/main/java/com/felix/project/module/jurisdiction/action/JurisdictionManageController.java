
package com.felix.project.module.jurisdiction.action;

import com.felix.project.module.jurisdiction.service.JurisdictionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jurisdiction/manage")
public class JurisdictionManageController {
	
	@Autowired
	private JurisdictionServiceImpl jurisdictionService;
	
	/**
	 * 权限列表
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping("/list")
	public String main(Model model) {
		model.addAttribute("jurisdictions", jurisdictionService.getJurisdictions());
		
		return "/jurisdiction/manage/list";
	}
	
}
