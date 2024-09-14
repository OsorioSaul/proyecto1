package es.upm.miw.iwvg_devops.package1;

public class MySecondClass {
    public static void holaSegundaVersion(){
        MyFirstClass.hola();
        System.out.println("Llamando desde la segunda clase");
    }

    public static void adiosSuperGenial() {
        MyFirstClass.adios();
        System.out.println("Llamado desde la segunda clase");
    }
}
