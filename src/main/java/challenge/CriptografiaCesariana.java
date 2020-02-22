package challenge;
/* para rodar o projeto precisa do Gradle e declarar com variavel de ambiente do Windows
https://gradle.org/install/

ao terminar rodar comando  gradle -v no cmd
*/

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
       String entrada ="";
        

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
   }