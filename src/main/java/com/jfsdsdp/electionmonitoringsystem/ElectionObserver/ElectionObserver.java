package com.jfsdsdp.electionmonitoringsystem.ElectionObserver;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
	public class ElectionObserver {
		@Id
		@GeneratedValue
		private Integer id;
		private String username;
		private String password;
		private  int anum;
		private int mnum;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getAnum() {
			return anum;
		}
		public void setAnum(int anum) {
			this.anum = anum;
		}
		public int getMnum() {
			return mnum;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public void setMnum(int mnum) {
			this.mnum = mnum;
		}

}
