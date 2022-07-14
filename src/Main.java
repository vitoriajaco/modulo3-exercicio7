public class Main {
    public static void main(String[] args) {

            Pais brasil = new Pais("BRA", "Brasil",955.85);
            Pais paraguai = new Pais("UAI","Paraguai",35 );
            Pais chile = new Pais ("CHI", "chile", 145);
            Pais uruguai = new Pais ("URU", "Uruguai",25);


            brasil.setPopulacao(100000);
            brasil.mostrar();
            brasil.setPaisFronteira(uruguai);
            brasil.paisVizinho(uruguai);

            paraguai.setPaisFronteira(uruguai);
            paraguai.setPaisFronteira(brasil);

            uruguai.setPaisFronteira(paraguai);
            uruguai.setPaisFronteira(brasil);

        }
    }

