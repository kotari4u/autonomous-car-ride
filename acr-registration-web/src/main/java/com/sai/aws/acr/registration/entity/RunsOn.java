package com.sai.aws.acr.registration.entity;

public enum RunsOn {
	SOLAR,
	WIND,
	SOLAR_AND_WIND;
	
	public String getValue(){
		return this.name();
	}
}
