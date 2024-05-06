public class Address {
    public static String createAddress(String country){
        return String.format("Country: %s", country);
    }
    public static String createAddress(String country, String city){
        return String.format("Country: %s City: %s", country, city);
    }
    public static String createAddress(String country, String city, int postalCode){
        return String.format("Country: %s City: %s Postal Code: %d", country, city, postalCode);

    }
    public static String createAddress(String country, String city, int postalCode, String streetName){
        return String.format("Country: %s City: %s Postal Code: %d Street Name: %s", country, city, postalCode,streetName);

    }
    public static String createAddress(String country, String city, int postalCode, String streetName, int houseNr){
        return String.format("Country: %s City: %s Postal Code: %d Street Name: %s House Number: %d"
                , country, city, postalCode,streetName, houseNr);

    }

}
