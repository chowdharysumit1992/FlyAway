package com.shraddha.flyaway.Model;

import java.util.Date;

import javax.persistence.Entity;

import org.apache.tomcat.jni.Time;

@Entity
public class Flight extends AbstractEntity{
	
	private int FLIGHT_NUMBER;
	private String OPERATING_AIRLINES;
	private String DIPARTURE_CITY;
	private String ARRIVAL_CITY;
	private Date DATE_OF_DIPARTURE;
	private Time ESTIMATED_DIPARTURE_TIME;
	
	public int getFLIGHT_NUMBER() {
		return FLIGHT_NUMBER;
	}
	public void setFLIGHT_NUMBER(int fLIGHT_NUMBER) {
		FLIGHT_NUMBER = fLIGHT_NUMBER;
	}
	public String getOPERATING_AIRLINES() {
		return OPERATING_AIRLINES;
	}
	public void setOPERATING_AIRLINES(String oPERATING_AIRLINES) {
		OPERATING_AIRLINES = oPERATING_AIRLINES;
	}
	public String getDIPARTURE_CITY() {
		return DIPARTURE_CITY;
	}
	public void setDIPARTURE_CITY(String dIPARTURE_CITY) {
		DIPARTURE_CITY = dIPARTURE_CITY;
	}
	public String getARRIVAL_CITY() {
		return ARRIVAL_CITY;
	}
	public void setARRIVAL_CITY(String aRRIVAL_CITY) {
		ARRIVAL_CITY = aRRIVAL_CITY;
	}
	public Date getDATE_OF_DIPARTURE() {
		return DATE_OF_DIPARTURE;
	}
	public void setDATE_OF_DIPARTURE(Date dATE_OF_DIPARTURE) {
		DATE_OF_DIPARTURE = dATE_OF_DIPARTURE;
	}
	public Time getESTIMATED_DIPARTURE_TIME() {
		return ESTIMATED_DIPARTURE_TIME;
	}
	public void setESTIMATED_DIPARTURE_TIME(Time eSTIMATED_DIPARTURE_TIME) {
		ESTIMATED_DIPARTURE_TIME = eSTIMATED_DIPARTURE_TIME;
	}
	

}
