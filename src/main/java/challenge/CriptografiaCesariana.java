package challenge;

import java.util.Scanner;

public class CriptografiaCesariana implements Criptografia {

    public String criptografar(String texto) {
        Scanner t = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        char ascii;
        char x, y;
        System.out.println("Digite a mensagem: ");
        String mens = t.nextLine();
        System.out.println("Digite a CHAVE: ");//chave ser� um n�mero que deslocar� a mensagem pela sua quantidade (msg 'a' e chave = 3, cifra= 'c')
        int chave = v.nextInt();
        while (chave >= 26) {//chave tem que ter o tamanho do alfabeto
            chave = chave - 26;
        }
        for (int i = 0; i < mens.length(); i++) {
         //Tratamento Letras minusculas  
            if (mens.charAt(i) >= 97 && mens.charAt(i) <= 122) {//letrans minusculas de acordo com a tabela ASCII
                if ((int) (mens.charAt(i) + chave) > 122) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 122);
                    ascii = (char) (96 + y);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");

                }
            }
	//Tratamento Letras mausculas
            if (mens.charAt(i) >= 65 && mens.charAt(i) <= 90) {
                if (mens.charAt(i) + chave > 90) {
                    x = (char) (mens.charAt(i) + chave);
                    y = (char) (x - 90);
                    ascii = (char) (64 + y);
                    System.out.print(ascii + " ");
                } else {
                    ascii = (char) (mens.charAt(i) + chave);
                    System.out.print(ascii + " ");
                }
            }
        }
        //throw new UnsupportedOperationException("esse method nao esta implementado aainda");
        return null;
    }

    public String descriptografar(String texto) {
        throw new UnsupportedOperationException("esse method nao esta implementado aainda");
    }
}
