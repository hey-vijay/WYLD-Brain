package com.BitByteCraft.Wyld.dto.wrapperdto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarouselMedium {
    public String id;
    public String pk;
    public String accessibility_caption;
    public int original_height;
    public int original_width;
    public ImageVersions2 image_versions2;
    public String carousel_parent_id;
    public String preview;
    public Object usertags;
    public int media_type;
    public Object number_of_qualities;
    public Object link;
    public Object story_cta;
    public Object carousel_media;
}
