package com.home.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfo {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int userid;
        private String username;
        private String usermail;
   
        
		public UserInfo(int userid, String username, String usermail) {
			super();
			this.userid = userid;
			this.username = username;
			this.usermail = usermail;
			
		}
		
		
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		
		
		@Override
		public String toString() {
			return "UserInfo [userid=" + userid + ", username=" + username + ", usermail=" + usermail
					+ ", userpassword=" +  "]";
		}
		public UserInfo() {
			
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getUsermail() {
			return usermail;
		}
		public void setUsermail(String usermail) {
			this.usermail = usermail;
		}
}
