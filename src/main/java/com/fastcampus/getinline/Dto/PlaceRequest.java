package com.fastcampus.getinline.Dto;

import com.fastcampus.getinline.Constant.PlaceType;

public record PlaceRequest(
        PlaceType placeType,
        String placeName,
        String address,
        String phoneNumber,
        Integer capacity,
        String memo
) {
    public static PlaceRequest of(
            PlaceType placeType,
            String placeName,
            String address,
            String phoneNumber,
            Integer capacity,
            String memo
    ) {
        return new PlaceRequest(placeType, placeName, address, phoneNumber, capacity, memo);
    }
}
