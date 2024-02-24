package com.BitByteCraft.Wyld.service;

import com.BitByteCraft.Wyld.ApiWrapper.InstagramApiWrapper;
import com.BitByteCraft.Wyld.dto.wrapperdto.Item;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class WyldService {

    public String checkIfPostIsEligible(String postUrl, String id) throws URISyntaxException {
        String shortCode = postUrl.replace("https://", "").split("/")[2];
        var result = InstagramApiWrapper.getPostDetails(shortCode);
        Item item = result.getItems().get(0);
        return "";
    }
}
