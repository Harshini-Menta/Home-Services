package com.home.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {
		@Override
	public String toString() {
		return "Appointment [Appointmentid=" + Appointmentid + ", user=" + user + ", service=" +
			", appointmenttime=" + appointmenttime + "]";
	}
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int Appointmentid;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "userid")
		private UserInfo user;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "serviceid")
		private ServiceInfo service;
		private String appointmenttime;
		public int getAppointmentid() {
			return Appointmentid;
		}
		public void setAppointmentid(int appointmentid) {
			Appointmentid = appointmentid;
		}
		public UserInfo getUser() {
			return user;
		}
		public void setUser(UserInfo user) {
			this.user = user;
		}
		public ServiceInfo getService() {
			return service;
		}
		public void setService(ServiceInfo service) {
			this.service = service;
		}
		public String getAppointmenttime() {
			return appointmenttime;
		}
		public void setAppointmenttime(String appointmenttime) {
			this.appointmenttime = appointmenttime;
		}
		public Appointment(int appointmentid, UserInfo user, ServiceInfo service, String appointmenttime) {
			super();
			Appointmentid = appointmentid;
			this.user = user;
			this.service = service;
			this.appointmenttime = appointmenttime;
		}
		public Appointment() {
			
		}
}
