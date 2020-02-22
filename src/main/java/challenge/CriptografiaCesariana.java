package challenge;
/* para rodar o projeto precisa do Gradle e declarar com variavel de ambiente do Windows
https://gradle.org/install/

ao terminar rodar comando  gradle -v no cmd
*/

public class CriptografiaCesariana implements Criptografia {

   
    @Override
    public String criptografar(String txtDeEntradaDeEntrada) {
        return this.jcCptDcpt(txtDeEntradaDeEntrada, 3);
    }

    /*
    função jcCptDcpt faz criptografia e Descriptografia
     */
    @Override
    public String descriptografar(String txtDeEntradaDeEntrada) {
        return this.jcCptDcpt(txtDeEntradaDeEntrada, -3);
    }


    private String jcCptDcpt(String texto, int Chave) {
        String comparativo = "abcdefghijklmnopqrstuvwxyz";
        String jcCptDcptText= "";
        char Alpha='a';
        char Omega='z';
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("Não é permitido dados nulo");
        }

        for (char letraDeComparacaoDeComparacao : texto.toLowerCase().toCharArray()) {

            if( letraDeComparacaoDeComparacao >= Alpha && letraDeComparacaoDeComparacao <= Omega ) {
               int position = Math.floorMod((comparativo.indexOf(letraDeComparacaoDeComparacao) + Chave), comparativo.length());
                jcCptDcptText += comparativo.charAt(position);
            }else {
                jcCptDcptText += letraDeComparacaoDeComparacao;
            }
        }
        return jcCptDcptText;
    }
}