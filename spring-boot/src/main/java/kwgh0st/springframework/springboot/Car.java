package kwgh0st.springframework.springboot;

public class Car {
    private final long id;
    private final String carBand;
    private final String carModel;

    public Car(long id, String carBand, String carModel) {
        this.id = id;
        this.carBand = carBand;
        this.carModel = carModel;
    }

    public long getId() {
        return id;
    }

    public String getCarBand() {
        return carBand;
    }

    public String getCarModel() {
        return carModel;
    }
}
