package com.BitByteCraft.Wyld.dto.wrapperdto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageVersions2 {
    public ArrayList<Candidate> candidates;
}
