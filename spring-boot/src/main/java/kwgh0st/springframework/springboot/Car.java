package kwgh0st.springframework.springboot;

public class Car {
    private long id;
    private String carBand;
    private String carModel;

    public Car() {
    }

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

    public void setId(long id) {
        this.id = id;
    }

    public void setCarBand(String carBand) {
        this.carBand = carBand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carBand='" + carBand + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
