package com.home.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServiceInfo {

	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int serviceid;
	private String servicename;
	private double serviceprice;
	public int getServiceid() {
		return serviceid;
	}
	public void setServiceid(int serviceid) {
		this.serviceid = serviceid;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public double getServiceprice() {
		return serviceprice;
	}
	public void setServiceprice(double serviceprice) {
		this.serviceprice = serviceprice;
	}
	public ServiceInfo(int serviceid, String servicename, double serviceprice) {
		super();
		this.serviceid = serviceid;
		this.servicename = servicename;
		this.serviceprice = serviceprice;
	}
	public ServiceInfo() {
		
	}
	@Override
	public String toString() {
		return "ServiceInfo [serviceid=" + serviceid + ", servicename=" + servicename + ", serviceprice=" + serviceprice
				+ "]";
	}
}
