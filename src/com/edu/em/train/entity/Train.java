package com.edu.em.train.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Train {

	private String station;
	private int number;
	private List<Integer> time = new ArrayList<Integer>();

	public Train() {
	}

	public Train(String station, int number, List<Integer> time) {
		this.station = station;
		this.number = number;
		this.time = time;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<Integer> getTime() {
		return time;
	}

	public void setTime(List<Integer> time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, station, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number && Objects.equals(station, other.station) && Objects.equals(time, other.time);
	}

}
