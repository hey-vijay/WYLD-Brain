package com.BitByteCraft.Wyld.dto.wrapperdto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    public String pk;
    public String username;
    public String profile_pic_url;
    public boolean is_private;
    public boolean is_verified;
}