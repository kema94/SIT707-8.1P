package web.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginServiceTest2 {

	@Test
    public void testValidLogin() {
        // Test with valid username, password, and DOB
        assertTrue(LoginService.login("ahsan", "ahsan_pass", "1995-01-01"));
    }

    @Test
    public void testInvalidUsername() {
        // Test with invalid username
        assertFalse(LoginService.login("kema_username", "ahsan_pass", "1995-01-01"));
    }

    @Test
    public void testInvalidPassword() {
        // Test with invalid password
        assertFalse(LoginService.login("ahsan", "kema_password", "1995-01-01"));
    }

    @Test
    public void testInvalidDOB() {
        // Test with invalid DOB
        assertFalse(LoginService.login("ahsan", "kema_password", "2027-01-01"));
    }

    @Test
    public void testUnderageUser() {
        // Test with underage user
        assertFalse(LoginService.login("ahsan", "ahsan_pass", "2019-01-01"));
    }

}