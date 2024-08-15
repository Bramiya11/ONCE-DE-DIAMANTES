/*Zona de Imports*/ 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.io.*;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*Clase Main (única)*/
public class Main{
    
    /*ArrayList que se imprimirá en el archivo "posiciones.txt"*/
    static ArrayList<String> cadenas = new ArrayList<>();
    
  /*Funciones para imprimir las cartas*/
  static String orden1(){
    String a=" ___  ";
    String b1 = "|K  | ";
    String b2 = "|11 | ";
    String b3 = "|Q  | ";
    String c1 = "| ♣ | ";
    String c2 = "| ♦ | ";
    String c3 = "| ♥ | ";
    String d1 = "|  K| ";
    String d2 = "| 11| ";
    String d3 = "|  Q| ";
    String e = " ¯¯¯  ";
    String cadena=a+a+a+"\n"+b1+b2+b3+"\n"+c1+c2+c3+"\n"+d1+d2+d3+"\n"+e+e+e;
    return cadena;
  }

  static String orden2(){
    String a=" ___  ";
    String b1 = "|K  | ";
    String b2 = "|11 | ";
    String b3 = "|Q  | ";
    String c1 = "| ♣ | ";
    String c2 = "| ♦ | ";
    String c3 = "| ♥ | ";
    String d1 = "|  K| ";
    String d2 = "| 11| ";
    String d3 = "|  Q| ";
    String e = " ¯¯¯  ";
    String cadena=a+a+a+"\n"+b1+b3+b2+"\n"+c1+c3+c2+"\n"+d1+d3+d2+"\n"+e+e+e;
    return cadena;
  }

  static String orden3(){
    String a=" ___  ";
    String b1 = "|K  | ";
    String b2 = "|11 | ";
    String b3 = "|Q  | ";
    String c1 = "| ♣ | ";
    String c2 = "| ♦ | ";
    String c3 = "| ♥ | ";
    String d1 = "|  K| ";
    String d2 = "| 11| ";
    String d3 = "|  Q| ";
    String e = " ¯¯¯  ";
    String cadena=a+a+a+"\n"+b2+b1+b3+"\n"+c2+c1+c3+"\n"+d2+d1+d3+"\n"+e+e+e;
    return cadena;
  }

  static String orden4(){
    String a=" ___  ";
    String b1 = "|K  | ";
    String b2 = "|11 | ";
    String b3 = "|Q  | ";
    String c1 = "| ♣ | ";
    String c2 = "| ♦ | ";
    String c3 = "| ♥ | ";
    String d1 = "|  K| ";
    String d2 = "| 11| ";
    String d3 = "|  Q| ";
    String e = " ¯¯¯  ";
    String cadena=a+a+a+"\n"+b2+b3+b1+"\n"+c2+c3+c1+"\n"+d2+d3+d1+"\n"+e+e+e;
    return cadena;
  }

  static String orden5(){
    String a=" ___  ";
    String b1 = "|K  | ";
    String b2 = "|11 | ";
    String b3 = "|Q  | ";
    String c1 = "| ♣ | ";
    String c2 = "| ♦ | ";
    String c3 = "| ♥ | ";
    String d1 = "|  K| ";
    String d2 = "| 11| ";
    String d3 = "|  Q| ";
    String e = " ¯¯¯  ";
    String cadena=a+a+a+"\n"+b3+b1+b2+"\n"+c3+c1+c2+"\n"+d3+d1+d2+"\n"+e+e+e;
    return cadena;
  }

  static String orden6(){
    String a=" ___  ";
    String b1 = "|K  | ";
    String b2 = "|11 | ";
    String b3 = "|Q  | ";
    String c1 = "| ♣ | ";
    String c2 = "| ♦ | ";
    String c3 = "| ♥ | ";
    String d1 = "|  K| ";
    String d2 = "| 11| ";
    String d3 = "|  Q| ";
    String e = " ¯¯¯  ";
    String cadena=a+a+a+"\n"+b3+b2+b1+"\n"+c3+c2+c1+"\n"+d3+d2+d1+"\n"+e+e+e;
    return cadena;
  }

