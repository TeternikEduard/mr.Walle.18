package com.edu.em.train.presentation;

import java.util.List;

import com.edu.em.train.entity.Depo;
import com.edu.em.train.entity.Train;

public class View {

	public void viewTrains(String mess, Depo train) {

		System.out.println("\n\t\t" + mess + "\n");
		List<Train> trains = train.getTrain();
		for (Train trainI : trains) {

			System.out.print("Стацния: " + trainI.getStation());
			System.out.print("; №: ");
			if (trainI.getNumber() < 10) {
				System.out.print("0" + trainI.getNumber());
			} else {
				System.out.print(trainI.getNumber());
			}
			System.out.print("; Время отправления: ");
			for (int i = 0; i < trainI.getTime().size(); i++) {
				if (trainI.getTime().get(i) < 10) {
					System.out.print("0" + trainI.getTime().get(i));
				} else {
					System.out.print(trainI.getTime().get(i));
				}
				if (i < trainI.getTime().size() - 1) {
					System.out.print(":");
				} else {
					System.out.print(".");
				}

			}
			System.out.println();
		}
	}

	public void viewTrain(Train train) {
		

		if (train == null) {
			System.out.print("\nПоезда с таким номером не существует!\n");
		} else {
			System.out.println("\t\tПоезд с номером " + train.getNumber() + ":\n");

			System.out.print("Стацния: " + train.getStation());
			System.out.print("; №: ");
			if (train.getNumber() < 10) {
				System.out.print("0" + train.getNumber());
			} else {
				System.out.print(train.getNumber());
			}
			System.out.print("; Время отправления: ");
			for (int i = 0; i < train.getTime().size(); i++) {
				if (train.getTime().get(i) < 10) {
					System.out.print("0" + train.getTime().get(i));
				} else {
					System.out.print(train.getTime().get(i));
				}
				if (i < train.getTime().size() - 1) {
					System.out.print(":");
				} else {
					System.out.print(".");
				}

			}
			System.out.println();

		}
	}
}
