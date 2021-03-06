
package com.felix.project.module.department.dao;

import com.felix.project.core.MyBatisRepository;
import com.felix.project.dto.DepartmentDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisRepository
public interface DepartmentDaoMyBatis {
	
	/**
	 * 获取部门
	 *
	 * @return
	 */
	List<DepartmentDTO> getDepartments();
	
	/**
	 * 获取部门基本信息列表
	 *
	 * @return
	 */
	List<DepartmentDTO> getSimpleDepartments();
	
	/**
	 * 根据id获取部门
	 *
	 * @param id
	 * @return
	 */
	DepartmentDTO getDepartment(@Param("id") Long id);
	
	/**
	 * 根据部门id获取部门编码
	 *
	 * @param departmentId
	 * @return
	 */
	String getDepartmentCode(@Param("departmentId") Long departmentId);
	
	/**
	 * 新增或更新部门
	 *
	 * @param department
	 */
	void saveOrUpdateDepartment(DepartmentDTO department);
	
	/**
	 * 根据id删除部门
	 *
	 * @param departmentId
	 */
	void removeDepartment(@Param("departmentId") Long departmentId);
	
	/**
	 * 根据id删除多个部门
	 *
	 * @param departmentId
	 */
	void removeDepartments(@Param("departmentIds") String departmentIds);
	
}
