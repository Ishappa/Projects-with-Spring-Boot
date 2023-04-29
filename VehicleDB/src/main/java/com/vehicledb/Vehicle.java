package com.vehicledb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private int vid;
	private String vname;
	private String vcolor;
	private int vyear;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	public int getVyear() {
		return vyear;
	}
	public void setVyear(int vyear) {
		this.vyear = vyear;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vname=" + vname + ", vcolor=" + vcolor + ", vyear=" + vyear + "]";
	}
	
	
}
