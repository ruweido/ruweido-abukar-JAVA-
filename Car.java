public class Car {

    // Instance Variables
    private String plateNumber;
    private String carModel;
    private double dailyRate;
    private boolean rent;

    // Static Variables
    public static final String CompanyName = "Just Rentals";
    public static int totalCars = 0;


    // No-Argument Constructor
    public Car() {
        plateNumber = "Unknown";
        carModel = "Unknown";
        dailyRate = 0;
        rent = false;

        totalCars++;
    }


    // Parameterized Constructor
    public Car(String plateNumber, String carModel, double dailyRate) {

        this.plateNumber = plateNumber;
        this.carModel = carModel;

        // Validation
        this.dailyRate = dailyRate >= 0 ? dailyRate : 0;
        rent = false;
        totalCars++;
    }
    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRent() {
        return rent;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    // setters
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
    // Setter with validation
    public void setDailyRate(double dailyRate) {

        this.dailyRate = dailyRate >= 0 ? dailyRate : this.dailyRate;
    }
    public void setRent(boolean rent) {
        this.rent = rent;
    }
    public static void setTotalCars(int totalCars) {
        Car.totalCars = totalCars;
    }
    // Rent Method

    public void rent() {

        System.out.println(
                rent
                        ? "Car " + plateNumber + " is already rented."
                        : "Car " + plateNumber + " has been rented."
        );
        rent = true;
    }

    // Return Car Method

    public void returnCar() {

        rent = false;

        System.out.println("Car " + plateNumber + " has been returned.");
    }

    // Display Information
    public void displayInfo() {
        System.out.println("=== CAR INFORMATION ===");
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Car Model: " + carModel);
        System.out.println("Daily Rental Rate: $" + dailyRate);
        System.out.println("Status: " + (rent ? "Rented" : "Available"));
    }

    // Static Method - Company Name
    public static void displayCompanyName() {

        System.out.println("Company Name: " + CompanyName);
    }
    // Static Method - Total Cars
    public static void displayTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }
    // Main Method / Testing

    public static void main(String[] args) {
        System.out.println("===== CAR RENTAL SYSTEM =====");
        System.out.println();
        // Creating two cars using parameterized constructor

        Car car1 = new Car("ABC-123", "Toyota Corolla", 40);
        Car car2 = new Car("XYZ-456", "Honda Civic", 50);
        // Displaying car information
        System.out.println("===== CAR 1 =====");
        car1.displayInfo();
        System.out.println();
        System.out.println("===== CAR 2 =====");
        car2.displayInfo();
        System.out.println();
        // Renting a car
        System.out.println("===== RENTING CAR =====");
        car1.rent();
        System.out.println();
        // Attempting to rent an already rented car

        System.out.println("===== RENTING AGAIN =====");
        car1.rent();
        System.out.println();
        // Returning a car
        System.out.println("===== RETURNING CAR =====");
        car1.returnCar();
        System.out.println();
        // Changing daily rental rate
        System.out.println("===== CHANGING DAILY RATE =====");
        System.out.println("Old Rate: $" + car2.getDailyRate());
        car2.setDailyRate(60);
        System.out.println("New Rate: $" + car2.getDailyRate());
        System.out.println();
        // Testing negative rate
        System.out.println("===== TESTING NEGATIVE RATE =====");
        car2.setDailyRate(-20);
        System.out.println("Rate after negative value: $"
                + car2.getDailyRate());
        System.out.println();
        // Display company name
        System.out.println("===== COMPANY =====");
        Car.displayCompanyName();
        System.out.println();
        // Display total cars
        System.out.println("===== TOTAL CARS =====");
        Car.displayTotalCars();
    }
}