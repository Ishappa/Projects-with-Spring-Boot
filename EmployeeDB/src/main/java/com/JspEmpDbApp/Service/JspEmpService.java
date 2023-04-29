package com.JspEmpDbApp.Service;

import java.util.List;

import com.JspEmpDbApp.Module.JspEmp;

public interface JspEmpService {

	JspEmp saveEmp(JspEmp e);
	
	List<JspEmp> allDetails();
	
	JspEmp getEmpById(int eid);
	
	List<JspEmp> getEmpByEcourse(String ecourse);
	
	JspEmp deleteByIdEmp(int eid);
	
	JspEmp updateEmp(JspEmp e,int eid);

	 
}