  static String desconocido(){
    String a=" ___  ";
    String b4="|?  | ";
    String c4="| ? | ";
    String d4="|  ?| ";
    String e=" ¯¯¯  ";
    String cadena=a+a+a+"\n"+b4+b4+b4+"\n"+c4+c4+c4+"\n"+d4+d4+d4+"\n"+e+e+e;
    return cadena;
  }

  /*Funciones para imprimir la historia*/
  static String historia1(){
    String a=" ___  ";
    String b1 = "|K  | ";
    String b3 = "|Q  | ";
    String c1 = "| ♣ | ";
    String c3 = "| ♥ | ";
    String d1 = "|  K| ";
    String d3 = "|  Q| ";
    String e = " ¯¯¯  ";
    String Historia1=a+a+"\n"+b1+b3+"\n"+c1+c3+"\n"+d1+d3+"\n"+e+e+"\nLo que ha pasado... \n\n- Hace mucho tiempo, todas las cartas del Reino Naipe habían logrado obtener paz y armonía para ellas mismas y sus familias. \nTodo fue fruto del duro e intenso trabajo de los supremos reyes (K) y (Q). Mientras que el \nRey repartía prosperidad, bondad, y sobre todo, buena suerte a todo el reino, la Reina repartía amor y cariño \na los mas vulnerables. Sin embargo, todo cambiaría con la llegada de un extraño, pero peligroso bando de cartas, \nconocidos como Once de Diamantes, todos sus integrantes son, literalmente, Onces de Diamantes. Ellos tienen el suficiente poder que \ndestruir reinos enteros gracias a su habilidad de camuflarse entre las demás cartas...";
    return Historia1;
  }

  static String historia2(){
    String a=" ___  ";
    String b2 = "|11 | ";
    String b4 = "|J  | ";
    String b5 = "|A  | ";
    String c2 = "| ♦ | ";
    String c4 = "| ♠ | ";
    String c5 = "| ♠ | ";
    String d2 = "| 11| ";
    String d4 = "|  J| ";
    String d5 = "|  A| ";
    String e = " ¯¯¯  ";
    String Historia2=a+a+a+"\n"+b4+b5+b2+"\n"+c4+c5+c2+"\n"+d4+d5+d2+"\n"+e+e+e+"\nLos que quedan... \n\n- Hace poco se supo de varios avistamientos a esta misteriosa carta y sus semejantes, y se tiene la sospecha \nde que podrían llegar a atacar a los reyes por sorpresa, sin que nadie pueda hacer nada al respecto. \nMuchas cartas de Jotas y Ases dieron la vida por defender sus pueblos y reinos, incluyendo las cartas Jotas \ny Ases de tipo Pica (que eran las más fuertes), dejándolas hoy en día en peligro de extinción. \nMuchas han caído en combate, y si caen todas, los reyes eventualmente lo harán también...";
    return Historia2;
  }

  static String historia3(){
    String a=" ___  ";
    String b4="|?  | ";
    String c4="| ? | ";
    String d4="|  ?| ";
    String e=" ¯¯¯  ";
    String Historia3=a+"\n"+b4+"\n"+c4+"\n"+d4+"\n"+e+"\nQuien eres... \n\n- Eres una carta... no se sabe si del bando de cartas rojas o negras, \ntampoco se sabe si eres un As, o una Jota, o un número, o incluso otro Rey o Reina, \ny ni hablemos de que tipo eres, si Diamante, o Pica, o Trébol, o Corazón. \nNo estoy muy seguro de si confiar en ti o no, muchas otras cartas han caido y no creo \nque tu vayas a ser una mega excepción. Solo síguele el rastro a Once de Diamantes y detéctalo cuando \ncrea que puede arrebatarnos a nuestros supremos lideres...";
    return Historia3;
  }
  
  /*Función para esperar 1000 milisegundos (1 segundo)*/
  static void esperar1(){
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {}
  }
  
