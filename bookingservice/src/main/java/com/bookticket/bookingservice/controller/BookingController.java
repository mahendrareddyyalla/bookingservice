package com.bookticket.bookingservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookticket.bookingservice.dto.BookingDetailsDto;
import com.bookticket.bookingservice.service.BookingDetailsService;



@RestController
@RequestMapping("/booking")

public class BookingController {
	private static final Logger LOGGER = LoggerFactory.getLogger(BookingController.class);
	@Autowired
	private final BookingDetailsService bookingDetailsService;
	@Autowired
    public BookingController(BookingDetailsService bookingDetailsService) {
        this.bookingDetailsService = bookingDetailsService;
    }
	@PostMapping("/book")
	public ResponseEntity<?> registeruser( @RequestBody BookingDetailsDto bookingDetailsDto) {
		
		BookingDetailsDto bookingDetailsDto1 = bookingDetailsService.savebookingdetails(bookingDetailsDto);
		if(!(bookingDetailsDto1 == null)) {
			return new ResponseEntity<>(bookingDetailsDto1,HttpStatus.OK);
			//return new ResponseEntity<>("nobussesavailble for this route",HttpStatus.OK);
		}
			
			//return new ResponseEntity<>(bookingDetailsDto1,HttpStatus.OK);
			return new ResponseEntity<>("nobussesavailble for this route",HttpStatus.OK);
		//return new ResponseEntity<>(bookingDetailsDto1,HttpStatus.OK);
}

	@GetMapping("/book/{username}")
	public ResponseEntity<?> getbookingbyusername(@PathVariable String username){
		List<BookingDetailsDto> bookingDetailsDto = bookingDetailsService.findbyusername(username);
		BookingDetailsDto b=new BookingDetailsDto();
		b.setBookid(678);
		b.setUsername("yalla");
		bookingDetailsDto.add(b);
		return new ResponseEntity<>(bookingDetailsDto,HttpStatus.OK);
		
	}
	
	{
		
	}

}
