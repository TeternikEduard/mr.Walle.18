package com.edu.em.train.main;

import java.util.Arrays;

import com.edu.em.train.entity.Depo;
import com.edu.em.train.entity.Train;
import com.edu.em.train.logic.Sort;
import com.edu.em.train.presentation.View;

public class Main {

	public static void main(String[] args) {

		Depo depo = new Depo();

		depo.addTrain(new Train("Партизанская", 03, Arrays.asList(07, 37, 05)));
		depo.addTrain(new Train("Октябрьская ", 22, Arrays.asList(14, 05, 50)));
		depo.addTrain(new Train("Первомайская", 17, Arrays.asList(11, 30, 00)));
		depo.addTrain(new Train("Октябрьская ", 14, Arrays.asList(05, 35, 00)));
		depo.addTrain(new Train("Октябрьская ", 06, Arrays.asList(07, 37, 25)));
		depo.addTrain(new Train("Партизанская", 12, Arrays.asList(03, 03, 20)));
		depo.addTrain(new Train("Партизанская", 16, Arrays.asList(14, 33, 37)));
		depo.addTrain(new Train("Первомайская", 11, Arrays.asList(16, 54, 30)));

		Sort sort = new Sort();
		View view = new View();


		view.viewTrains("Список поездов:", depo);

		sort.sortNumber(depo);
		view.viewTrains("Сортировка по номерам:", depo);

		view.viewTrain(sort.findByNumber(depo, 1));

		sort.sortStation(depo);
		view.viewTrains("Отсортированные по станциям:", depo);

	}
}