  /*Función para esperar 2000 milisegundos (2 segundos)*/
  static void esperar2(){
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {}
  }
  
  /*Función para esperar 3000 milisegundos (3 segundos)*/
  static void esperar3(){
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {}
  }

  /*Función para esperar 4000 milisegundos (4 segundos)*/
  static void esperar4(){
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {}
  }

  /*Fecha y hora en String*/
  static String hora(){
    Calendar tiempoActual=Calendar.getInstance();
    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy 'a las' HH:mm:ss");
    String date=sdf.format(tiempoActual.getTime());
    String escrito="Se jugó el "+date;
    return escrito;
  }
  
  /*Main, Scanner, y definir variables*/ 
  public static void main(String[] args) throws UnsupportedEncodingException{
    Scanner s=new Scanner(System.in, "ISO-8859-1");
    String linea;
    String dividir;
    String linea2="";
    boolean reinicioTabla=false;
    String creditos;
    
    /*Archivo y lectura*/
    File miArchivo = new File("posiciones.txt");
    try {
      FileReader fileReader = new FileReader(miArchivo);
      BufferedReader reader;
      reader = new BufferedReader(fileReader);
      int dosdigitos=0;
      while ((linea = reader.readLine()) != null) {
          dosdigitos++;
          if (dosdigitos>=1000){
              dividir=linea.substring(6);
              cadenas.add(dividir); 
              reinicioTabla=true;
          }else if (dosdigitos>=100 && dosdigitos<1000){
            dividir=linea.substring(5);
            cadenas.add(dividir); 
          }else if (dosdigitos>=10 && dosdigitos<100){
            dividir=linea.substring(4);
            cadenas.add(dividir);  
          }else{
            dividir=linea.substring(3);
            cadenas.add(dividir);
          }
      }
      Collections.sort(cadenas, new Comparator<String>() {
            @Override
            public int compare(String cadena1, String cadena2) {
                int numero1 = Integer.parseInt(cadena1.split(" ")[0]);
                int numero2 = Integer.parseInt(cadena2.split(" ")[0]);
                return Integer.compare(numero2, numero1);
            }
        });
        try {
            if (reinicioTabla==true){
                FileWriter fileWriter = new FileWriter(miArchivo, false);
                BufferedWriter writer;
                writer = new BufferedWriter(fileWriter);
                writer.write(linea2);
                writer.close();
            }else{
            FileWriter fileWriter = new FileWriter(miArchivo, false);
            BufferedWriter writer;
            writer = new BufferedWriter(fileWriter);
            int posicionTabla=1;
            for (int m=0; m<cadenas.size(); m++){
                  writer.write(posicionTabla + ". " + cadenas.get(m));
                  writer.newLine();
                  posicionTabla++;
            }  
            writer.close();
            }
        } catch (IOException e) {
          System.out.println(e.getMessage());
        }
      reader.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    
    /*Otras variables*/
    String nombre="";
    String carta1="""
                   ___
                  |K  |
                  | ♣ |
                  |  K|
                   ¯¯¯
                  """;
    String carta2="""
                   ___
                  |11 |
                  | ♦ |
                  | 11|
                   ¯¯¯
                  """;
    String carta3="""
                   ___
                  |Q  |
                  | ♥ |
                  |  Q|
                   ¯¯¯
                  """;
    String carta0="""
                   ___
                  |3  |
                  | ♣ |
                  |  3|
                   ¯¯¯""";
    Random random=new Random();
    int puntaje=0;
    String Posicion1;
    boolean name=true;
    
    /*Introducción y simulación de carga*/
    System.out.println("¡Bienvenido a Once de Diamantes!\nCreado por Brandon Ramirez Bedoya.\n24/09/2023 (Beta) - 02/04/2024 (Estable) - 04/05/2024 (Versión final).\n(Se recomienda jugar a pantalla completa).\n"); 
    esperar1();
    System.out.print("Cargando...\n");
    esperar2();
    System.out.println("\nEste juego se basa en encontrar la carta del Once de Diamantes (en este caso, \nla carta marcada como '11 ♦ 11') que se ha juntado con las cartas del Rey (K) y Reina (Q). \n¿El problema? Las cartas van a ponerse boca abajo y van a rotarse entre \nellas mismas, cambiando así de posición. \nLuego de terminar los cambios de posiciones, debes decidir, entre 3 posbiles respuestas, \nen donde está la carta con el Once de Diamantes y así, salvar a los reyes.");
    
    /*Ciclo en donde se pide al usuario su nombre (en caso de querer cambiarlo o haber perdido una partida) y la acción a ejecutar*/
    while (true) {
      if (name==true){
        esperar2();
        System.out.print("\nPor favor, ingresa tu nombre: ");
        nombre=s.nextLine();
      }
      String opcion;
      esperar1();
      
      /*Se hace reinicio de la tabla de posiciones la próxima vez que se ejecuta el juego si esta sobrepasa las 1000 posiciones*/
      if (reinicioTabla==true){
          System.out.println("\n¡ALERTA! " + nombre + ", se ha rebasado el limite de posiciones en la tabla (999).\nEs necesario cerrar el juego para reiniciar la tabla.\nPresiona [ENTER] para salir del juego y reiniciar la tabla de posiciones.");
          s.nextLine();
          opcion = "S";
      }else{
        System.out.print("\n" + nombre + ", ingresa la acción a ejecutar y presiona [ENTER]: jugar a Once de Diamantes [ J ], ver la tabla \nde posiciones (de este PC) [ T ], conocer la historia [ H ], cambiar usuario [ C ] o salir del juego [ S ]: ");
        opcion = s.nextLine();
      }
      
      /*Presionando la tecla [J] se inicia el juego: aparecen las cartas aleatoriamente*/
      if (opcion.equals("J")) {
          String[] baraja=new String[]{carta1, carta2, carta3};
          for (int i=baraja.length-1; i>0; i--){
              int indicerandom=random.nextInt(i+1);
              String temp=baraja[i];
              baraja[i]=baraja[indicerandom];
              baraja[indicerandom]=temp;
          }
          int q=0;
          if (baraja[q+2].equals(carta3) && baraja[q].equals(carta1) && baraja[q+1].equals(carta2)){
              System.out.print(orden1());
          }else if (baraja[q].equals(carta1) && baraja[q+1].equals(carta3) && baraja[q+2].equals(carta2)){
              System.out.print(orden2());
          }else if (baraja[q].equals(carta2) && baraja[q+1].equals(carta1) && baraja[q+2].equals(carta3)){
              System.out.print(orden3());
          }else if (baraja[q].equals(carta2) && baraja[q+1].equals(carta3) && baraja[q+2].equals(carta1)){
              System.out.print(orden4());
          }else if (baraja[q].equals(carta3) && baraja[q+1].equals(carta1) && baraja[q+2].equals(carta2)){
              System.out.print(orden5());
          }else if (baraja[q].equals(carta3) && baraja[q+1].equals(carta2) && baraja[q+2].equals(carta1)){
              System.out.print(orden6());
          }
          
          /*Se presiona [ENTER] para iniciar*/
          System.out.print("\n" + nombre + ", presiona [ENTER] para comenzar la partida.");
          s.nextLine();
          
          /*Se muestra una representación de las cartas hacía abajo*/
          System.out.print("\n¡Las cartas se han puesto boca abajo, van a moverse!");
          System.out.print("\n" + desconocido());
          
          /*Se cambia aleatoriamente la posición de las cartas*/
          System.out.print("\n¡AQUÍ VIENEN LOS INTERCAMBIOS!\n");
          System.out.print("\n");
          int cambios=0;
          while (cambios<6){
              int indice1=random.nextInt(3);
              int indice2=random.nextInt(3);
              while (indice1==indice2) {
                  indice2 = random.nextInt(3);
              }
              String temp = baraja[indice1];
              baraja[indice1] = baraja[indice2];
              baraja[indice2] = temp;
              cambios+=2;
              esperar1();
              
              /*Se hacen 3 cambios y se imprimen*/
              System.out.println("La carta en la posición [ " + (indice1+1) + " ] se ha cambiado con la carta de la posición [ " + (indice2+1) + " ].");
          }
          cambios=0;
          
          /*Se hacen otros 3 cambios y se imprimen*/
          while (cambios<6){
              int indice1=random.nextInt(3);
              int indice2=random.nextInt(3);
              while (indice1==indice2) {
                  indice2 = random.nextInt(3);
              }
              String temp = baraja[indice1];
              baraja[indice1] = baraja[indice2];
              baraja[indice2] = temp;
              cambios+=2;
              esperar1();
              System.out.println("La carta en la posición [ " + (indice1+1) + " ] se ha cambiado con la carta de la posición [ " + (indice2+1) + " ].");
          }
          
          /*Se pide al usuario que indique del 1 al 3 en que posición se encuentra Once de Diamantes, si se ingresa un número invalido se vuelve a pedir*/
          int posicion;
          while (true){
              System.out.print("\nIngresa el número de posición en el que consideras que podría estar el Once de Diamantes (Del 1 al 3): ");
              posicion=s.nextInt();
              if (posicion<=3 && posicion>=1){
                  posicion=posicion-1;
                  break;
              }else{
                  System.out.println("Incorrecto. Por favor, ingresa un número entre 1 y 3.");
              }
          }
          
          /*Se verifica si la posición ingresada es correcta o no*/
          boolean aviso=false;
          for (int i=0; i<baraja.length; i++){
              if (baraja[i].equals(carta2) && i==posicion){
                  System.out.println("\n¡Es correcto, ganaste! :D");
                  puntaje+=1;
                  name=false;
                  System.out.println("Tu puntaje actual es de: " + puntaje + " punto(s).");
                  
                  /*Mensajes que se imprimen en pantalla referente a la historia dependiendo el puntaje del jugador*/
                  if (puntaje==5){
                      esperar1();
                      System.out.println("\n- Veo que me equivoqué contigo al principio, espero seguir así de equivocado en el futuro...");
                  }
                  if (puntaje==10){
                      esperar1();
                      System.out.println("\n- Pues si que nos has sido muy útil, me retrato completamente de haber desconfiado de ti...");
                  }
                  if (puntaje==15){
                      esperar1();
                      System.out.println("\n- Luego de mucho tiempo, por fin podemos decir que le estamos dando una buena batalla a Once de Diamantes \ny sus secuaces, podemos estar acercándonos a nuestra adorada libertad...");
                  }
                  if (puntaje==20){
                      esperar1();
                      System.out.println("\n- Gracias a tu ayuda, las cosas han mejorado un poco en el Reino Naipe, sin embargo, miembros de Once \nde Diamantes aún siguen ahí afuera...");
                  }
                  if (puntaje==25){
                      esperar1();
                      System.out.println("\n- El Rey y la Reina te envían saludos especiales, por Dios, yo me sentiría la carta más afortunada de \ntodo el Reino Naipe.");
                  }
                  if (puntaje==30){
                      esperar1();
                      System.out.println("\n- El trabajo no ha terminado... debemos seguir protegiendo a nuestros lideres...");
                  }
                  if (puntaje==35){
                      esperar1();
                      System.out.println("\n- La próxima vez que Once de Diamantes y sus secuaces vengan les tenderemos una trampa: dejemos que \nentren al reino y los emboscaremos a todos. ¡No tendrán escapatoría!");
                  }
                  if (puntaje==40){
                      esperar1();
                      System.out.println("\n- ¡Todos prepárense! ¡Once de Diamantes y sus secuaces se acercan al Reino Naipe!");
                  }
                  if (puntaje==45){
                      esperar1();
                      System.out.println("\n- ¡Han ingresado al reino! ¡Es nuestra oportunidad de acabar con todos ellos!");
                  }
                  
                  /*Final del juego y créditos*/
                  if (puntaje==50){
                      esperar3();
                      System.out.println("\n- ¡LO HEMOS LOGRADO! ¡Hemos derrotado a Once de Diamantes! ¡Eres un héroe!");
                      esperar3();
                      System.out.println("¡Gracias a Dios que lo hemos logrado! ¡Libertad, por fin!");
                      esperar3();
                      System.out.println("A pesar de que no acabamos con TODO el bando, si les hemos dado un fuerte golpe a su \nescuadrón principal, así que hemos ganado la guerra, ahora todos podrán vivir felizmente en el Reino Naipe.");
                      esperar3();
                      System.out.println(carta0);
                      esperar1();
                      System.out.print("Por si alguna vez te lo preguntaste, este soy yo: Soy una carta número 3, de tipo Treból y \nde color negro, aunque eso último es solo algo agregado, hace años dejamos de tratarnos socialmente por nuestro \ncolor rojo o negro, en fin. Ha sido un gran placer defender y devolverle la paz a este reino \na tu lado. Aún así, quedan muchos integrantes de Once de Diamantes sueltos por ahí, así que... \n¡Vamos a por ellos!");
                      esperar3();
                      System.out.println("\n\nFIN DE LA HISTORIA DE ONCE DE DIAMANTES. No eres un héroe, eres El Héroe...");
                      esperar3();
                      
                      /*Créditos*/
                          System.out.println("\n(Puedes encontrar una transcripción de los créditos en el archivo LÉEME.TXT y en las instrucciones).");
                          esperar2();
                          System.out.println("Once de Diamantes - Créditos");
                          esperar2();
                          System.out.println("\nCreador:\nBrandon Ramirez Bedoya.");
                          esperar3();
                          System.out.println("\nFunción:\nDesarrollador, Escritor, Programador");
                          esperar3();
                          System.out.println("\nProgramado en NetBeans con Java y JDK 20.\nConvertido con Bat To Exe Converter.\nCompilado con Inno Setup Compiler (versión de instalador).");
                          esperar3();
                          System.out.println("\nContacto:\nCorreo electrónico: oncedediamantes@outlook.com\nSitio web: oncedediamantes.com\nAlias: Bramiya - Bramiya11.");
                          esperar3();
                          System.out.println("\nAgradecimientos y menciones especiales (Universidad Católica Luis Amigó Sede Medellín):");
                          System.out.println("Al Docente Uriel Moreno Lopez por enseñarme a crear sitios web. La web de este videojuego es un ejemplo de lo aprendido.");
                          System.out.println("Al Docente Juan Felipe Muñoz por darme los conocimientos de la programación en Java y por toda la ayuda y apoyo recibido.");
                          System.out.println("Al Docente Jeffry Andres Jaramillo por enseñarme la lógica de la programación de software.");
                          System.out.println("Al Docente Jaime Botero por sus conocimientos en bases de datos y siempre haber creido en mí.");
                          System.out.println("Al Docente Leonardo Vasquez Alzate por resolver mis dudas, inducirme en los Derechos de Autor y todo su apoyo al proyecto.");
                          System.out.println("A la Docente Janneth Muñoz Rendon por su apoyo incondicional y por haber creido en mí, le prometo siempre servir a la humanidad.");
                          System.out.println("Al curso y la universidad en general por ser parte de la mejor etapa de mi vida.");
                          esperar4();
                          System.out.println("\nA mi familia por ser mi mayor apoyo en mi vida.");
                          System.out.println("Y al que está leyendo esto... gracias por jugar, Héroe.");
                          esperar3();
                          System.out.println("\nOnce de Diamantes.");    
                          esperar4();
                  }
                  
                  
                  /*Easter Egg*/
                  if (puntaje==3421){
                      esperar3();
                      System.out.println("\nMalena. Talker, ¿dónde estamos?");
                      esperar3();
                      System.out.println("InterTalker. Según mis calculos, nos encontramos en el interior de... ¿un jueguito de cartas en una PC?");
                      esperar3();
                      System.out.println("Malena. Perfecto, no solo me bastó con destruir Medalla, también podré joder esta PC.");
                      esperar3();
                      System.out.println("InterTalker. Oh, mi Ama, lamento decirlo, pero el CCM ya se adelantó a eso, por lo que veo.");
                      esperar3();
                      System.out.println("Malena. Puta vida la mía.");
                      esperar3();
                      System.out.println("(AHL). Y la mía...");
                      esperar3();
                  }
                  break;
              }
              
              /*Carta incorrecta*/
              if (baraja[i].equals(carta2) && i!=posicion){
                  name=false;
                  aviso=true;
                  System.out.println("\nIncorrecto, has perdido :(");
                  System.out.println("Tu puntaje ha sido de: " + puntaje + " punto(s).");
                  
                  /*Se actualiza la tabla de posiciones con el ultimo puntaje que el jugador tuvo antes de perder*/
                  if (puntaje>=1){
                      Posicion1=puntaje+" punto(s), "+nombre+", "+hora();
                      cadenas.add(Posicion1);
                      Collections.sort(cadenas, new Comparator<String>() {
                          @Override
                          public int compare(String cadena1, String cadena2) {
                              int numero1 = Integer.parseInt(cadena1.split(" ")[0]);
                              int numero2 = Integer.parseInt(cadena2.split(" ")[0]);
                              return Integer.compare(numero2, numero1);
                          }
                      });
                      try {
                          if (reinicioTabla==true){
                              FileWriter fileWriter = new FileWriter(miArchivo, false);
                              BufferedWriter writer;
                              writer = new BufferedWriter(fileWriter);
                              writer.write(linea2);
                              writer.close();
                              reinicioTabla=false;
                          }else{
                              FileWriter fileWriter = new FileWriter(miArchivo, false);
                              BufferedWriter writer;
                              writer = new BufferedWriter(fileWriter);
                              int posicionTabla=1;
                              for (int m=0; m<cadenas.size(); m++){
                                  writer.write(posicionTabla + ". " + cadenas.get(m));
                                  writer.newLine();
                                  posicionTabla++;
                              }
                              writer.close();
                          }
                      } catch (IOException e) {
                          System.out.println(e.getMessage());
                      }
                  }
                  puntaje=0;
                  break;
              }
          }
          
          /*Luego de verificarse, el programa devuelve el orden final de las cartas*/
          esperar1();
          System.out.println("\nAquí tienes el orden final.");
          if (baraja[q].equals(carta1) && baraja[q+1].equals(carta2) && baraja[q+2].equals(carta3)){
              System.out.print(orden1());
          }else if (baraja[q].equals(carta1) && baraja[q+1].equals(carta3) && baraja[q+2].equals(carta2)){
              System.out.print(orden2());
          }else if (baraja[q].equals(carta2) && baraja[q+1].equals(carta1) && baraja[q+2].equals(carta3)){
              System.out.print(orden3());
          }else if (baraja[q].equals(carta2) && baraja[q+1].equals(carta3) && baraja[q+2].equals(carta1)){
              System.out.print(orden4());
          }else if (baraja[q].equals(carta3) && baraja[q+1].equals(carta1) && baraja[q+2].equals(carta2)){
              System.out.print(orden5());
          }else if (baraja[q].equals(carta3) && baraja[q+1].equals(carta2) && baraja[q+2].equals(carta1)){
              System.out.print(orden6());
          }
          
          /*Partida terminada*/
          if (aviso==true){
              esperar1();
              System.out.println("\n\nFallaste...\n- Sabía que no podíamos contar contigo...");
              esperar1();
              System.out.println("\nPartida terminada, volvemos al menú de inicio...");
              esperar1();
          }else{
              System.out.println("\nPartida terminada, volvemos al menú de inicio...");
              esperar1();
          }
          s.nextLine();
          
          /*Presionando la tecla [T] se imprime la tabla de posiciones*/
        } else if (opcion.equals("T")) {
            System.out.println("\nPosiciones de Once de Diamantes: ");
            if (puntaje>=1){
            }
            if (reinicioTabla==true){
                cadenas.clear();
            }else{
                for (String cadena : cadenas) {
                    System.out.println(cadena);
                }
            }
            System.out.println("Fin de las posiciones (Juega hasta que pierdas, cambia de usuario o sal del juego para actualizar\nla Tabla de Posiciones).");
            name=false;
            
        /*Presionando la tecla [H] se imprimen los textos de la historia cada que el jugador presiona [ENTER]*/
        } else if (opcion.equals("H")) {
            esperar1();
            System.out.println(historia1());
            System.out.print("\nContinuar: [ENTER] ");
            s.nextLine();
            System.out.println(historia2());
            System.out.print("\nContinuar: [ENTER] ");
            s.nextLine();
            System.out.println(historia3());
            System.out.print("\nTerminar y volver al menú: [ENTER] ");
            s.nextLine();
            name=false;
        
        /*Presionando la tecla [C] se actualiza la tabla de posiciones y se permite al usuario cambiar de nombre*/
        } else if (opcion.equals("C")) {
            if (puntaje>=1){
                Posicion1=puntaje+" punto(s), "+nombre+", "+hora();
                cadenas.add(Posicion1);
                Collections.sort(cadenas, new Comparator<String>() {
                    @Override
                    public int compare(String cadena1, String cadena2) {
                        int numero1 = Integer.parseInt(cadena1.split(" ")[0]);
                        int numero2 = Integer.parseInt(cadena2.split(" ")[0]);
                        return Integer.compare(numero2, numero1);
                    }
                });
                try {
                    if (reinicioTabla==true){
                        FileWriter fileWriter = new FileWriter(miArchivo, false);
                        BufferedWriter writer;
                        writer = new BufferedWriter(fileWriter);
                        writer.write(linea2);
                        writer.close();
                        reinicioTabla=false;
                    }else{
                        FileWriter fileWriter = new FileWriter(miArchivo, false);
                        BufferedWriter writer;
                        writer = new BufferedWriter(fileWriter);
                        int posicionTabla=1;
                        for (int m=0; m<cadenas.size(); m++){
                            writer.write(posicionTabla + ". " + cadenas.get(m));
                            writer.newLine();
                            posicionTabla++;
                        }
                        writer.close();
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            name=true;
            puntaje=0;
            System.out.println("Se ha actualizado la Tabla de Posiciones");
            
        /*Presionando la tecla [S] se actualiza la tabla de posiciones y se cierra el juego*/
        } else if (opcion.equals("S")) {
            if (puntaje>=1){
                Posicion1=puntaje+" punto(s), "+nombre+", "+hora();
                cadenas.add(Posicion1);
                Collections.sort(cadenas, new Comparator<String>() {
                    @Override
                    public int compare(String cadena1, String cadena2) {
                        int numero1 = Integer.parseInt(cadena1.split(" ")[0]);
                        int numero2 = Integer.parseInt(cadena2.split(" ")[0]);
                        return Integer.compare(numero2, numero1);
                    }
                });
                try {
                    FileWriter fileWriter = new FileWriter(miArchivo, false);
                    BufferedWriter writer;
                    writer = new BufferedWriter(fileWriter);
                    int posicionTabla=1;
                    for (int m=0; m<cadenas.size(); m++){
                        writer.write(posicionTabla + ". " + cadenas.get(m));
                        writer.newLine();
                        posicionTabla++;
                    }
                    writer.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("\n¡Adiós, gracias por jugar y vuelve pronto! (Se ha actualizado la Tabla de Posiciones)");
            esperar3();
            break;
        
        /*En el caso de que el usuario ingrese una opción no válida en el menú de inicio, se le volverá a solicitar que ingrese la opción correcta en formato MAYÚSCULA*/
        } else {
            System.out.println("Opción no válida, ingrese alguno de los carácteres anteriormente mencionados y en formato MAYÚSCULA.");
            name=false;
        }  
    }
  }
}
