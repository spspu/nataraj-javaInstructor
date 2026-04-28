package com.mainapp.external;

import com.mainapp.exception.InvalidStockIdException;

public interface IStockCurrentValueFinder {
	public long findStockCureentValue(long stockId) throws InvalidStockIdException;
}
