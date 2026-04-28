package com.mainapp.delegate;

import com.mainapp.dto.StockDetailsDTO;
import com.mainapp.exception.InternalProblemException;
import com.mainapp.exception.InvalidStockIdException;
import com.mainapp.exception.InvalidStockNameException;
import com.mainapp.external.IStockDetailsFinderSessionFacade;
import com.mainapp.locator.StockDetailsSessionFacadeServiceLocator;

public class UpstoxStockMgmtBusinessDelegateImpl implements IUpStoxStockMgmtBusinessDelegate {

	@Override
	public StockDetailsDTO fetchStockDetailsByName(String stockName) throws InternalProblemException {
		
		try {
			// get SessionFacade comp ref usisng ServiceLocator
			StockDetailsSessionFacadeServiceLocator locator=StockDetailsSessionFacadeServiceLocator.getInstance();
			IStockDetailsFinderSessionFacade  facade=locator.getFacade("stockJndi");
			//invoke b.method
			StockDetailsDTO  dto=facade.findCompleteStockDetailsByName(stockName);
			return dto;
		}
		catch(InvalidStockNameException isne) {
			throw new InternalProblemException(isne.getMessage());
		}
		catch(InvalidStockIdException isie) {
			throw new InternalProblemException(isie.getMessage());
		}
		
	}//method

}//class