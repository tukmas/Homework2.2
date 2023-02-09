public class car {
    private String brand;
    private String model;
    public float engineVolume;
    public String color;
    public int productionYear;
    private String productionCountry;
    public String transmission;
    private String bodyType;
    public String registrationNumber;
    private int numberOfSeats;

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry, String transmission,
        String bodyType, String registrationNumber,int numberOfSeats) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
        if (color != null) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
        if (productionCountry != null) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
        if (transmission != null){
            this.transmission = transmission;
        } else {
            this.transmission = "Автоматическая";
        }
        if (bodyType != null){
            this.bodyType = bodyType;
        }else {
            this.bodyType = "default";
        }
        if (registrationNumber != null){
            this.registrationNumber = registrationNumber;
        }else {
            this.registrationNumber = "A001AА01";
        }
        if (numberOfSeats >1){
            this.numberOfSeats = numberOfSeats;
        }else this.numberOfSeats = 5;
    }


    void information() {
        System.out.println("Марка: " + brand + ". Модель: " + model + ". Объем двигателя: " + engineVolume + " л. Цвет кузова: "
                + color + ". Год выпуска: " + productionYear + ". Страна-производитель: " + productionCountry + ".");
    }
    public static boolean rubber(int a){
        if (a < 5 && a > 10){
            return true;
        }else{
            return  false;
        }
}
public static class Key {
        private boolean RemoteEngineStart;
        private boolean KeylessEntry;

    public Key(boolean remoteEngineStart, boolean keylessEntry) {
        RemoteEngineStart = remoteEngineStart;
        KeylessEntry = keylessEntry;
    }

    public boolean isRemoteEngineStart() {
        return RemoteEngineStart;
    }

    public void setRemoteEngineStart(boolean remoteEngineStart) {
        RemoteEngineStart = remoteEngineStart;
    }

    public boolean isKeylessEntry() {
        return KeylessEntry;
    }

    public void setKeylessEntry(boolean keylessEntry) {
        KeylessEntry = keylessEntry;
    }
}
}




