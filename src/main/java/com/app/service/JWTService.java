package com.app.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JWTService {

	private static final String SECRET="CE5881B884DEEC463AEDC55A996A2";
	public String generateToken(String username) {
		Map<String, Object> claims=new HashMap<String, Object>();
		return createToken(claims, username);
	}

	private String createToken(Map<String, Object> claims, String username) {
		 
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(username)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				.signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
	}

	private Key getSignKey() {
		 byte[] keyByte=Decoders.BASE64.decode(SECRET);
		return Keys.hmacShaKeyFor(keyByte);
	}
}
