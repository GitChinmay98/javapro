package com.lti.core.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.core.daos.UserDao;
import com.lti.core.entities.FlightDetails;
import com.lti.core.entities.FlightScheduleDetails;
import com.lti.core.entities.Passenger;
import com.lti.core.entities.PassengerDetails;
import com.lti.core.entities.UserDetails;
import com.lti.core.exceptions.HrExceptions;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	private UserDao userDetailsDao;
	
	
	@Override
	public boolean register(UserDetails details) throws HrExceptions {
		// TODO Auto-generated method stub
		return userDetailsDao.userRegistration(details);
	}


	@Override
	public List<FlightDetails> getFlights(String source, String destination, LocalDate departureDate) throws HrExceptions {
		// TODO Auto-generated method stub
		return userDetailsDao.getFlights(source,destination,departureDate);
	}


	@Override
	public List<UserDetails> isValid(UserDetails userDetails) {
		// TODO Auto-generated method stub
		List<UserDetails> user=userDetailsDao.isValid(userDetails);
		return user;
	}


	@Override
	public List<FlightDetails> getFlightsAfterLogin(String source, String destination, LocalDate departureDate,
			String flightClass, int noOfPassengers) throws HrExceptions {
		// TODO Auto-generated method stub
		return userDetailsDao.getFlightsafterLogin(source, destination, departureDate, flightClass, noOfPassengers);
	}


	@Override
	public boolean addPassenger(Passenger passenger) throws HrExceptions {
		UserDetails userDetails=new UserDetails();
		boolean b=false;
		PassengerDetails passengerDetails=new PassengerDetails();
		FlightScheduleDetails fsd=new FlightScheduleDetails();
		userDetails.setPassengerDetails(passenger.getPassengerDetails());
		fsd.setScheduleId(passenger.getScheduleId());
		passengerDetails.setFlightScheduleDetails(fsd);
		userDetails.setUserId(passenger.getUserid());
		passengerDetails.setUserDetails(userDetails);
		
		passengerDetails.setPassengerDetails(passenger.getPassengerDetails());
//		List<PassengerDetails> passengerdetailslist=passenger.getPassengerDetails();
//		for(PassengerDetails psd:passengerdetailslist) {
			
//			passengerDetails.setPassengerName(psd.getPassengerName());
//			passengerDetails.setPassengerAge(psd.getPassengerAge());
//			passengerDetails.setPassengerGender(psd.getPassengerGender());
//			passengerDetails.setSeatNo(psd.getSeatNo());
//			passengerDetails.setFlightClass(psd.getFlightClass());
userDetailsDao.addPassengers(passengerDetails);
			
			
	//}
		

		
		return b;
		
		
		
		
	}

	
	
	
}
