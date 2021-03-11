package com.bookticket.bookingservice.dto;

import javax.persistence.Column;

public class BusDetailsDto {
	private long id;
	
	private String busno;
	
	private String from;
	
	private String to;
	
	private int totalseats;
	
	private int availbleseats;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBusno() {
		return busno;
	}

	public void setBusno(String busno) {
		this.busno = busno;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getTotalseats() {
		return totalseats;
	}

	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}

	public int getAvailbleseats() {
		return availbleseats;
	}

	public void setAvailbleseats(int availbleseats) {
		this.availbleseats = availbleseats;
	}

	@Override
	public String toString() {
		return "BusDetailsDto [id=" + id + ", busno=" + busno + ", from=" + from + ", to=" + to + ", totalseats="
				+ totalseats + ", availbleseats=" + availbleseats + "]";
	}
	
	

}
