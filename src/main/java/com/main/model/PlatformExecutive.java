package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class PlatformExecutive {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int PlatformExecutiveId;

	public int getPlatformExecutiveId() {
		return PlatformExecutiveId;
	}

	public void setPlatformExecutiveId(int platformExecutiveId) {
		PlatformExecutiveId = platformExecutiveId;
	}
}
