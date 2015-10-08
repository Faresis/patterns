package ua.dp.mign.ski.services;

/**
 * Created by mign on 10/8/2015.
 *
 * Facade provides one easy to access point for handling Ski Resort services.
 */
public class SkiResortFacade {
    private final SkiRent skiRent = new SkiRent();
    private final SkiResortTicketSystem skiResortTicketSystem = new SkiResortTicketSystem();
    private final HotelBookingSystem hotelBookingSystem = new HotelBookingSystem();

    public int haveGoodRest(int height, int weight, int feetSize, int skierLevel, int roomQuality) {
        int skiPrice = skiRent.rentSki(weight, skierLevel);
        int skiBootsPrice = skiRent.rentBoots(feetSize, skierLevel);
        int polePrice = skiRent.rentPole(height);
        int oneDayTicketPrice = skiResortTicketSystem.buyOneDayTicket();
        int hotelPrice = hotelBookingSystem.bookRoom(roomQuality);

        return skiPrice + skiBootsPrice + polePrice + oneDayTicketPrice + hotelPrice;
    }

    public int haveRestWithOwnSkis() {
        return skiResortTicketSystem.buyOneDayTicket();
    }
}
