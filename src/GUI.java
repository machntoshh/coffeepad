import javax.swing.*; // importando TUDO em java Swing
import java.awt.*;

public class GUI {

    JFrame window; // parece ser imports do Swing, essas coisas com J e talz
    JTextArea textArea;
    JScrollPane scrollPane;

    public static void main(String[] args) {
        new GUI();
    }
    public GUI() { // constructor
        // vou chamar o metodo createWindow nesse constructor
        createWindow();
        // vou chamar o createTextArea agora
        createTextArea();

        window.setVisible(true); // setando a visibilidade dela para true
    }


    public void createWindow() { // method para criar a janela, com specs
        window = new JFrame("Coffeepad"); // nova janela com nome Coffeepad
        window.setSize(800, 600); // Default size da janela
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para fechar a janela coffeepad aberta
    }


    public void createTextArea() {
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // Add barra de rolagem
        scrollPane.setBorder(BorderFactory.createEmptyBorder()); // tirando as mini boridnhas no notepad

        window.add(scrollPane, BorderLayout.CENTER); // add janela com scrollpane centralizada

        // window.add(textArea);  add o textArea para a window
    }
}
