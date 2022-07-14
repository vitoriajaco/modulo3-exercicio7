public class Main {
    public static void main(String[] args) {

            Pais brasil = new Pais("BRA", "Brasil",955.85);
            Pais paraguai = new Pais("UAI","Paraguai",35 );
            Pais chile = new Pais ("CHI", "chile", 145);
            Pais uruguai = new Pais ("URU", "Uruguai",25);
            Pais argentina = new Pais("ARG", "Argentina", 458);
            Pais bolivia = new Pais("BOL", "Bolivia", 856);


            brasil.setPopulacao(100000);
            brasil.mostrar();
            argentina.setPaisFronteira(brasil);
            brasil.setPaisFronteira(uruguai);
            brasil.setPaisFronteira(argentina);
            chile.setPaisFronteira(argentina);
            brasil.setPaisFronteira(bolivia);
            chile.setPaisFronteira(bolivia);
            System.out.println(brasil.verificaVizinhosEmComum(chile));




//            paraguai.setPaisFronteira(uruguai);
//            paraguai.setPaisFronteira(brasil);
//
//            uruguai.setPaisFronteira(paraguai);
//            uruguai.setPaisFronteira(brasil);
//

        }
    }

