package com.genx.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genx.department.controller.DepartmentController;
import com.genx.department.entity.Department;
import com.genx.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("inside saveDepartment of department service");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("inside findDepartmentById of department service");
		return departmentRepository.findByDepartmentId(departmentId);
	}

	
}
