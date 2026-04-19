package com.mainapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.powermock.api.mockito.PowerMockito;

import com.mainapp.dao.UserDao;
import com.mainapp.service.UserMgmtService;
import com.mainapp.service.UserMgmtServiceImpl;

public class UserMgmtServiceImplTest {
	
	private static UserDao daoMock;
	private static UserMgmtService userService;
	
	@BeforeAll
	public static void setUpOnce() {
		daoMock = PowerMockito.mock(UserDao.class);
		System.out.println("mock obj class name: "+daoMock.getClass());
		userService=new UserMgmtServiceImpl(daoMock);
	}
	
	@Test
	public void findNameByIdTest() {
		PowerMockito.when(daoMock.searchNameById(101)).thenReturn("Raja");
		String actualResult = userService.findNameById(101);
		String expectedResult="Raja";
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void LoginTestWithNoCredentials() {
		assertThrows(IllegalArgumentException.class,()->userService.login("",""));
	}
	
	@Test
	public void LoginTestWithValidCredentials() {
		assertThrows(IllegalArgumentException.class,()->userService.login("",""));
		PowerMockito.when(daoMock.authenticate("raja","rani")).thenReturn(true);
		boolean flag=userService.login("raja", "rani");
		assertTrue(flag);
	}
	
	@Test
	public void LoginTestWithinValidCredentials() {
		PowerMockito.when(daoMock.authenticate("raja1", "rani1")).thenReturn(false);
		boolean flag=userService.login("raja1", "rani1");
		assertFalse(flag);
	}
	
	
	@AfterAll
	public static void tearDownOnce() {
		daoMock=null;
		userService=null;
	}
	
}
