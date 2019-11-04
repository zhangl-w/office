package com.neusoft.office.yongcheshenqing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.office.yongcheshenqing.mapper.CarMapper;
import com.neusoft.office.yongcheshenqing.po.Car;
import com.neusoft.office.yongcheshenqing.po.Carrequest;
@Service
public class CarServiceImpl implements CarService{
	@Autowired
	private CarMapper carMapper;
	@Override
	public List<Car> findcarlist() {
		// TODO Auto-generated method stub
		List<Car> list = carMapper.findcarlist();
		return list;
	}
	@Override
	public void surplusUp(Car c) {
		// TODO Auto-generated method stub
		carMapper.surplusUp(c);
	}
	@Override
	public Car findById(int carid) {
		// TODO Auto-generated method stub
		Car c = carMapper.findById(carid);
		return c;
	}

}
