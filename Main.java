public class Main {
    public static void main(String[] args) {
        Radar car1 = new Radar("ABC123", "2023-06-01", "Truck", 70, seatbeltStatus.NOT_FASTENED);
        car1.checkTrafficViolations();

        Radar car2 = new Radar("XYZ789", "2023-06-02", "Private car", 90, seatbeltStatus.FASTENED);
        car2.checkTrafficViolations();

        Radar car3 = new Radar("LMN456", "2023-06-03", "Private car", 75, seatbeltStatus.FASTENED);
        car3.checkTrafficViolations();
    }
}