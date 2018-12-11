
package com.felix.project.module.jurisdiction.action;

import com.felix.project.core.ResponseData;
import com.felix.project.dto.JurisdictionDTO;
import com.felix.project.module.jurisdiction.service.JurisdictionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jurisdiction/content")
public class JurisdictionContentController {
	
	@Autowired
	private JurisdictionServiceImpl jurisdictionService;
	
	/**
	 * 新增权限页面
	 *
	 * @return
	 */
	@RequestMapping("/add")
	public String main(Model model, @RequestParam("jurisdictionId") Long jurisdictionId) {
		model.addAttribute("jurisdiction", jurisdictionService.getJurisdiction(jurisdictionId));
		
		return "/jurisdiction/content/add";
	}
	
	/**
	 * 保存权限
	 *
	 * @param jurisdiction
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public String save(@ModelAttribute JurisdictionDTO jurisdiction) {
		jurisdictionService.saveOrUpdateJurisdiction(jurisdiction);
		
		return "success";
	}
	
	/**
	 * 删除权限
	 *
	 * @param jurisdictionId
	 * @return
	 */
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	@ResponseBody
	public ResponseData remove(@RequestParam("jurisdictionId") Long jurisdictionId) {
		return jurisdictionService.removeJurisdiction(jurisdictionId);
	}
	
	/**
	 * 删除多个权限
	 *
	 * @param jurisdictionIds
	 * @return
	 */
	@RequestMapping(value = "/removes", method = RequestMethod.POST)
	@ResponseBody
	public ResponseData removes(@RequestParam("jurisdictionIds") String jurisdictionIds) {
		return jurisdictionService.removeJurisdictions(jurisdictionIds);
	}
	
}
