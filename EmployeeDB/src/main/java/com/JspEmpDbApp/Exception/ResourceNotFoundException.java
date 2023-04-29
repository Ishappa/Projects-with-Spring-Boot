package com.JspEmpDbApp.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourcename;
	private String fieldname;
	private Object fieldvalue;
	public ResourceNotFoundException(String resourcename, String fieldname, Object fieldvalue) {
		super(resourcename+"not found with the value"+fieldname+":"+fieldvalue);
		this.resourcename = resourcename;//entity name
		this.fieldname = fieldname;//id
		this.fieldvalue = fieldvalue;//2
	}
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public Object getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(Object fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	@Override
	public String toString() {
		return "ResourceNotFoundException [resourcename=" + resourcename + ", fieldname=" + fieldname + ", fieldvalue="
				+ fieldvalue + "]";
	}
		
}
