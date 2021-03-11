package com.bookticket.bookingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookticket.bookingservice.entity.BusDetails;

@Repository
public interface BusDetailsRepository extends JpaRepository<BusDetails,Long>{

	List<BusDetails> findByFromcityAndTocity(String source, String destination);
 

}
