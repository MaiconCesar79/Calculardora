import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Tela extends JFrame {
    private JTextField txtTela;
    private JPanel JTela;
    private JButton btnC;
    private JButton btnCE;
    private JButton btnElevado;
    private JButton btnDivisao;
    private JButton btnMultiplicacao;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSubtracao;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSoma;
    private JButton btnResul;
    private JButton btn0;
    private JButton btnPonto;
    private JButton btnIgual;

    Calculadora calculo = new Calculadora();
    String valor = "";
    boolean virgula = false;
    boolean zerarTela = false;
    boolean c = false;
    int op = 0;
    public Tela(){
        setContentPane(JTela);
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,650);
        setLocationRelativeTo(null);
        setVisible(true);
        txtTela.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!Character.isDigit(c)){
                    e.consume();
                }
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = true;
                limpar();
            }
        });
        btnCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpar();
            }
        });
        btnElevado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elevado();
            }
        });
        btnDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dividir();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("9");
            }
        });
        btnMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplicar();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("6");
            }
        });
        btnSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subtrair();
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("3");
            }
        });
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                somar();
            }
        });
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zerarTela();
                addNumero("0");
            }
        });
        btnPonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                virgula();
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual();
            }
        });
        btnResul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ultimoResul();
            }
        });
    }

    public static void main(String[] args) {
        new Tela();
    }

    public void zerarTela(){
        if(zerarTela == true){
            txtTela.setText("");
        }
        zerarTela = false;
    }

    public void virgula(){
        if(virgula == false){
            addNumero(".");
            virgula = true;
        }
    }
    public void addNumero(String numero){
        valor = txtTela.getText();
        txtTela.setText(valor + numero);
    }

    public void somar(){
        op = 1;
        virgula = false;
        switch (txtTela.getText()) {
            case "Não é possivel dividir por 0!" ->{
                txtTela.setText("");
                c = true;
                limpar();
            }
            case "" -> txtTela.setText("" );
            case"-" -> txtTela.setText("-" );
            default -> {
                calculo.setNumero1(Double.parseDouble(txtTela.getText()));
                txtTela.setText("");
            }
        }
    }

    public void subtrair(){
        virgula = false;
        switch (txtTela.getText()) {
            case "Não é possivel dividir por 0!" ->{
                txtTela.setText("");
                c = true;
                limpar();
            }
            case "" -> {
                txtTela.setText("-" );
                zerarTela = false;
            }
            case"-" -> {
                txtTela.setText("-" );
                op = 2;
            }
            default -> {
                op = 2;
                calculo.setNumero1(Double.parseDouble(txtTela.getText()));
                txtTela.setText("");
            }
        }

    }

    public void multiplicar(){
        op = 3;
        virgula = false;
        switch (txtTela.getText()) {
            case "Não é possivel dividir por 0!"->{
                txtTela.setText("");
                c = true;
                limpar();
            }
            case "" -> txtTela.setText("" );
            case"-" -> txtTela.setText("-" );
            default -> {
                calculo.setNumero1(Double.parseDouble(txtTela.getText()));
                txtTela.setText("");
            }
        }
    }

    public void dividir(){
        op = 4;
        virgula = false;
        switch (txtTela.getText()) {
            case "Não é possivel dividir por 0!" ->{
                txtTela.setText("");
                c = true;
                limpar();
            }
            case "" -> txtTela.setText("" );
            case"-" -> txtTela.setText("-" );
            default -> {
                calculo.setNumero1(Double.parseDouble(txtTela.getText()));
                txtTela.setText("");
            }
        }
    }

    public void igual(){
        if(txtTela.getText().equals("")){
            txtTela.setText("");
        }else{
            calculo.setNumero2(Double.parseDouble(txtTela.getText()));
        }
        try{
            switch(op){
                case 1 -> calculo.setTotal(calculo.somar(calculo.getNumero1(), calculo.getNumero2()));
                case 2 -> calculo.setTotal(calculo.subtrair(calculo.getNumero1(), calculo.getNumero2()));
                case 3 -> calculo.setTotal(calculo.multiplicar(calculo.getNumero1(), calculo.getNumero2()));
                case 4 ->{
                    calculo.setTotal(calculo.dividir(calculo.getNumero1(), calculo.getNumero2()));
                }
                default -> {
                    break;
                }
            }
            if(calculo.getTotal() % 1 != 0){
                txtTela.setText(Double.toString(calculo.getTotal()));
            }else{
                txtTela.setText(Integer.toString((int)calculo.getTotal()));
            }
        }catch(ArithmeticException e){
            txtTela.setText(e.getMessage());
        }
        op=0;
        zerarTela = true;
        virgula = false;
    }

    public void ultimoResul(){
        if(calculo.getTotal() % 1 != 0){
            txtTela.setText(Double.toString(calculo.getTotal()));
        }else{
            txtTela.setText(Integer.toString((int)calculo.getTotal()));
        }
        if(calculo.getTotal()==0){
            zerarTela =  true;
        }
    }
    public void limpar(){
        valor = "";
        virgula = false;
        zerarTela = false;
        txtTela.setText("");
        if(c == true){
            calculo.setNumero1(0);
            calculo.setNumero2(0);
            calculo.setTotal(0);
            c = false;
            op = 0;
        }
    }

    public void elevado(){
        calculo.setTotal(calculo.elevadoA2(Double.parseDouble(txtTela.getText())));
        if(calculo.getTotal() % 1 != 0){
            txtTela.setText(Double.toString(calculo.getTotal()));
        }else{
            txtTela.setText(Integer.toString((int)calculo.getTotal()));
        }
        zerarTela = true;
    }
}
