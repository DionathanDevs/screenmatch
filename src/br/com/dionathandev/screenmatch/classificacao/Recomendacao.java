package br.com.dionathandev.screenmatch.classificacao;

public class Recomendacao {


    public void filter(Classificavel classificavel) {
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Entre os preferidos do momento");
        }else if(classificavel.getClassificacao() >= 3){
            System.out.println("Bem avaliado no momento");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }

}
