package service.impl;

import junit.framework.Assert;

import org.junit.Test;

import service.UsersDAO;

import entity.Users;

public class TestUsersDAOImpl {

	@Test
	public void testUserLogin(){
		Users u = new Users(1, "zhangsan", "123456");
		UsersDAO udao = new UsersDAOImpl();
		Assert.assertEquals(true, udao.usersLogin(u));
	}
}
