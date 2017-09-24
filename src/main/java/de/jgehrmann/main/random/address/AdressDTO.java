package de.jgehrmann.main.random.address;

public class AdressDTO {
    private String prename;
    private String surname;
    private String place;
    private String country;
    private String postalCode;
    private String number;

    public AdressDTO(String prename, String surname, String place, String country, String postalCode,String street, String number) {
        this.prename = prename;
        this.surname = surname;
        this.place = place;
        this.country = country;
        this.postalCode = postalCode;
        this.number = number;
    }

    public String getPrename() {
        return prename;
    }

    public String getSurname() {
        return surname;
    }

    public String getPlace() {
        return place;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getNumber() {
        return number;
    }
}
