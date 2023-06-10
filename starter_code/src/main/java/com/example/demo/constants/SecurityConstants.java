package com.example.demo.constants;

public class SecurityConstants {
	public static final String SECRET = "test";
	public static final long EXPIRATION_TIME = 864_000_00; // 24h
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/api/user/create";
}
