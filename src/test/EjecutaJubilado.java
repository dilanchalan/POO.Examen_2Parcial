package test;

import dominio.Discapacidad;
import dominio.Jubilado;
import dominio.Patronal;
import dominio.Vejez;
import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaJubilado {

    public static void main(String[] args) {
        Jubilado j;
        Scanner e = new Scanner(System.in);
        int a = 0, b, t, na,pd;
        float k, s = 400,p;
        String n, c, em;
        System.out.println("Cuantos jubilados desea ingresar:");
        b = e.nextInt();
        do {
            System.out.println("Ingrese el tipo de jubilacion:(1=Vejez, 2=Discapacidad, 3=Patronal)");
            t = e.nextInt();
            switch (t) {
                case 1:
                    e.nextLine();
                    System.out.println("Ingrese el nombre:");
                    n = e.nextLine();
                    System.out.println("Ingrese el n° de cedula:");
                    c = e.nextLine();
                    System.out.println("Ingrese el numero de años que ha trabajado:");
                    na = e.nextInt();
                    j = new Vejez(n, c, na);
                       if (na < 11) {
                        p = 400/ 2;
                        s = p;
                    }
                    if (na > 10) {
                        if (na < 21) {
                            p = (60 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 20) {
                        if (na < 31) {
                            p = (70 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 30) {
                        if (na < 36) {
                            p = (80 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 35) {
                        if (na < 39) {
                            p = (90 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 39) {
                       s=400;
                    }
                    p = 400 * 15;
                    p = p / 100;
                    s = s + p;

                    System.out.println(j.pension() );
                    System.out.println(s);
                    break;
                case 2:
                    s=400;
                    e.nextLine();
                    System.out.println("Ingrese el nombre:");
                    n = e.nextLine();
                    System.out.println("Ingrese el n° de cedula:");
                    c = e.nextLine();
                    System.out.println("Ingrese el porcentaje de discapacidad solo en numeros:");
                    pd = e.nextInt();
                    System.out.println("Ingrese el numero de años que ha trabajado:");
                    na = e.nextInt();
                    j = new Discapacidad(n, c, na,pd);
                      if (na < 11) {
                        p = 400/ 2;
                        s = p;
                    }
                    if (na > 10) {
                        if (na < 21) {
                            p = (60 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 20) {
                        if (na < 31) {
                            p = (70 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 30) {
                        if (na < 36) {
                            p = (80 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 35) {
                        if (na < 39) {
                            p = (90 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 39) {
                       s=400; 
                    }
                    p = 400 * pd;
                    p = p / 100;
                    s = s + p;

                    System.out.println(j.pension() );
                    System.out.println(s);
                    break;
                case 3:
                    s=400;
                    e.nextLine();
                    System.out.println("Ingrese el nombre:");
                    n = e.nextLine();
                    System.out.println("Ingrese el n° de cedula:");
                    c = e.nextLine();
                    System.out.println("Ingrese el tipo de empresa publica o privada:");
                    em = e.nextLine();
                    System.out.println("Ingrese el numero de años que ha trabajado:");
                    na = e.nextInt();
                    j = new Patronal(n, c, na, em);
                    if (na < 11) {
                        p = 400/ 2;
                        s = p;
                    }
                    if (na > 10) {
                        if (na < 21) {
                            p = (60 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 20) {
                        if (na < 31) {
                            p = (70 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 30) {
                        if (na < 36) {
                            p = (80 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 35) {
                        if (na < 39) {
                            p = (90 * 400);
                            s = p / 100;
                        }
                    }
                    if (na > 39) {
                       s=400; 
                    }
                    
                    if(em.equals("publica")){
                     p = 400 * 5;
                    p = p / 100;
                    s = s + p;   
                    }
                    if(em.equals("privada")){
                     p = 400 * 10;
                    p = p / 100;
                    s = s + p;   
                    }
                    k=(float) (400*0.18);
                    k=k/100;
                    k=k+s;
                    System.out.println(j.pension() );
                    System.out.println(k);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            a++;
        } while (a != b);
    }

}
