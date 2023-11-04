import java.lang.ArithmeticException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    static Scanner lector = new Scanner (System.in);

    static byte intentos = 0 ,opcion ;
    static double LongitudLados, altura= 0, areaLateral=0, areaTotal = 0, volumen=0, perimetroBase , areaBase, apotema,apotemaMenor, longitudLadosMayor, longitudLadosMenor;
    static double radiodeEsfera = 0 ,area = 0,radio = 0 ,gentriz, areaPentagonal=0, radioMayor, radioMenor, areabaseMayor, areabaseMenor,radiodelCirculoMayor;
    static double diagonal = 0, HusoEsfericoArea = 0, CuñaEsfericaVolumen =0 ,grados, apotemaBase, ApotemaPiramide, perimetroMayor, perimetroMenor, apotemaMayor;
    static int CantidadLados,a,b,c;
    public static void main(String[] args) {
      
    Menu();


    try {
      opcion = lector.nextByte();
      
    } catch (InputMismatchException e) {
      System.out.println("Entrada no válida. Por favor, ingrese un valor válido.");
    }
   
    switch (opcion) {
        case 1:
            calcularPrisma(CantidadLados, altura, LongitudLados);
            break;
        case 2: 
            calcularCilindro(altura, radio);
             break;
        case 3:
            calcularPiramide(CantidadLados, altura, LongitudLados);
            break;
        case 4:
            calcularCono(radio, altura);
            break;
        case 5:
             calcularEsfera(radio);
            break;
        case 6:
          calcularZonaEsferica(radiodeEsfera, radiodelCirculoMayor, altura);
            break;
        case 7:
          calcularCasqueteEsferico(radiodeEsfera, altura);
            break;
        case 8:
           calcularHusoEsfericoYcuñaEsferica(radio, grados);
            break;
        case 9:
            calcularOrtoedro(a, b, CantidadLados);
            break;
        case 10:
            calcularTetraedo(a);
            break;
        case 11:
             calcularHexaedro(a);
            break;
        case 12:
           calcularOctaedro(a);
            break;
        case 13:
            calcularDodecaedro(a);
            break;
        case 14:
            calcularIcosaedro(a);
            break;
        case 15:
            calcularTroncoDeCono(altura, radioMayor, radioMenor);
            break;
        case 16:
            calcularTroncoDePiramide(altura, CantidadLados, longitudLadosMayor, longitudLadosMenor, apotemaMayor, apotemaMenor);
            break;
        case 17:
        System.out.println("Salir del programa : ");
        break;

        default:
        System.out.println ("!En este momento Esta saliendo del programa ! ");
         break;
       }
      
    }

 public static void Menu (){
     System.out.println("Escoge el numero de la figura a la que le desees calcular area total , area lateral y volument : ");
    System.out.println("1. Prisma : ");
    System.out.println("2. Cilindro : ");
    System.out.println("3. Piramide : ");
    System.out.println("4. Cono : ");
    System.out.println("5. Esfera : ");
    System.out.println("6. Zona Esferica : ");
    System.out.println("7. Casquete esferico : ");
    System.out.println("8. Huso esferico Y cuña Esferica : ");
    System.out.println("9. Ortoedro : ");
    System.out.println("10. Tetraedro : ");
    System.out.println("11. Hexaedro :   ");
    System.out.println("12. Octaedro : ");
    System.out.println("13. Dodecaedro :  ");
    System.out.println("14. Icosaedro :  ");
    System.out.println("15. Tronco de cono :  ");
    System.out.println("16. Tronco de Piramide :  ");
    System.out.println ("17. Salir ");

  }

  public static void calcularPrisma (int CantidadLados, double altura, double LongitudLados){
   try {
    System.out.print("Cantidad de lados: ");
    CantidadLados = lector.nextInt();
    System.out.print("Altura: ");
    altura = lector.nextDouble();
    System.out.print("Longitud de los lados: ");
    LongitudLados = lector.nextDouble();

    if (altura <= 0 || CantidadLados <= 0 || LongitudLados <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {
   
    perimetroBase = CantidadLados * LongitudLados;
    areaLateral = perimetroBase * altura;
     double alfa = (Math.PI/180) * (360/CantidadLados);
    apotema = LongitudLados / (2 * Math.tan((alfa)/2));
    areaBase = (perimetroBase * apotema)/2;
    areaTotal = areaLateral + 2 * areaBase;
    volumen = areaBase * altura;

     if(intentos <3){

         System.out.println("Intentelo nuevamente : ");
         System.out.println("Le quedan : " + intentos + " Intentos");
     }
   intentos++;
    
   
   if(intentos == 3){
     
   System.out.println("No le quedan mas intentos ");
   }else{
   
    System.out.println("Area lateral: " + areaLateral + " unidades cuadradas.");
    System.out.println("Area total: " + areaTotal + " unidades cuadradas.");
    System.out.println("Volumen: " + volumen + " unidades cubicas.");
   }
  }
      
     }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

  public static void calcularCilindro( double altura , double radio){
    try {
  
     System.out.println ("Altura: ");
    altura = lector.nextDouble();

    System.out.println("Radio: ");
    radio = lector.nextDouble();

    if (altura <= 0 || radio <= 0 ) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {
  
    perimetroBase = (Math.PI*2*radio);
    areaLateral = perimetroBase*altura;
    areaBase = (Math.PI*radio*radio);
    volumen =areaBase*altura;
    areaTotal = areaLateral*(altura+radio);

    
     if(intentos <3){

         System.out.println("Intentelo nuevamente : ");
         System.out.println("Le quedan : " + intentos + " Intentos");
     }
   intentos++;
    }
   
   if(intentos == 3){
     
   System.out.println("Se ha quedado sin intentos : ");
   }else{

    System.out.println ("Area lateral: " + areaLateral + "unidades cuadradas.");
    System.out.println ("Area Total: " + areaTotal + "unidades cuadradas.");
    System.out.println ("Volumen: " + volumen + "unidades cuadradas.");
  
  }   
  
   }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

    
}

public static void calcularPiramide (int CantidadLados, double altura, double LongitudLados){
  try {
    System.out.println ("Cantidad de lados: ");
    CantidadLados = lector.nextInt();
    System.out.println("Altura: ");
    altura = lector.nextDouble();
    System.out.println("Longitud de lados: ");
    LongitudLados = lector.nextDouble();

    if (altura <= 0 || CantidadLados <= 0 || LongitudLados <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    apotemaBase = LongitudLados /Math.sqrt(12);
    ApotemaPiramide = (Math.sqrt(altura*altura) +(apotemaBase*apotemaBase));
    perimetroBase = CantidadLados*LongitudLados;
    areaLateral = (perimetroBase*ApotemaPiramide)/2;
    areaBase =perimetroBase*2*(apotemaBase+ApotemaPiramide);
    volumen = (areaBase+altura)/3;
    areaTotal = areaLateral+areaBase;

       if(intentos <3){

           System.out.println("Intentelo nuevamente");
           System.out.println("Le quedan " + intentos + " Intentos");
     }
     intentos++;
   }

     if(intentos == 3){
       
     System.out.println("Se ha quedado sin intentos : ");
   }else{

    System.out.println(" Area lateral: " + areaLateral + "unidades cuadradas.");
    System.out.println(" Area total: " + areaTotal +"unidades cuadradas.");
    System.out.println(" Volumen: " + volumen + "unidades cuadradas.");
   }

    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularCono (double radio , double altura){
  try {
    System.out.println("Altura: ");
     altura = lector.nextDouble();
    System.out.println ("Radio: ");
     radio = lector.nextDouble();

     if (altura <= 0 || radio <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {
        
         areaBase = (Math.PI*radio*radio);
         perimetroBase = (Math.PI*radio*altura+ Math.PI*radio*radio); 
         gentriz = (Math.sqrt(altura*altura)+(radio*radio)); 
         areaLateral = (perimetroBase*gentriz)/2;  
         areaTotal = areaLateral+areaBase;
         areaLateral = (perimetroBase*gentriz)/2;
         volumen = (areaBase*altura)/3;

     
        if(intentos <3){

                System.out.println("Intentelo nuevamente : ");
                System.out.println("Le quedan : " + (intentos) + " Intentos");
            
          }
          intentos++;
        }

          if(intentos == 3){
            
          System.out.println(" Se ha quedado sin intentos: ");
          }else{

        System.out.println("Area Lateral: " + areaLateral + "unidades cuadradas.");
        System.out.println("Area Total: " + areaTotal + "unidades cuadradas.");
        System.out.println("Volumen: " + volumen + "unidades cuadradas.");
        }

    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularEsfera (double radio){
  try {
    System.out.println("Radio de la esfera: ");
    radio = lector.nextDouble();

    if (radio <= 0 ) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    area = (Math.PI*4*radio*radio);
    volumen= (4/3*Math.PI*radio*radio*radio);

    if(intentos <3){

        System.out.println("Intentelo nuevamente");
        System.out.println("Le quedan : " + intentos + " Intentos");
    
  }
  intentos++;
}
  if(intentos == 3){
    
  System.out.println("Se ha quedado sin intento : ");
  }

   System.out.println ("El area de la esfera:" + area + "unidades cuadradas.");
   System.out.println ("El Volumen de la esfera:" + volumen + "unidades cuadradas.");

  }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularZonaEsferica (double radiodeEsfera, double radiodelCirculoMayor, double altura){
    try{
   System.out.println (" Radio de la esfera: ");
    radiodeEsfera = lector.nextDouble();

    System.out.println (" Radio del circulo mayor: ");
    radiodelCirculoMayor = lector.nextDouble();

    System.out.println (" Altura: ");
    altura = lector.nextDouble();

    if (altura <= 0 || radiodelCirculoMayor<= 0 || radiodeEsfera <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    area= Math.PI*2*(radiodeEsfera * altura);
    volumen = Math.PI*altura*(altura*altura + 3*radiodeEsfera*radiodeEsfera +3*radiodelCirculoMayor*radiodelCirculoMayor)/6;

    System.out.println (" Area de la zona esferica : " + area + " unidades cuadradas.");
    System.out.println (" Volumen de la zona esferica : " + volumen + " unidades cuadradas.");

     if(intentos <3){
       System.out.println("Intentelo nuevamente");
       System.out.println("Le quedan : " + intentos + " Intentos");

    }
    intentos++;
    }

    if(intentos == 3){
     
   System.out.println("Se ha quedado sin intentos : ");
    }

    System.out.println (" Area de la zona esferica : " + area + " unidades cuadradas.");
    System.out.println (" Volumen de la zona esferica : " + volumen + " unidades cuadradas.");

   }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }


}

public static void calcularCasqueteEsferico (double radiodeEsfera, double altura){
    try{
    System.out.println (" Radio de la Esfera: ");
    radiodeEsfera = lector.nextDouble();

    System.out.println (" Altura: ");
    altura = lector.nextDouble();

    if (altura <= 0 || radiodeEsfera <= 0 ) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    area = Math.PI *2*(radiodeEsfera*altura);
    volumen = Math.PI *altura*altura*(3*radiodeEsfera-altura)/3;

     if(intentos <3){

         System.out.println("Intentelo nuevamente : ");
         System.out.println("Le quedan : " + intentos + " Intentos");
   }
   intentos++;
 } 
   
   if(intentos == 3){
     
   System.out.println("Se ha quedado sin intentos : ");
   }else{

     System.out.println (" El area del casquete esferico es : " + area + "unidades cuadradas.");
     System.out.println (" El volumen del casquete esferico es : " + volumen + "unidades cuadradas.");
   }

    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularHusoEsfericoYcuñaEsferica (double radio, double grados){
  try{
    System.out.println(" Radio de la esfera: ");
    radio = lector.nextDouble();

    System.out.println(" numero de grados: ");
    grados = lector.nextDouble();

    if (grados <= 0 || radio <= 0 ) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    HusoEsfericoArea = Math.PI *4 *(radio*radio*grados)/360;
    CuñaEsfericaVolumen = 4/3*(Math.PI *radio*radio*radio*grados/360);

  
     if(intentos <3){

         System.out.println("Intentelo nuevamente");
         System.out.println("Le quedan : " +  intentos + " Intentos");
   }
   intentos++;
 }

    if(intentos == 3){
     
   System.out.println("Se ha quedado sin intentos : ");
 }else{
    
    System.out.println(" El area de la esfera es de: " + HusoEsfericoArea + "Unidades Cuadradas.");
    System.out.println(" El Volumen de la esfera es de: " + CuñaEsfericaVolumen + "Unidades Cuadradas.");
 }

  }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularOrtoedro (int a, int b , int c){
  try{
    System.out.println ("Valor de la longitud lado  A: ");
    a = lector.nextInt();

    System.out.println ("Valor de la longitud lado  B: ");
    b = lector.nextInt();

    System.out.println ("Valor de la longitud lado  C: ");
    c = lector.nextInt();
    
    if (a <= 0 || c <= 0 || b <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    area = 2*(a*b + a*c + b*c);
    volumen = a*b*c;
    diagonal = (Math.sqrt(a*a + b*b + c*c));

       if(intentos <3){

           System.out.println("Intentelo nuevamente");
           System.out.println("Le quedan : " + intentos + " Intentos");
     }
     intentos++;
   }

     if(intentos == 3){
       
     System.out.println("Se ha quedado con intentos : ");
   }else{

    System.out.println ("Area del ortoedro : " + area + "unidades cuadradas.");
    System.out.println ("Volumen del ortoedro : " + volumen + "unidades cuadradas.");
    System.out.println ("Diagonal del ortoedro : " + diagonal + "unidades cuadradas.");
   }

    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularTetraedo (int a){
  try{
    System.out.println ("Valor de la arista:  ");
         a = lector.nextInt();

         if (a<=0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {
 
         area = Math.sqrt(3) *a*a;
         volumen = Math.sqrt(2)/12 *a*a*a ;
         altura = Math.sqrt(6)/3 *a ;

            if(intentos <3){

                System.out.println("Intentelo nuevamente");
                System.out.println("Le quedan : " + intentos + " Intentos");

          }
          intentos++;
        }

          if(intentos == 3){
            
          System.out.println("Se ha quedado sin intentos : ");
        }else{

         System.out.println("Area del Tetraedro :" + area + "Unidades cuadradas.");
         System.out.println("Volumen del Tetraedro :" + volumen + "Unidades cuadradas.");
         System.out.println("Altura del Tetraedro :" + altura + "Unidades cuadradas.");
        }

    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularHexaedro (int a){
  try {
    System.out.println ("Valor de lados:  ");
    a = lector.nextInt();

    if (a <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    area = 6*(a*a); //Math.pow(a, a);
    volumen = a*a*a ;
    diagonal = Math.sqrt(3)*a;

       if(intentos <3){

           System.out.println("Intentelo nuevamente");
           System.out.println("Le quedan : " + intentos + " Intentos");
     }
     intentos++;
   }

     if(intentos == 3){
       
     System.out.println("Se ha quedado sin intentos : ");
   }else{

    System.out.println("Area del Tetraedro :" + area + "Unidades cuadradas.");
    System.out.println("Volumen del Tetraedro :" + volumen + "Unidades cuadradas.");
    System.out.println("Diagonal del Tetraedro :" + diagonal + "Unidades cuadradas.");

   }

    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularOctaedro (int a){
  try{
    System.out.println ("Valor de la longitud de la arista:  ");
    a = lector.nextInt();

    if (a <= 0 ) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    area = 2*a*a* Math.sqrt(3);
    volumen = Math.sqrt(2)/3 *a*a*a ;

     if(intentos <3){

         System.out.println("Intentelo nuevamente");
         System.out.println("Le quedan : " + intentos + " Intentos");
   }
  intentos++;
 }

    if(intentos == 3){

   System.out.println("Se ha quedado sin intentos : ");
    }else{
    System.out.println("Area del Octaedro :" + area + "Unidades cuadradas.");
    System.out.println("Volumen del Octaedro :" + volumen + "Unidades cuadradas.");
 }

  }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }


}

public static void calcularDodecaedro (int a){
  try{
    System.out.println ("Valor de la longitud del lado:  ");
    a = lector.nextInt();

    if (a <= 0 ) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

  apotema = a/2 *Math.sqrt(3+ Math.sqrt (5));
  areaTotal = 3*(Math.sqrt(25) +10*Math.sqrt(5))*a*a;
  volumen = 0.25*(15+7*Math.sqrt(5))*a*a*a;
  areaPentagonal = 2.5*a*apotema;

    if(intentos <3){

        System.out.println("Intentelo nuevamente");
        System.out.println("Le quedan : " +  intentos + " Intentos");
    
  }
   intentos++;
}

   if(intentos == 3){
    
  System.out.println("Se ha quedado sin intentos : ");
}else{
  
   System.out.println("Area Total del dodecaedro :" + areaTotal +  "Unidades cuadradas.");
   System.out.println("Volumen del dodecaedro :" + volumen +  "Unidades cuadradas.");
   System.out.println("Area pentagonal del dodecaedro :" + areaPentagonal + "Unidades cuadradas.");
     }

      }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularIcosaedro (int a){
  try{
    System.out.println ("Valor de la longitud de la arista:  ");
    a = lector.nextInt();

    if (a <= 0 ) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    area = 5*a*a*(Math.sqrt(3));
    volumen =5/12 * (3+ Math.sqrt(5)) *a*a*a ;

       if(intentos <3){

           System.out.println("Intentelo nuevamente");
           System.out.println("Le quedan : " +  intentos + " Intentos");
       
     }
     intentos++;
   }

     if(intentos == 3){
       
     System.out.println("Se ha quedado sin intentos : ");
   }else{
  
    System.out.println("Area del Icosaedro :" + area + "Unidades cuadradas.");
    System.out.println("Volumen del Icosaedro :" + volumen + "Unidades cuadradas.");
   }

    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}

public static void calcularTroncoDeCono(double altura , double radioMayor, double radioMenor){
  try{
    System.out.println ("Ingrese altura del Tronco de cono :  ");
         altura = lector.nextDouble();

         System.out.println (" Ingrese Radio Mayor del Tronco de cono : ");
         radioMayor = lector.nextDouble();

         System.out.println (" Ingrese Radio menor del Tronco de cono : ");
         radioMenor = lector.nextDouble(); 

  if (altura <= 0 || radioMayor <= 0 || radioMenor <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

       areabaseMayor =  Math.PI*(radioMayor*radioMayor);
       areabaseMenor = Math.PI*(radioMenor*radioMenor);
       gentriz = Math.sqrt(altura*altura + (radioMayor-radioMenor)*(radioMayor-radioMenor));
       areaLateral = Math.PI *gentriz*(radioMayor+radioMenor);
       areaTotal = areaLateral + areabaseMayor + areabaseMenor;
       volumen = 1/3*Math.PI*altura*(radioMayor*radioMayor + radioMenor*radioMenor + radioMayor*radioMenor); 
  
         if(intentos <3){

             System.out.println("Intentelo nuevamente");
             System.out.println("Le quedan : " + intentos + " Intentos");
         
       }
       intentos++;
     }

       if(intentos == 3){
         
       System.out.println("Se ha quedado sin intentos : ");
     }else{

        System.out.println("Area Total del Tronco de cono :" + areaTotal +  "Unidades cuadradas.");
        System.out.println("Volumen del Tronco de cono :" + volumen +  "Unidades cuadradas.");
        System.out.println("Area Lateral del Tronco de cono :" + areaLateral + "Unidades cuadradas.");
     }

 }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }


}

public static void calcularTroncoDePiramide (double altura , double CantidadLados, double longitudLadosMayor , double longitudLadosMenor, double apotemaMayor , double apotemaMenor){
    try{
   System.out.println ("Ingrese altura del Tronco de Piramide:  ");
    altura = lector.nextDouble();

    System.out.println ("Ingrese Cantidad de lados del Tronco de Piramide:  ");
    CantidadLados = lector.nextInt();
     
    System.out.println (" Ingrese Longitud de lados mayor: ");
    longitudLadosMayor = lector.nextDouble();
    
    System.out.println (" Ingrese Longitud de lados menor: ");
    longitudLadosMenor = lector.nextDouble();
   
    System.out.println (" Ingrese apotema base mayor : ");
    apotemaMayor = lector.nextDouble();
    
    System.out.println (" Ingrese apotema base menor: ");
    apotemaMenor = lector.nextDouble();

    if (altura <= 0 || CantidadLados <= 0 || longitudLadosMayor <= 0 || longitudLadosMenor <= 0 || apotemaMayor <= 0 || apotemaMenor <= 0) {
      System.out.println("No se permiten valores negativos o iguales a 0 en algunos datos de la figura.");
  } else {

    perimetroMayor = CantidadLados*longitudLadosMayor;
    perimetroMenor = CantidadLados*longitudLadosMenor;
    areabaseMayor= perimetroMayor* apotemaMayor /2;
    areabaseMenor = perimetroMenor *apotemaMenor /2;
    apotema = Math.sqrt(altura + ((apotemaMayor-apotemaMenor)*(apotemaMayor-apotemaMenor)/2));
    areaLateral = perimetroMayor+perimetroMenor/2 *apotema;
    areaTotal = areaLateral +areabaseMayor + areabaseMenor;
    volumen = 1/3* altura*(areabaseMayor + areabaseMenor + Math.sqrt(areabaseMayor*areabaseMenor));

       if(intentos <3){

           System.out.println("Intentelo nuevamente");
           System.out.println("Le quedan : " + intentos + " Intentos");
       
     }
     intentos++;
   }

     if(intentos == 3){
       
     System.out.println("Se ha quedado sin intentos : ");
   }else{
  
   System.out.println("Area Total del Tronco de cono :" + areaTotal +  "Unidades cuadradas.");
   System.out.println("Volumen del Tronco de cono :" + volumen +  "Unidades cuadradas.");
   System.out.println("Area Lateral del Tronco de cono :" + areaLateral + "Unidades cuadradas.");
   }
    }catch (ArithmeticException e) {
    System.out.println("No se permite agregar letras , ni otro valor ilogico ");
   } catch (InputMismatchException e){
  }

}
}
 