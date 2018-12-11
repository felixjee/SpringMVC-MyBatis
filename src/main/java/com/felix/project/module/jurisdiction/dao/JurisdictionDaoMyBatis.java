
package com.felix.project.module.jurisdiction.dao;

import com.felix.project.core.MyBatisRepository;
import com.felix.project.dto.JurisdictionDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisRepository
public interface JurisdictionDaoMyBatis {
	
	/**
	 * 获取权限列表
	 *
	 * @return
	 */
	List<JurisdictionDTO> getJurisdictions();
	
	/**
	 * 获取权限基本信息列表
	 *
	 * @return
	 */
	List<JurisdictionDTO> getSimpleJurisdictions();
	
	/**
	 * 通过角色id获取角色权限关联
	 *
	 * @param roleId
	 * @return
	 */
	List<JurisdictionDTO> getRoleJurisdictions(@Param("roleId") Long roleId);
	
	/**
	 * 根据id获取权限
	 *
	 * @param id
	 * @return
	 */
	JurisdictionDTO getJurisdiction(@Param("id") Long id);
	
	/**
	 * 新增或更新权限
	 *
	 * @param jurisdiction
	 */
	void saveOrUpdateJurisdiction(JurisdictionDTO jurisdiction);
	
	/**
	 * 根据id删除权限
	 *
	 * @param jurisdictionId
	 */
	void removeJurisdiction(@Param("jurisdictionId") Long jurisdictionId);
	
	/**
	 * 根据id删除多个权限
	 *
	 * @param jurisdictionId
	 */
	void removeJurisdictions(@Param("jurisdictionIds") String jurisdictionIds);
	
}
