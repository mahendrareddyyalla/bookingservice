package com.bookticket.bookingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookticket.bookingservice.entity.BookindDetailsEntity;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookindDetailsEntity,Long>{

	List<BookindDetailsEntity> findByUsername(String username);

}
