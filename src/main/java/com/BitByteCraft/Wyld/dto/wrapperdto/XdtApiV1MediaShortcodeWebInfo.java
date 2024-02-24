package com.BitByteCraft.Wyld.dto.wrapperdto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class XdtApiV1MediaShortcodeWebInfo {
    public ArrayList<Item> items;
}