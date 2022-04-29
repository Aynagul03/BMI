public class BmiService {
    public double calculate(double weight, double height) {
        double BMI = weight / (height * height);
        System.out.println("Индекс массы тела:" + BMI);

        if (BMI <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        }else if (BMI == 16-18.5) {
            System.out.println("Недостаточная масса тела");
        }else if (BMI == 18.5-25) {
            System.out.println("Норма");
        }else if (BMI == 25-30) {
            System.out.println("Избыточная масса тела");
        }else if (BMI == 30-35) {
            System.out.println("Ожирение 1 степени");
        }else if (BMI == 35-40) {
            System.out.println("Ожирение 2 степени");
        }else if (BMI >= 40) {
            System.out.println("Ожирение 3 степени");
        }
        System.out.println("Индекс массы тела:" + BMI);
        return BMI;
    }
}
