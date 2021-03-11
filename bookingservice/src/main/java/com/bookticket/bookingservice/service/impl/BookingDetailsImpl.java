package com.bookticket.bookingservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookticket.bookingservice.dto.BookingDetailsDto;
import com.bookticket.bookingservice.entity.BookindDetailsEntity;
import com.bookticket.bookingservice.entity.BusDetails;
import com.bookticket.bookingservice.mapper.BookingDetailsMapper;
import com.bookticket.bookingservice.repository.BookingDetailsRepository;
import com.bookticket.bookingservice.repository.BusDetailsRepository;
import com.bookticket.bookingservice.service.BookingDetailsService;

@Service
public class BookingDetailsImpl implements BookingDetailsService {

	@Autowired
	BookingDetailsRepository bookingRepository;
	@Autowired
	BusDetailsRepository busDetailsRepository;
	@Override
	public BookingDetailsDto savebookingdetails(BookingDetailsDto bookingDetailsDto) {
		// TODO Auto-generated method stub
		BookingDetailsDto bookingDetailsDto1=new BookingDetailsDto();
		BookindDetailsEntity bookindDetailsEntity = new BookindDetailsEntity();
		BusDetails busDetails = new BusDetails();
		bookindDetailsEntity = BookingDetailsMapper.convertbookDtotoBookEntity(bookingDetailsDto, bookindDetailsEntity);
		busDetails.setFrom(bookingDetailsDto.getSource());
		busDetails.setTo(bookingDetailsDto.getDestination());
		List<BusDetails> busdetailslist=busDetailsRepository.findByFromcityAndTocity(bookingDetailsDto.getSource(),
				bookingDetailsDto.getDestination());
		if(!busdetailslist.isEmpty())
		{
			BusDetails busDetailsofbusid=busdetailslist.get(0);
			bookindDetailsEntity.setBusid(busDetailsofbusid.getBusno());
		bookindDetailsEntity= bookingRepository.save(bookindDetailsEntity);
		if(!(bookindDetailsEntity == null)) {
			bookingDetailsDto1 = BookingDetailsMapper.convertBookEntitytoBookDto(bookindDetailsEntity, bookingDetailsDto1);
	}
		}
		return bookingDetailsDto1;
	}
	@Override
	public List<BookingDetailsDto> findbyusername(String username) {
		// TODO Auto-generated method stub
		List<BookingDetailsDto> bookingDetailsDto1=new ArrayList<BookingDetailsDto>();
        
		List<BookindDetailsEntity> bookingDetails = bookingRepository.findByUsername(username);
		System.out.println("-------------"+bookingDetails);
		bookingDetailsDto1 = BookingDetailsMapper.convertBookdetailsEntitytoBookDto(bookingDetails,bookingDetailsDto1);
		System.out.println("-------------"+bookingDetailsDto1);
		return bookingDetailsDto1;
	}

}
