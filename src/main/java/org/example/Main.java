package org.example;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotalMoto;

        boolean tieneLicenciaElConductor;
        String tipoCompra;

        Scanner leer =new Scanner(System.in);

        //proceso
        System.out.println("******************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("******************");

        System.out.println("apreciado cliente, usted cuenta con licencia?");
        tieneLicenciaElConductor=leer.nextBoolean();

        //1. PRIMERA PREGUNTA O DECISION
        if(tieneLicenciaElConductor==true){
            //SI TIENE LICENCIA
            System.out.print("Nombres del cliente: ");
            nombres=leer.nextLine();

            System.out.print("Apellidos del cliente: ");
            apellidos=leer.nextLine();

            System.out.println("Tipo de documento: ");
            tipoDocumento=leer.nextLine();

            System.out.println("Numero documento: ");
            documento=leer.nextLine();

            System.out.print("Telefono Celular: ");
            telefonoMovil=leer.nextLine();

            System.out.print("Telefono Fijo: ");
            telefonoFijo=leer.nextLine();

            System.out.print("Direccion: ");
            direccion=leer.nextLine();

            System.out.print("Documento Fiador: ");
            documentoFiador=leer.nextLine();

            System.out.print("Nombres Fiador: ");
            nombresFiador=leer.nextLine();

            System.out.println("Nuestras motocicletas: ");
            System.out.println("1. Yamaha SZR-125---$9000000");
            System.out.println("2. Yamaha crypton FI---$8000000");
            System.out.println("3. Yamaha XTZ125---$10500000");
            System.out.println("4. Yamaha MT10---$72000000");
            System.out.println("5. Yamaha NMAX300---$34000000");

            Integer motoSeleccionada;
            System.out.print("Digite la motocicleta deseada: ");
            motoSeleccionada=leer.nextInt();
            Double valorMoto=0.0;
            if(motoSeleccionada==1){
                valorMoto=9000000.0;
            }else if(motoSeleccionada==2){
                valorMoto=8000000.0;
            }else if(motoSeleccionada==3){
                valorMoto=10500000.0;
            }else if(motoSeleccionada==4){
                valorMoto=72000000.0;
            }else if(motoSeleccionada==5){
                valorMoto=34000000.0;
            }else{
                System.out.println("moto invalida");
            }

            //2. PREGUNTA: LO QUIERE A CREDITO?
            System.out.println("usuario digite /credito o /contado para continuar su compra: ");
            leer.nextLine();
            tipoCompra=leer.nextLine().toLowerCase();
            if(tipoCompra.equals("credito")){
                //Le pregunto por % a financiar
                double porcentajecredito;
                System.out.println("Ingresa el porcentaje a financiar: ");
                porcentajecredito=leer.nextDouble();
                if(porcentajecredito==1.0){

                    Double valorIntereses=0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                }else if(porcentajecredito==0.7){

                    Double valorIntereses=0.15;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                }else if(porcentajecredito==0.5){

                    Double valorIntereses=0.07;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                }else{
                    System.out.println("Opcion invalida");
                }



            }else{
                System.out.println("excelente le daremos un descuento del 10%");
            }


        }else{
            //NO TIENE LICENCIA
            System.out.println("apreciado usuario, no podemos continuar la tarnsaccion");
            System.out.println("lo invitamois a tramitar su licencia, vuelva pronto...");
        }





















    }
}