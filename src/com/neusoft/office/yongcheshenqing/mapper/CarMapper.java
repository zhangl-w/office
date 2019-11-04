package com.neusoft.office.yongcheshenqing.mapper;

import java.util.List;

import com.neusoft.office.yongcheshenqing.po.Car;

public interface CarMapper {
	List<Car> findcarlist();

	void surplusUp(Car c);

	Car findById(int carid);
}
