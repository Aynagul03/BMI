public class BmiService {
    public double calculate(double weight, double height) {
        double BMI = (double)weight / Math.pow((double)height, 2);
        System.out.println("Индекс массы тела:" + BMI);

        if (BMI <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        }
        if (BMI > 16) {
            if (BMI <= 18.5) {
                System.out.println("Недостаточная масса тела");}
        }
        if (BMI >= 18.5) {
            if (BMI <= 25) {
            System.out.println("Норма");}
        }
        if (BMI >= 25) {
            if (BMI <= 30) {
            System.out.println("Избыточная масса тела");}
        }
        if (BMI >= 30) {
            if (BMI <= 35) {
            System.out.println("Ожирение 1 степени");}
        }
        if (BMI >= 35) {
            if (BMI <= 40) {
            System.out.println("Ожирение 2 степени");}
        }
        if (BMI >= 40) {
            System.out.println("Ожирение 3 степени");
        }
        System.out.println("Индекс массы тела:" + BMI);
        return BMI;
    }
}
