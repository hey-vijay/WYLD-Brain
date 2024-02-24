package com.BitByteCraft.Wyld.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private String userName;
    private Boolean isPublic;
    private String userId;

}
