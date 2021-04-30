package lab2p2_cesarbrito;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_CesarBrito {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Computadoras> computadoras = new ArrayList();
        int opcion = 1;
        while (opcion != 8) {
            System.out.print("********************* MENU *********************\n"
                    + "1. Crear computadora\n"
                    + "2. Listar computadoras\n"
                    + "3. Eliminar computadora\n"
                    + "4. Modificar computadora\n"
                    + "5. Reporte 1\n"
                    + "6. Reporte 2\n"
                    + "7. Reporte 3\n"
                    + "8. Salir del Menu\n"
                    + "Ingrese su opcion: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                String modelo, numeroSerie, procesador, tarjetaGrafica, sistemaOper;
                int capacidadDisco, tiempo, capacidadaBateria;
                double pantalla, bateriaDuracion;
                boolean tecladoNum;
                System.out.print("Ingrese el modelo de la computadora: ");
                modelo = sc.next();
                System.out.print("Ingrese el numero de serie de la computadora: ");
                numeroSerie = sc.next();
                boolean buscar = true;
                while (buscar == true) {
                    buscar = buscar(numeroSerie, computadoras);
                    if (buscar == true) {
                        System.out.println("El numero ya esta utilizado");
                        System.out.print("Ingrese el numero de serie de la computadora: ");
                        numeroSerie = sc.next();
                    }
                }
                System.out.print("Ingrese la capacidad del disco duro de la computadora: ");
                capacidadDisco = sc.nextInt();
                System.out.print("Ingrese el tamaño de la pantalla de la computadora: ");
                pantalla = sc.nextDouble();
                System.out.print("La teclada tiene teclado numerico?(s/n): ");
                char opTec = sc.next().charAt(0);
                if (opTec == 's') {
                    tecladoNum = true;
                } else {
                    tecladoNum = false;
                }
                System.out.print("Ingrese el procesador de la computadora: ");
                procesador = sc.next();
                System.out.print("Ingrese que tarjeta grafica tiene(1. Normal, 2. Gamer): ");
                int opTar = sc.nextInt();
                while (opTar < 1 || opTar > 2) {
                    System.out.println("OPCION NO VALIDA");
                    System.out.print("Ingrese que tarjeta grafica tiene(1. Normal, 2. Gamer): ");
                    opTar = sc.nextInt();
                }
                if (opTar == 1) {
                    tarjetaGrafica = "Normal";
                } else {
                    tarjetaGrafica = "Gamer";
                }
                System.out.print("Ingrese que sistema operativo tiene(1. Windows, 2. ChromeOS): ");
                int opSystem = sc.nextInt();
                while (opSystem < 1 || opSystem > 2) {
                    System.out.println("OPCION NO VALIDA");
                    System.out.print("Ingrese que sistema operativo tiene(1. Windows, 2. ChromeOS): ");
                    opSystem = sc.nextInt();
                }
                if (opSystem == 1) {
                    sistemaOper = "Windows";
                } else {
                    sistemaOper = "ChromeOS";
                }
                System.out.print("Ingrese el tiempo de fabricacion en horas de la computadora(int): ");
                tiempo = sc.nextInt();
                System.out.print("Ingrese la capacidad de la bateria en miliamperios de la computadora(int): ");
                capacidadaBateria = sc.nextInt();
                System.out.print("Ingrese la duracion de la bateria en horas de la computadora(int): ");
                bateriaDuracion = sc.nextDouble();
                computadoras.add(new Computadoras(modelo, numeroSerie, capacidadDisco, pantalla, tecladoNum, procesador, tarjetaGrafica, sistemaOper, tiempo, capacidadaBateria, bateriaDuracion));
            } else if (opcion == 2) {
                for (int i = 0; i < computadoras.size(); i++) {
                    System.out.println(i + " - " + computadoras.get(i));
                    System.out.println("");
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el numero de serie: ");
                String buscarSerie = sc.next();
                boolean encontrado = false;
                for (int i = 0; i < computadoras.size(); i++) {
                    if (computadoras.get(i).getNumeroSerie().equals(buscarSerie)) {
                        computadoras.remove(i);
                        encontrado = true;
                    }
                }
                if (encontrado == true) {
                    System.out.println("La computadora fue encontrada y ha sido eliminada");
                } else {
                    System.out.println("La computadora no fue encontrada");
                }
            } else if (opcion == 4) {
                System.out.print("Ingrese el numero de serie: ");
                String buscarSerie = sc.next();
                boolean encontrado = false;
                for (int i = 0; i < computadoras.size(); i++) {
                    if (computadoras.get(i).getNumeroSerie().equals(buscarSerie)) {
                        String modelo, procesador, tarjetaGrafica, sistemaOper;
                        int capacidadDisco, tiempo, capacidadaBateria;
                        double pantalla, bateriaDuracion;
                        boolean tecladoNum;
                        encontrado = true;
                        System.out.print("1. Modelo\n"
                                + "2. Capacidad del Disco Duro\n"
                                + "3. Pantalla\n"
                                + "4. Teclado Numerico\n"
                                + "5. Procesador\n"
                                + "6. Tarjeta Grafica\n"
                                + "7. Sistema Operativo\n"
                                + "8. Tiempo de Fabricacion\n"
                                + "9. Capacidad de bateria\n"
                                + "10. Duracion de la bateria\n"
                                + "Ingrese su opcion que desea modificar: ");
                        int opcionMod = sc.nextInt();
                        if (opcionMod == 1) {
                            System.out.print("Ingrese el modelo de la computadora: ");
                            modelo = sc.next();
                            computadoras.get(i).setModelo(modelo);
                        } else if (opcionMod == 2) {
                            System.out.print("Ingrese la capacidad del disco duro de la computadora: ");
                            capacidadDisco = sc.nextInt();
                            computadoras.get(i).setCapacidadDisco(capacidadDisco);
                        } else if (opcionMod == 3) {
                            System.out.print("Ingrese el tamaño de la pantalla de la computadora: ");
                            pantalla = sc.nextDouble();
                            computadoras.get(i).setPantalla(pantalla);
                        } else if (opcionMod == 4) {
                            System.out.print("La teclada tiene teclado numerico?(s/n): ");
                            char opTec = sc.next().charAt(0);
                            if (opTec == 's') {
                                tecladoNum = true;
                            } else {
                                tecladoNum = false;
                            }
                            computadoras.get(i).setTecladoNum(tecladoNum);
                        } else if (opcionMod == 5) {
                            System.out.print("Ingrese el procesador de la computadora: ");
                            procesador = sc.next();
                            computadoras.get(i).setProcesador(procesador);
                        } else if (opcionMod == 6) {
                            System.out.print("Ingrese que tarjeta grafica tiene(1. Normal, 2. Gamer): ");
                            int opTar = sc.nextInt();
                            while (opTar < 1 || opTar > 2) {
                                System.out.println("OPCION NO VALIDA");
                                System.out.print("Ingrese que tarjeta grafica tiene(1. Normal, 2. Gamer): ");
                                opTar = sc.nextInt();
                            }
                            if (opTar == 1) {
                                tarjetaGrafica = "Normal";
                            } else {
                                tarjetaGrafica = "Gamer";
                            }
                            computadoras.get(i).setTarjetaGrafica(tarjetaGrafica);
                        } else if (opcionMod == 7) {
                            System.out.print("Ingrese que sistema operativo tiene(1. Windows, 2. ChromeOS): ");
                            int opSystem = sc.nextInt();
                            while (opSystem < 1 || opSystem > 2) {
                                System.out.println("OPCION NO VALIDA");
                                System.out.print("Ingrese que sistema operativo tiene(1. Windows, 2. ChromeOS): ");
                                opSystem = sc.nextInt();
                            }
                            if (opSystem == 1) {
                                sistemaOper = "Windows";
                            } else {
                                sistemaOper = "ChromeOS";
                            }
                            computadoras.get(i).setSistemaOper(sistemaOper);
                        } else if (opcionMod == 8) {
                            System.out.print("Ingrese el tiempo de fabricacion en horas de la computadora(int): ");
                            tiempo = sc.nextInt();
                            computadoras.get(i).setTiempo(tiempo);
                        } else if (opcionMod == 9) {
                            System.out.print("Ingrese la capacidad de la bateria en miliamperios de la computadora(int): ");
                            capacidadaBateria = sc.nextInt();
                            computadoras.get(i).setCapacidadBateria(capacidadaBateria);
                        } else if (opcionMod == 10) {
                            System.out.print("Ingrese la duracion de la bateria en horas de la computadora(int): ");
                            bateriaDuracion = sc.nextDouble();
                            computadoras.get(i).setBateriaDuracion(bateriaDuracion);
                        }
                    }
                }
                if (encontrado == false) {
                    System.out.println("La computadora no fue encontrada");
                }
            } else if (opcion == 5) {
                ArrayList<Computadoras> lista = new ArrayList();
                for (int i = 0; i < computadoras.size(); i++) {
                    if (computadoras.get(i).getTarjetaGrafica().equals("Gamer") && computadoras.get(i).getPantalla() > 17 && computadoras.get(i).isTecladoNum() == true) {
                        lista.add(computadoras.get(i));
                    }
                }
                if (lista.size() > 0) {
                    System.out.println("COMPUTADORAS GAMER");
                } else {
                    System.out.println("NO HAY COMPUTADORAS GAMER");
                }
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            } else if (opcion == 6) {
                ArrayList<Computadoras> lista = new ArrayList();
                for (int i = 0; i < computadoras.size(); i++) {
                    if (computadoras.get(i).getCapacidadDisco() < 300 && computadoras.get(i).getSistemaOper().equals("ChromeOS") && computadoras.get(i).getPantalla() < 13) {
                        lista.add(computadoras.get(i));
                    }
                }
                if (lista.size() > 0) {
                    System.out.println("COMPUTADORAS EDUCATIVAS");
                } else {
                    System.out.println("NO HAY COMPUTADORAS EDUCATIVAS");
                }
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            } else if (opcion == 7) {
                ArrayList<Computadoras> lista = new ArrayList();
                for (int i = 0; i < computadoras.size(); i++) {
                    if (computadoras.get(i).getTiempo() < 2 && computadoras.get(i).getBateriaDuracion() < 1 && computadoras.get(i).getSistemaOper().equals("Windows")) {
                        lista.add(computadoras.get(i));
                    }
                }
                if (lista.size() > 0) {
                    System.out.println("COMPUTADORAS POCO USO");
                } else {
                    System.out.println("NO HAY COMPUTADORAS POCO USO");
                }
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println(lista.get(i));
                }
            } else if (opcion == 8) {
                System.out.println("SALIENDO DEL PROGRAMA......");
            }
        }
    }

    public static boolean buscar(String serie, ArrayList<Computadoras> comps) {
        boolean found = false;
        for (int i = 0; i < comps.size(); i++) {
            if (comps.get(i).getNumeroSerie().equals(serie)) {
                found = true;
            }
        }
        if (found == true) {
            return true;
        } else {
            return false;
        }
    }

}
