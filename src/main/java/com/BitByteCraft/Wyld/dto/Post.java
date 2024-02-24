package com.BitByteCraft.Wyld.dto;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Post {

    private Integer likes;
    private Boolean isPublic;
    private Integer imageCount;
    private String caption;
    private Date datePosted;
    private User user;

}
