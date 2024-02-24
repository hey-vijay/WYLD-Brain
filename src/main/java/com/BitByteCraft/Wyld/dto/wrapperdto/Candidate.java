package com.BitByteCraft.Wyld.dto.wrapperdto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Candidate {

    public String url;
    public int height;
    public int width;
}