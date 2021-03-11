package com.bookticket.bookingservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="busdetails")
public class BusDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String busno;
	@Column
	private String fromcity;
	@Column
	private String tocity;
	@Column
	private int totalseats;
	@Column
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
		return fromcity;
	}
	public void setFrom(String from) {
		this.fromcity = from;
	}
	public String getTo() {
		return tocity;
	}
	public void setTo(String to) {
		this.tocity = to;
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
		return "BusDetails [id=" + id + ", busno=" + busno + ", from=" + fromcity + ", to=" + tocity + ", totalseats="
				+ totalseats + ", availbleseats=" + availbleseats + "]";
	}
	
}
