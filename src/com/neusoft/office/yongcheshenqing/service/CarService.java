package com.neusoft.office.yongcheshenqing.service;

import java.util.List;

import com.neusoft.office.yongcheshenqing.po.Car;
import com.neusoft.office.yongcheshenqing.po.Carrequest;

public interface CarService {
	List<Car> findcarlist();

	void surplusUp(Car c);

	Car findById(int id);
}
