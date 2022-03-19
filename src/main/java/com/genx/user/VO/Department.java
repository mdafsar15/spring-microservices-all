package com.genx.user.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	// POJO
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
