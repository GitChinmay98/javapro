package com.lti.core.entities;

import java.util.List;

public class Passenger {

	private int  userid;
	private int scheduleId;
	private List<PassengerDetails> passengerDetails;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userDetails) {
		this.userid = userDetails;
	}
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public List<PassengerDetails> getPassengerDetails() {
		return passengerDetails;
	}
	public void setPassengerDetails(List<PassengerDetails> passengerDetails) {
		this.passengerDetails = passengerDetails;
	}
	public Passenger(int userid, int scheduleId, List<PassengerDetails> passengerDetails) {
		super();
		this.userid = userid;
		this.scheduleId = scheduleId;
		this.passengerDetails = passengerDetails;
	}
	public Passenger() {
		super();
	}
	
	
}
