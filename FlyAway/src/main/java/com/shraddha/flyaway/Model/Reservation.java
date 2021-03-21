package com.shraddha.flyaway.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{
	
	private boolean CHECKED_IN;
	private int NUBER_OF_BAGS;
	
	@OneToOne
	private Passenger PASSENGET_ID;
	@OneToOne
	private Flight FLIGHT_ID;
	
	public boolean isCHECKED_IN() {
		return CHECKED_IN;
	}
	public void setCHECKED_IN(boolean cHECKED_IN) {
		CHECKED_IN = cHECKED_IN;
	}
	public int getNUBER_OF_BAGS() {
		return NUBER_OF_BAGS;
	}
	public void setNUBER_OF_BAGS(int nUBER_OF_BAGS) {
		NUBER_OF_BAGS = nUBER_OF_BAGS;
	}
	public Passenger getPASSENGET_ID() {
		return PASSENGET_ID;
	}
	public void setPASSENGET_ID(Passenger pASSENGET_ID) {
		PASSENGET_ID = pASSENGET_ID;
	}
	public Flight getFLIGHT_ID() {
		return FLIGHT_ID;
	}
	public void setFLIGHT_ID(Flight fLIGHT_ID) {
		FLIGHT_ID = fLIGHT_ID;
	}

}
