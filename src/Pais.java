import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String codigoIso;
    private String nomePais;
    private double populacao;
    private double dimensao;
    private Set<Pais> paisFronteira = new HashSet<>();

    public Pais(String codigoIso, String nomePais, double dimensao) {
        this.codigoIso = codigoIso;
        this.nomePais = nomePais;
        this.dimensao = dimensao;
    }

    public double densidadePopulacional(){
        return this.populacao/this.dimensao;

    }
    public void paisVizinho (Pais pais){
        if (this.paisFronteira.contains(pais)){
            System.out.println( pais.getNomePais() + " É VIZINHO!");
        } else {
            System.out.println( pais.getNomePais() + " NÃO É VIZINHO!");
        }
    }

    public void mostrar(){
        System.out.println("Nome: " + this.getNomePais() + " Codigo ISO: " + this.getCodigoIso());
        System.out.println("População: " + this.getPopulacao() + " Dimensão: " + getDimensao());
        System.out.println("Densidade Populacional: " + this.densidadePopulacional());

    }

    public Set<Pais> getPaisFronteira() {
        return paisFronteira;
    }

    public void vizinhos(Pais pais){

            System.out.println();

        }


    public void setPaisFronteira(Pais pais) {
        this.paisFronteira.add(pais);
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }


}
