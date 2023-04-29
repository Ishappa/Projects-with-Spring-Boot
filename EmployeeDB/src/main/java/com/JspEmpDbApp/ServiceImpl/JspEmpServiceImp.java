package com.JspEmpDbApp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JspEmpDbApp.Exception.ResourceNotFoundException;
import com.JspEmpDbApp.Module.JspEmp;
import com.JspEmpDbApp.Repository.JspEmpRepo;
import com.JspEmpDbApp.Service.JspEmpService;

@Service
public class JspEmpServiceImp implements JspEmpService {

	@Autowired
	JspEmpRepo repo;

	@Override
	public JspEmp saveEmp(JspEmp e) {
		
		return repo.save(e) ;
	}

	@Override
	public List<JspEmp> allDetails() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public JspEmp getEmpById(int eid) {
	
		return repo.findById(eid).orElseThrow(()->new ResourceNotFoundException("JspEmp","eid", eid));
	}

	@Override
	public List<JspEmp> getEmpByEcourse(String ecourse) {
		
		return repo.findByEcourse(ecourse);
	}
	
	@Override
	public JspEmp deleteByIdEmp(int eid) {
		
		if(repo.existsById(eid)) {
			
			JspEmp e1=repo.findById(eid).orElseThrow(()->new ResourceNotFoundException("JspEmp", "eid", eid));
			repo.deleteById(eid);
			return e1;
		}
		else {
			return null;
		}
	}

	@Override
	public JspEmp updateEmp(JspEmp e, int eid) {
		 JspEmp ExistsEmp=repo.findById(eid).orElseThrow(()->new ResourceNotFoundException("JspEmp", "eid", eid));
		 ExistsEmp.setEname(e.getEname());
		 ExistsEmp.setEcourse(e.getEcourse());
		 ExistsEmp.setDesignation(e.getDesignation());
		 ExistsEmp.setAge(e.getAge());
		return repo.save(ExistsEmp);
	}
	
	


}
