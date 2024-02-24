package com.BitByteCraft.Wyld.dto.wrapperdto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner {
    public String pk;
    public String username;
    public String id;
    public boolean is_private;
    public String profile_pic_url;
    public boolean show_account_transparency_details;
    public String __typename;
    public Object supervision_info;
    public Object is_embeds_disabled;
    public boolean is_unpublished;
    public String full_name;
    public boolean is_verified;
    public Object transparency_product;
    public boolean transparency_product_enabled;
    public Object transparency_label;
}
