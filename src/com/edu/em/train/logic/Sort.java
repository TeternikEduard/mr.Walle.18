package com.edu.em.train.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.edu.em.train.entity.Depo;
import com.edu.em.train.entity.Train;

public class Sort {

	public void sortStation(Depo trains) {
		sortTime(trains);
		List<Train> train = trains.getTrain();
		Comparator<Train> station = Comparator.comparing(Train::getStation);
		Collections.sort(train, station);
	}

	public Train findByNumber(Depo trains, int findNumber) {
		List<Train> train = trains.getTrain();
		for (Train findTrain : train) {
			if (findNumber == findTrain.getNumber()) {
				return findTrain;
			}
		}
		return null;
	}

	public void sortNumber(Depo train) {
		List<Train> trains = train.getTrain();
		for (int i = 0; i < trains.size() - 1; i++) {
			for (int j = 0; j < trains.size() - i - 1; j++) {
				if (trains.get(j + 1).getNumber() < trains.get(j).getNumber()) {
					Train buff = trains.get(j);
					trains.set(j, trains.get(j + 1));
					trains.set(j + 1, buff);
				}
			}
		}
	}

	public void sortTime(Depo trains) {

		List<Train> train = trains.getTrain();

		for (int i = 0; i < train.size() - 1; i++) {

			for (int j = 0; j < train.size() - 1 - i; j++) {

				if (train.get(j + 1).getTime().get(0) < train.get(j).getTime().get(0)) {

					Train buff = train.get(j);
					train.set(j, train.get(j + 1));
					train.set(j + 1, buff);

				}
			}
		}
	}
}