package com.bookticket.bookingservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookticket.bookingservice.dto.BookingDetailsDto;

@Service
public interface BookingDetailsService {

	BookingDetailsDto savebookingdetails(BookingDetailsDto bookingDetailsDto);

	List<BookingDetailsDto> findbyusername(String username);

}
