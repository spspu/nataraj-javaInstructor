package com.mainapp.delegate;

import com.mainapp.dto.StockDetailsDTO;
import com.mainapp.exception.InternalProblemException;

public interface IUpStoxStockMgmtBusinessDelegate {
	public StockDetailsDTO fetchStockDetailsByName(String stockName) throws InternalProblemException;
}
