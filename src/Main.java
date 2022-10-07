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

        // Массивы. Часть 1. Задание 2
        System.out.println("Массивы. Часть 1. Задание 2");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
            if (i != mass.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int a = 0; a < mass2.length; a++) {
            System.out.print(mass2[a]);
            if (a != mass.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = 0; b < mass3.length; b++) {
            System.out.print(mass3[b]);
            if (b != mass3.length - 1) {
                System.out.print(", ");
            }
        }


    }
}
