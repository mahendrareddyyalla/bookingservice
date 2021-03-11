package com.bookticket.bookingservice.mapper;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.bookticket.bookingservice.dto.BookingDetailsDto;
import com.bookticket.bookingservice.entity.BookindDetailsEntity;
import com.bookticket.bookingservice.model.BookingDetailsPojo;


public class BookingDetailsMapper {
	public static BookingDetailsDto convertBookEntitytoBookDto(BookindDetailsEntity bookentity,BookingDetailsDto bookdto) {
		
		
		BeanUtils.copyProperties(bookentity,bookdto);
		
		return bookdto;

	}
		public static BookindDetailsEntity convertbookDtotoBookEntity(BookingDetailsDto bookdto,BookindDetailsEntity bookentity) {
			
			
			BeanUtils.copyProperties(bookdto,bookentity);
			
			return bookentity;

	}
		public static List<BookingDetailsDto> convertBookdetailsEntitytoBookDto(List<BookindDetailsEntity> bookindDetailsEntity,
				List<BookingDetailsDto> bookingDetailsDto){
			System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmm"+bookindDetailsEntity);
			BeanUtils.copyProperties(bookindDetailsEntity,bookingDetailsDto);
			System.out.println("nnnnnnnnnnnnnnn"+bookingDetailsDto);
					return bookingDetailsDto;
			
		}

}
