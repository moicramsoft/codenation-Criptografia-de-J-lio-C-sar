package challenge;

import java.util.Scanner;

/** Cesar's cryptography. */
public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        return this.criJS(texto, 3);
    }

    @Override
    public String descriptografar(String texto) {
        return this.criJS(texto, -3);
    }

    public String criJS(String texto, int K) {
        String criJSText= "";
        Scanner scan = new Scanner (System.in); 
        System.out.println ("Digite o texto: "); 
        String entrada = scan.nextLine(); 
        System.out.println (entrada); 
        

        if (texto.isEmpty()) {
            System.out.println("Nenhum valor foi informado");
            } else {
        System.out.println("Nenhum valor foi informado");}

        for (char alfabetoLetra : texto.toLowerCase().toCharArray()) {

            while( alfabetoLetra >= 'a' && alfabetoLetra <= 'z' ) {
               int position = Math.floorMod((entrada.indexOf(alfabetoLetra) + K), entrada.length());
                criJSText += entrada.charAt(position);
                criJSText += alfabetoLetra;
            }
        }
        return criJSText;
    }
    public static void main(String[] args) { 
        

}}