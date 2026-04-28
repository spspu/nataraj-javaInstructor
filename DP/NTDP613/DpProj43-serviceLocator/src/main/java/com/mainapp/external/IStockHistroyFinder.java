package com.mainapp.external;

import java.util.List;

import com.mainapp.exception.InvalidStockIdException;

public interface IStockHistroyFinder {
	public List<Long> fetchStockHistory(long stockId)throws InvalidStockIdException;
}
