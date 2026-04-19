package com.mainapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mainapp.controller.WishMessageOperationsController;
import com.mainapp.entity.UserInfoEntity;
import com.mainapp.service.WishMessageService;

@WebMvcTest(value=WishMessageOperationsController.class)
public class WishMessageOperationRestControllerTest {
	
	@MockBean
	private WishMessageService wishService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testShowMessageEndPoint() throws Exception {
		Mockito.when(wishService.sayHello()).thenReturn("welcome to junit");
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/wish-api/wish");
		MvcResult result = mockMvc.perform(builder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String respContent = response.getContentAsString();
		assertEquals("welcome to junit",respContent);
//		assertEquals(200,response.getStatus());
	}
	
	@Test
	public void testSaveUserEndPoint1() throws Exception {
		UserInfoEntity user = new UserInfoEntity(1001,"raja","hyd","raja@gmail.com");
		Mockito.when(wishService.registerUser(user)).thenReturn("saved");
		ObjectMapper mapper = new ObjectMapper();
		String jsonContent = mapper.writeValueAsString(user);
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/wish-api/wish").contentType("application/json").content(jsonContent);
		MvcResult result = mockMvc.perform(builder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String respContent = response.getContentAsString();
		assertEquals("saved",respContent);
		
	}
	
	
	@Test
	public void testSaveUserEndPoint2() throws Exception {
		UserInfoEntity user = new UserInfoEntity();
		Mockito.when(wishService.registerUser(user)).thenReturn("not saved");
		ObjectMapper mapper = new ObjectMapper();
		String jsonContent = mapper.writeValueAsString(user);
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/wish-api/wish").contentType("application/json").content(jsonContent);
		MvcResult result = mockMvc.perform(builder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String respContent = response.getContentAsString();
		assertEquals("not saved",respContent);
		
	}
	
	
	
	
	

}
