package com.mainapp.external;

import com.mainapp.exception.InvalidStockNameException;

public interface IStockIdFinder {
	public long findStockIdByStockName(String stockName) throws InvalidStockNameException;
}
