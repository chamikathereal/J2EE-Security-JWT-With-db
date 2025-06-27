package lk.jiat.app.security.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Set;

public class JWTUtil {
    private static final String SECRET_KEY = "0@G~p05*Ro89-Q94LReBb@*/C]n@7L)T";
    private static final SecretKey KEY = Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8));
    private static final long EXPIRATION_TIME = 3600000; // 1 hour

    public static String generateToken(String username, Set<String> roles) {
        return Jwts.builder()
                .subject(username)
                .claim("roles", roles)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(KEY, Jwts.SIG.HS256)
                .compact();

    }

    public static Jws<Claims> parseToken(String token) throws JwtException {
        return Jwts.parser()
                .verifyWith(KEY)
                .build()
                .parseSignedClaims(token);
    }

}
