package ua.dp.mign.ski.services;

/**
 * Created by mign on 10/8/2015.
 *
 * Service for hotels booking.
 */
class HotelBookingSystem {
    public int bookRoom(int roomQuality) {
        switch(roomQuality) {
            case 3:
                return 250;
            case 4:
                return 500;
            case 5:
                return 900;
            default:
                throw new IllegalArgumentException("Room quality should be in range [3;5]");
        }
    }
}
