package com.mainapp.external;

import com.mainapp.dto.StockDetailsDTO;
import com.mainapp.exception.InvalidStockIdException;
import com.mainapp.exception.InvalidStockNameException;

public interface IStockDetailsFinderSessionFacade {
	public StockDetailsDTO findCompleteStockDetailsByName(String stockName)
			throws InvalidStockIdException, InvalidStockNameException;
}
