package com.JspEmpDbApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.JspEmpDbApp.Module.JspEmp;

public interface JspEmpRepo extends JpaRepository<JspEmp, Integer>{
	@Query(value = "select * from jsp_emp where ecourse=?1",nativeQuery = true)
	List<JspEmp> findByEcourse(String ecourse);
}
