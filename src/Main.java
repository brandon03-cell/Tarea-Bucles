import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejercicio9();
    }

    public static void ejemplo1() {
        int i = 10;
        while (i <=100) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void ejemplo2() {
        boolean ok = false;
        while (true) {
            Scanner sc = new Scanner(System.in);
            String linea = sc.nextLine();
            if (linea.equals("vale")) {
                break;
            }
        }
    }

    public static void ejercicio1() {
        int i = 1;
        while(i <=10) {
            System.out.println(i);
            i++;
        }
    }

    public static void ejercicio2() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void ejercicio3() {
        int suma = 0;
        int i = 1;
        while (i <= 10) {
            suma = suma + i;
            i++;
        }
        System.out.println(suma);
    }

    public static void ejercicio4() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void ejercicio5() {
        int resultado = 1;
        int i = 1;
        while (i <= 8) {
            resultado = resultado * i;
            i = i + 1;
        }
        System.out.println(resultado);
    }

    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        int aleatorio = new Random().nextInt(10) + 1;
        int intento = 0;
        while (intento != aleatorio) {
            System.out.println("Introduce un número: ");
            intento = sc.nextInt();

            if (intento != aleatorio) {
                System.out.println("Erro");
            }
        }
        System.out.println("Bien hecho, el número era: " + aleatorio);
    }

    public static void ejercicio7() {
        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void ejercicio8() {
        String usuario = "Pepe";
        String contra = "1234";
        while (true) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu usuario: ");
        String usu = sc.nextLine();
        System.out.println("Introduce tu contra: ");
        String psw = sc.nextLine();
        if (usu.equals(usuario) && psw.equals(contra)) {
            System.out.println("Login correcto");
            break;
        } else {
            System.out.println("Usuario o contraseña incorrecto");
        }
        }
    }

    public static void ejercicio9() {{
        String usuario = "Pepe";
        String contra = "1234";
        int intentosrestantes = 3;
        while (intentosrestantes > 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce tu usuario: ");
            String usu = sc.nextLine();
            System.out.println("Introduce tu contra: ");
            String psw = sc.nextLine();
            if (usu.equals(usuario) && psw.equals(contra)) {
                System.out.println("Login correcto");
                break;
            } else {
                System.out.println("Usuario o contraseña incorrecto");
                intentosrestantes--;
                if (intentosrestantes == 0) {
                    System.out.println("Demasiados intentos");
                }
            }
        }
    }

    }
}