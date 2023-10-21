package org.prog.poly;

public class GasCar implements IMovable {

    public void fuelCar() {

    }

    @Override
    public int currentSpeed() {
        return 0;
    }

    @Override
    public void turnLeft() {
        System.out.println("Gas car turns left");
    }

    @Override
    public void turnRight() {
        System.out.println("Gas car turns right");
    }

    @Override
    public void accelerate() {
        System.out.println("Gas car goes faster");
    }

    @Override
    public void stop() {
        System.out.println("Gas car slows down");
    }

    public void goTo(String city, String destination, String s, int i) {
        goTo(city, destination, "no additional stops");
    }

    public void goTo(String city, String destination, String passingThrough) {
        goTo(city, destination, passingThrough, 0);
    }

    public void goTo(String city, String destination, String passingThrough, int passengers, double fuelPayment) {
        System.out.println();
    }

    //TODO: add one more overload, add split fuel payment

    public void goTo(String город, String местоНазначения, String черезМеста, int пассажиры, double оплатаТоплива, double оплатаЗаТопливоНаКаждого) {
        System.out.println("Машина движется из " + город + " в " + местоНазначения +
                " через " + черезМеста + " с " + пассажиры + " пассажирами на борту");
        System.out.println("Общая оплата за топливо составляет " + оплатаТоплива + " грн");
        System.out.println("Каждый пассажир платит " + оплатаЗаТопливоНаКаждого + " грн за топливо.");
    }

}
