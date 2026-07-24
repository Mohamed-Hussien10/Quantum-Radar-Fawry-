enum seatbeltStatus {
    FASTENED,
    NOT_FASTENED
}

public class Radar {
    private String plateNumber;
    private String date;
    private String carType;
    private double speed;
    private seatbeltStatus seatbeltStatus;
    private double speedTrafficFine = 0;
    private double seatbeltTrafficFine = 0;
    static int totalTrafficViolations = 0;

    public Radar(String plateNumber, String date, String carType, double speed, seatbeltStatus seatbeltStatus) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.carType = carType;
        this.speed = speed;
        this.seatbeltStatus = seatbeltStatus;
    }

    public String checkVehicleSpeed() {
        if (speed > 60 && carType.equals("Truck")) {
            speedTrafficFine = 300;
            totalTrafficViolations++;
            return "Speed of " + speed + " exceeded max allowed 60 : " + speedTrafficFine;
        } else if (speed > 80 && carType.equals("Private car")) {
            speedTrafficFine = 300;
            totalTrafficViolations++;
            return "Speed of " + speed + " exceeded max allowed 80 : " + speedTrafficFine;
        }
        return "No speeding violation detected";
    }

    public String checkSeatbelt() {
        if (seatbeltStatus == seatbeltStatus.NOT_FASTENED) {
            seatbeltTrafficFine = 100;
            if (speedTrafficFine == 0) {
                totalTrafficViolations++;
            }
            return "Seatbelt not fastened";
        }
        return "Seatbelt is fastened";
    }

    public void checkTrafficViolations() {
        String speedViolation = checkVehicleSpeed();
        String seatbeltViolation = checkSeatbelt();
        System.out.println("Traffic fine for car" + plateNumber + " on " + date );
        System.out.println("Total amount: " + (speedTrafficFine + seatbeltTrafficFine));
        System.out.println(speedViolation);
        System.out.println(seatbeltViolation);
        System.out.println("Total traffic violations: " + totalTrafficViolations);
        System.out.println("--------------------------------------------------");
    }
}
