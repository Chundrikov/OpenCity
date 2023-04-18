package com.open.city.service;

import org.springframework.stereotype.Service;

@Service
public class OpenCityService {

    public String getMapToken() {
        // You can generate your own access token from Mapbox or other providers
        String accessToken = "pk.eyJ1IjoiYW5kcmV5aWkiLCJhIjoiY2tjaXdzZDRuMDVxNzJ3b2dkN3ZsdGR2cyJ9.kvwK1gLpVSS5OL5uBbfbzA";
        return accessToken;
    }
}
