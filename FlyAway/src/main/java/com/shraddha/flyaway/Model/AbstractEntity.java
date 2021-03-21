package com.shraddha.flyaway.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long ID;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

}
