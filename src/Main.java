public class Main {
    public static void main(String[] args) {
        // Массивы. Часть 1. Задание 1
        System.out.println("Массивы. Часть 1. Задание 1");
        int[] mass = new int[3];
        mass[0] = 1;
        mass[1] = 2;
        mass[2] = 3;
        double[] mass2 = {1.57, 7.654, 9.986};
        int[] mass3 = {5, 89, 65, 77, 23, 32};

        // Массивы. Часть 1. Задание 4
        System.out.println("Массивы. Часть 1. Задание 4");
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                mass[i] = mass[i] + 1;
            }
            System.out.print(mass[i]);
            if (i != mass.length - 1) {
                System.out.print(", ");;
            }
        }
    }
}
