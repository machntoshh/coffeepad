import javax.swing.*; // importando TUDO em java Swing
import java.awt.*;

public class GUI {

    JFrame window; // parece ser imports do Swing, essas coisas com J e talz
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenu menuFile, menuEdit, menuFormat, menuColor;
    JMenuBar menuBar;
    JMenuItem itemNew, itemOpen, itemSave, itemSaveAs, itemExit;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() { // constructor
        createWindow(); // vou chamar o metodo createWindow nesse constructor e quando for criando os outros
        createTextArea();
        createMenuBar();
        createFileMenu();
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

    public void createMenuBar() { // nome diz tudo
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile = new JMenu("File");
        menuBar.add(menuFile); // add o novo criado menuFile na menuBar, navegação de arquivos

        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit); // editar arquivos

        menuFormat = new JMenu("Format text");
        menuBar.add(menuFormat); // formatar texto

        menuColor = new JMenu("Color");
        menuBar.add(menuColor); // trocar a cor
    }

    public void createFileMenu() {
        itemNew = new JMenuItem("New file");
        menuFile.add(itemNew);

        itemOpen = new JMenuItem("Open file");
        menuFile.add(itemOpen);

        itemSave = new JMenuItem("Save file");
        menuFile.add(itemSave);

        itemSaveAs = new JMenuItem("Save file as");
        menuFile.add(itemSaveAs);

        itemExit = new JMenuItem("Exit file");
        menuFile.add(itemExit);
    }
}
