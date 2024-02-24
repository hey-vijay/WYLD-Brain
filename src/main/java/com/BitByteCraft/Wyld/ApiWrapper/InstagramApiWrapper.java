package com.BitByteCraft.Wyld.ApiWrapper;


import com.BitByteCraft.Wyld.dto.wrapperdto.Root;
import com.BitByteCraft.Wyld.dto.wrapperdto.XdtApiV1MediaShortcodeWebInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class InstagramApiWrapper {

    @Value("${instagram.baseUrl}")
    private static String baseUrl;
    @Value("${instagram.apiKey}")
    private static String apiKey;
    @Value("${instagram.host}")
    private static String host;

    @Value("${temp}")
    public String temp;


    public static XdtApiV1MediaShortcodeWebInfo getPostDetails(String shortcode) throws URISyntaxException {
        // Create RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Set request headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Rapidapi-Key", apiKey);
        headers.set("X-Rapidapi-Host", host);

        // Build the URL with parameters
        URI uri = new URI(baseUrl + "?shortcode=" + shortcode);

        // Build the request entity with method, headers, and URL
        RequestEntity<Void> requestEntity = new RequestEntity<>(headers, HttpMethod.GET, uri);

        // Make the GET request and retrieve the response
        ResponseEntity<Root> responseEntity = restTemplate.exchange(requestEntity, Root.class);

        // Access response data
        Root responseBody = responseEntity.getBody();
        System.out.println("Response: " + responseBody);
        return responseEntity.getBody().data.xdt_api__v1__media__shortcode__web_info;
    }

}
