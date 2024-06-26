package com.edu.em.train.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depo {

	private List<Train> trains = new ArrayList<Train>();

	public Depo() {
	}

	public Depo(List<Train> trains) {
		this.trains = trains;
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	public List<Train> getTrain() {
		return trains;
	}

	public void setTrain(List<Train> train) {
		this.trains = train;
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depo other = (Depo) obj;
		return Objects.equals(trains, other.trains);
	}

}
