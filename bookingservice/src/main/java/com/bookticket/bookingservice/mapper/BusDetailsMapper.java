package com.bookticket.bookingservice.mapper;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bookticket.bookingservice.dto.BookingDetailsDto;
import com.bookticket.bookingservice.dto.BusDetailsDto;
import com.bookticket.bookingservice.entity.BookindDetailsEntity;
import com.bookticket.bookingservice.entity.BusDetails;

public class BusDetailsMapper {
	public static List<BusDetailsDto> convertBusdetailsEntitytoBusDto(List<BusDetails> busDetailsEntity,
			List<BusDetailsDto> busDetailsDto){
		System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmm"+busDetailsEntity);
		BeanUtils.copyProperties(busDetailsEntity,busDetailsDto);
		System.out.println("nnnnnnnnnnnnnnn"+busDetailsDto);
				return busDetailsDto;
		
	}

}
