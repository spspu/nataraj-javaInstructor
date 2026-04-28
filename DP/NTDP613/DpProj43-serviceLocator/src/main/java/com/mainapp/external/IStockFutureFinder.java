package com.mainapp.external;

import java.util.List;

import com.mainapp.exception.InvalidStockIdException;

public interface IStockFutureFinder {
	public List<Long> fetchStockFuture(long stockId) throws InvalidStockIdException;
}
