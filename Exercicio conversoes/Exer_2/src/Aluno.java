package Exer_2;
public class Aluno {


    // Atributos
    public String nome, situacao;
    public int ra;
    public float a1, a2, media, frequencia;


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSitucao(String situacao) {
        this.situacao = situacao;
    }
    public void setRA(int ra) {
        this.ra = ra;
    }
    public void setNota_a1(float a1) {
        this.a1 = a1;
    }
    public void setNota_a2(float a2) {
        this.a2 = a2;
    }
    public float getMedia(){

        this.media = (this.a1 + (2this.a2))/3; 

        return this.media;
    }
    public void setMedia(float media) {
        this.media = media;
    }
    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public void informacoes() {


        System.out.println ("nome: "+ this.nome );
        System.out.println ("nota a1: "+ this.nota_a1 );
        System.out.println ("nota a2: "+ this.nota_a2 );
        System.out.println ("frequencia: "+ this.frequencia );
        System.out.printf ("media: %.2f ", calcular_media());

    }



    public float calcular_media(){

        this.media = (this.a1 + (2this.a2))/3; 

        return this.media;

    }

    public void SituacaoAluno() {

        if(this.media <3) {
            System.out.println ("Ola "+ this.nome +" Você foi Reprovado!");
        }else
            if(this.media<5 && this.media>=3 && this.frequencia>75) {
            System.out.println ("Ola "+ this.nome +" Você esta de RE!");
        }
            else 
                if(this.media >=5 && this.frequencia >=75 ) {
                System.out.println ("Ola "+ this.nome +" Você foi Aprovado !");
            }else {
                System.out.println ("Ola "+ this.nome +" Você foi Reprovado !");
            }

    }
}
