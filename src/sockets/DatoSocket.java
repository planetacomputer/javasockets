package sockets;

/*
 * Javier Abell�n. 1 de diciembre de 2003
 *
 * DatoSocket.java
 *
 */

import java.io.*;

/**
 * Dato para enviar por el socket. Sus atributos son simples y una Clase Atributo
 */
public class DatoSocket implements Serializable
 {
     /** Primer atributo, un int */
     public int c = 45;
     
     /** Segundo atributo, un String */
     public String d = "DatoSocket.d";
     
     /** Tercer atributo, una clase Serializable */
     Atributo e = new Atributo();
     
     /** M�todo para devolver un String en el que se represente el valor de
      * todos los atributos. */
     public String toString ()
     {
         String resultado;
         resultado = Integer.toString(c) +
            " -- " + d + " -- " + e.toString();
         return resultado;
     }

     /*******
      *
      * LOS SIGUIENTES M�TODOS SON INNECESARIOS SALVO QUE QUERAMOS QUE SE
      * ENVIEN Y RECIBAN LOS DATOS DE FORMA NO STANDARD.
      * Puedes descomentarlos y todo funcionar� exactamente igual
      *
      *******/
     /*
     private void writeObject(java.io.ObjectOutputStream out)
         throws IOException
     {
         out.writeInt (c);
         out.writeUTF (d);
         out.writeInt (e.a);
         out.writeUTF (e.b);
     }*/
     
     /*
     private void readObject(java.io.ObjectInputStream in)
     throws IOException, ClassNotFoundException
     {
         c = in.readInt();
         d = in.readUTF();
         if (e==null) e = new Atributo();
         e.a = in.readInt();
         e.b = in.readUTF();
     }*/
}
