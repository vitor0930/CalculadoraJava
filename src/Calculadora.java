import javax.swing.*;
import java.awt.*;
public class Calculadora {

    private JFrame janela;
    private JTextField visorEquacao;
    private JTextField visorAtual;

    public Calculadora(){
        janela = new JFrame();
        visorEquacao = new JTextField();
        visorAtual = new JTextField("0");
        

        janela.setSize(350, 450);
        janela.setTitle("Calculadora");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painelVisores = new JPanel(new GridLayout(2,1));
        
        visorEquacao.setEditable(false);
        visorEquacao.setHorizontalAlignment(JTextField.RIGHT);
        
        visorAtual.setEditable(false);
        visorAtual.setHorizontalAlignment(JTextField.RIGHT);
        visorAtual.setFont(new Font("Arial", Font.BOLD, 28));
        
        painelVisores.add(visorEquacao);
        painelVisores.add(visorAtual);
        
        janela.add(painelVisores,BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel(new GridLayout(4, 4));

        String[] textos = new String[]{ "7","8","9","/",
                                        "4","5","6","*",
                                        "1","2","3","-",
                                        "C","0","=","+"
        };

        for (String texto : textos) {
            JButton btn = new JButton(texto);
            painelBotoes.add(btn);
            btn.addActionListener(null);
        }

        janela.add(painelBotoes);
        
        janela.setVisible(true);

    }
}
