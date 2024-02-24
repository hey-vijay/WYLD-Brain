package com.BitByteCraft.Wyld.dto;

import lombok.Builder;

import java.util.List;

@Builder
public class Contract {

    List<String> tags;
    Integer maxRedemptionPerUser = Integer.MAX_VALUE;
    Integer maxPercentageCashback = 100;
    Integer minNumberOfLikes = 0;

}
