package IntroAlaPrograma.Clases;

public class motor {
    //1. atributos
    String modelo;
    int caballos;
    double parNm;
    int numCilindros;


    // 2. constructor

    public motor(){
        
    }


    public motor(String modelo, int caballos, double parNm, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }

}
