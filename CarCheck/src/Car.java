public class Car {
    public String model;
    public int age;
    private boolean wasInAccident = true;

    public Car(String model, int age) {
        this.model = model;
        this.age = age;
    }

    public Car(){

    }

    public boolean isWasInAccident() {
        return wasInAccident;
    }

    public void setWasInAccident(boolean wasInAccident) {
        this.wasInAccident = wasInAccident;
    }

    public static void checkCar(){
        Car car = new Car("BMW M5 F90", 4);
        System.out.println("Автомобиль: " + car.model);
        System.out.println("Возраст: " + car.age);

        if (car.isWasInAccident() == true){
            System.out.println("Машина нуждается в ремонте и её состояние неудовлетворительно");
        } else {
            if (car.age < 3){
                int fromNumber = 100;
                int toNumber = 20000;

                int carMileage = fromNumber + (int) (Math.random() * toNumber);

                System.out.println("Проверка пробега: " + carMileage + " км");

                if (carMileage >= 10000){
                    System.out.println("Состояние автомобиля хорошее, требуется замена масла.");
                } else {
                    System.out.println("Состояние автомобился идеальное.");
                }

            } else if (car.age >= 3 && car.age <= 6){
                int fromFirstNumber = 10000;
                int toFirstNumber = 60000;

                int carMileage = fromFirstNumber + (int) (Math.random() * toFirstNumber);

                int fromSecondNumber = 0;
                int toSecondNumber = 1;

                double engineWear = fromSecondNumber + (Math.random() * toSecondNumber);

                System.out.println("Проверка пробега: " + carMileage + " км");
                System.out.print("Проверка износа двигателя: ");
                System.out.printf("%.2f", engineWear);
                System.out.println();

                if (engineWear == 0){
                    System.out.println("Двигатель без износа, требуется замена масла.");
                } else if (engineWear >= 0.5 && engineWear <= 1) {
                    System.out.println("Двигатель износился и нуждается в ремонте.");
                }
            } else if (car.age > 6){
                int carMileage = 60000;
                double engineWear = 1;

                System.out.println("Проверка пробега: " + carMileage + " км");
                System.out.print("Проверка износа двигателя: ");
                System.out.printf("%.2f", engineWear);
                System.out.println();

                System.out.println("Машина нуждается в ремонте.");
            }
        }
    }
}
