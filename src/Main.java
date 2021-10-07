import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Declarando e instanciando a lista de nomes
        List<String> listaNomes = new ArrayList<>();

        // Adicionando nomes à lista
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("José");
        listaNomes.add("Adriano");
        listaNomes.add("Willian");
        listaNomes.add("Patricia");

        // Montando String para exibir a lista
        String saida = "";

        // Lista inicial: desordenada
        saida += "Lista desordenada: " + listaNomes;

        // Ordenando a lista usando método sort da classe Collections
        Collections.sort(listaNomes);

        // Lista alterada: ordenada
        saida += "\nLista ordenada: " + listaNomes;

        // Declarando e instanciando a TextArea
        // para receber a string
        JTextArea saidaArea = new JTextArea();
        // Atribuindo a string à TextArea
        saidaArea.setText(saida);

        // Exibindo a lista com caixa de diálogo JOptionPane
        JOptionPane.showMessageDialog(null,saidaArea,"Trabalhando com ArrayList",JOptionPane.INFORMATION_MESSAGE);

        // Saindo do sistema
        System.exit(0);
    }
}
