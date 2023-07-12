package poo;

public class EjerciciosTema4 {

    public static class SmartDevice {

        String fabricante;
        String modelo;
        double medPantalla;
        String color;

        public SmartDevice() {
        }

        public SmartDevice(String fabricante, String modelo, double medPantalla, String color) {
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.medPantalla = medPantalla;
            this.color = color;
        }
    }

    public static class SmartPhone extends SmartDevice {
        String sistemaOperativo;
        int almacenamiento;

        public SmartPhone(String fabricante, String modelo, double medPantalla, String color, String sistemaOperativo, int almacenamiento) {
            super(fabricante, modelo, medPantalla, color);
            this.sistemaOperativo = sistemaOperativo;
            this.almacenamiento = almacenamiento;
        }

    }

    public static class SmartWatch extends SmartDevice {
        boolean gps;
        String formaConexion;

        public SmartWatch(String fabricante, String modelo, double medPantalla, String color, boolean gps, String formaConexion) {
            super(fabricante, modelo, medPantalla, color);
            this.gps = gps;
            this.formaConexion = formaConexion;
        }
    }

    public static void main(String[] args) {
        SmartPhone celular = new SmartPhone("Samsung", "A30", 6.4, "Blanco", "Android", 64);

        SmartWatch smartWatch = new SmartWatch("Apple","MNJP3BE/A", 1.57,"Beige",true,"WiFi y Bluetooth");

        System.out.println("SmartPhone:");
        System.out.println("    Fabricante: " + celular.fabricante);
        System.out.println("    Modelo: " + celular.modelo);
        System.out.println("    Tamaño de pantalla: " + celular.medPantalla + " pulgadas");
        System.out.println("    Color: " + celular.color);
        System.out.println("    Sistema operativo: " + celular.sistemaOperativo);
        System.out.println("    Almacenamiento: " + celular.almacenamiento + " GB");

        System.out.println();

        // Mostrar los atributos del SmartWatch
        System.out.println("SmartWatch:");
        System.out.println("    Fabricante: " + smartWatch.fabricante);
        System.out.println("    Modelo: " + smartWatch.modelo);
        System.out.println("    Tamaño de pantalla: " + smartWatch.medPantalla + " pulgadas");
        System.out.println("    Color: " + smartWatch.color);
        System.out.println("    GPS: " + (smartWatch.gps ? "Sí" : "No"));
        System.out.println("    Forma de conexión: " + smartWatch.formaConexion);
    }
}
