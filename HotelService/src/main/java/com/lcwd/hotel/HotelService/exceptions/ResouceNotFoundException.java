package com.lcwd.hotel.HotelService.exceptions;

public class ResouceNotFoundException extends RuntimeException {
    public ResouceNotFoundException(String string) {
    super(string);
        }

        public ResouceNotFoundException(){
        super("Resource Not Found !!");
        }
}
