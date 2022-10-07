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

        // Массивы. Часть 1. Задание 3
        System.out.println("Массивы. Часть 1. Задание 3");

        for (int i = mass.length-1; i >= 0; i--) {
            System.out.print(mass[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int a = mass2.length-1; a >= 0; a--) {
            System.out.print(mass2[a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = mass3.length-1; b >= 0; b--) {
            System.out.print(mass3[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }


    }
}
