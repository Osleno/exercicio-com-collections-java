package ExercicioCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExerciciosProposto {
    public static void main(String[] args) {
        System.out.println("Exiba todas as cores uma abaixo da outra");
        Set<ArcoIris> coresArcoIris = new LinkedHashSet<>(){{ 
            add(new ArcoIris("Vermelho"));
            add(new ArcoIris("Laranja"));
            add(new ArcoIris("Amarelo"));
            add(new ArcoIris("Verde"));
            add(new ArcoIris("Azul"));
        }};
        for (ArcoIris arcoIris : coresArcoIris) {
            System.out.println(arcoIris.getCor());
        }
        
        System.out.println("Exiba a quantidade de cores que o arco-íris tem");
        System.out.println(coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética");
        List<ArcoIris> listaOrdenada = new ArrayList<>(coresArcoIris);
        Collections.sort(listaOrdenada);
        
        for (ArcoIris arcoIris : listaOrdenada) {
            System.out.println(arcoIris.getCor());
        }
        
        System.out.println("Exiba as cores na ordem inversa da que foi informada");
        List<ArcoIris> listaReversa = new ArrayList<>(coresArcoIris);
        Collections.reverse(listaReversa);
        
        for (ArcoIris arcoIris : listaReversa) {
            System.out.println(arcoIris.getCor());
        }

        System.out.println("Exiba todas as cores que começam com a letra 'V'");
        boolean encontrouInicialComV = false;
        for (ArcoIris arcoIris : coresArcoIris) {
            if (arcoIris.getCor().startsWith("V")) {
                System.out.println(arcoIris.getCor());
                encontrouInicialComV = true;
            }
        } if (!encontrouInicialComV) {
            System.out.println("Nenhuma cor começa com a letra 'V'");
        }

        System.out.println("Remova todas as cores que não começam com a letra 'V'"); 
        List<ArcoIris> coresParaRemover = new ArrayList<>();
        for (ArcoIris arcoIris : coresArcoIris) {
            if (!arcoIris.getCor().startsWith("V")) {
                coresParaRemover.add(arcoIris);
            }
        }
        coresArcoIris.removeAll(coresParaRemover);
        System.out.println("Cores restantes: " + coresArcoIris);

        System.out.println("Limpe o conjunto de cores");
        coresArcoIris.clear();
        System.out.println("Conjunto de cores: " + coresArcoIris);

        System.out.println("Confira se o conjunto está vazio: ");
        System.out.println(coresArcoIris.isEmpty() + "\n");

        //EXERCÍCIOS PROPOSTOS 2
        
        //Crie um conjunto com 3 Linguagem 
        Set<LinguagemFavorita> Linguagem = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java",1995, "IntelliJ"));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "VSCode"));
        }};
        System.out.println("Exiba em ordem de Inserção");
        for (LinguagemFavorita linguagemFavorita : Linguagem) { 
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }  
        
        System.out.println("Exiba em ordem Natural (Nome)"); 
        List<LinguagemFavorita> linguagemOrdemNatural = new ArrayList<>(Linguagem);
        Collections.sort(linguagemOrdemNatural);
        for (LinguagemFavorita linguagemFavorita : linguagemOrdemNatural) { 
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("Exiba em odem lde");
        List<LinguagemFavorita> ordemIde = new ArrayList<>(Linguagem);
        ordemIde.sort(new ComparatorIde());
        for (LinguagemFavorita linguagemFavorita : ordemIde) { 
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("Exiba em ordem Ano de Criação e Nome");
        List<LinguagemFavorita> ordemNomeAno = new ArrayList<>(Linguagem); 
        ordemNomeAno.sort(new ComparatorAnoDeCriacaoNome());
        for (LinguagemFavorita linguagemFavorita : ordemNomeAno) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("Exiba em ordem de Nome, Ano e Ide");
        List<LinguagemFavorita> ordemNomeAnoIde = new ArrayList<>(Linguagem); 
        ordemNomeAnoIde.sort(new ComparatorNomeAnoDeCriacaoIde());
        for (LinguagemFavorita linguagemFavorita : ordemNomeAnoIde) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }
    }
}   

class ArcoIris implements Comparable<ArcoIris> {
    private String cor;
    
    public ArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return cor;
    }

    @Override
    public int compareTo(ArcoIris arcoIris) {
        return this.getCor().compareTo(arcoIris.getCor());
    }
}
 class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private int anoDeCriacao;
    private String ide;
   
    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita [nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ",  ide=" + ide + "]";
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareToIgnoreCase(linguagemFavorita.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getNome().compareToIgnoreCase(l2.getNome());

    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;

        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}