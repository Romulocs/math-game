/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.romulo.jogodematematica.controle;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author romulo
 */
/**
 * Captura os numeros desejados para jogar cada numero é armazenado para que
 * seja feita a tabuada de SOMA então será mostrada na tela do jogo a expressão
 * aleatoria
 *
 * se todos as numeros estao selecionadas usar todos os numeros da tabuada com a
 * respectiva operação matemática.
 */
public class FabricaDeTabuada {

    private static ArrayList<Integer> numeroTabuada = new ArrayList<>();
    private ArrayList<Integer> valorSorteadoSoma = new ArrayList<>();
    private ArrayList<Integer> tabuadaDeSoma;
    private ArrayList<String> operacoesMatematicas;
    private static int n1, n2;
    private static int resultadoSoma = 0;
    private static int resultadoSubtracao = 0;
    private static int resultadoMultiplicacao = 0;
    private static int resultadoDivisao = 0;
    private static String op;

    public int getResultadoSoma() {
        return resultadoSoma;
    }

    public void setResultadoSoma(int resultadoSoma) {
        this.resultadoSoma = resultadoSoma;
    }

    public int getResultadoSubtracao() {
        return resultadoSubtracao;
    }

    public void setResultadoSubtracao(int resultadoSubtracao) {
        this.resultadoSubtracao = resultadoSubtracao;
    }

    public int getResultadoMultiplicacao() {
        return resultadoMultiplicacao;
    }

    public void setResultadoMultiplicacao(int resultadoMultiplicacao) {
        this.resultadoMultiplicacao = resultadoMultiplicacao;
    }

    public int getResultadoDivisao() {
        return resultadoDivisao;
    }

    public void setResultadoDivisao(int resultadoDivisao) {
        this.resultadoDivisao = resultadoDivisao;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    /**
     * Captura os valores selecionados para usar no jogo.
     *
     * @param array traz os valores qu foram passados em ConfiguraçãoDoJogo.
     *
     */
    public void setNumerosDeTabuadas(ArrayList<Integer> array) {

        numeroTabuada = array;
        //mostra para teste
        for (int i : numeroTabuada) {
            System.out.println("Valores capturados pela fabrica: " + i + "Pos." + numeroTabuada.indexOf(i));
        }
    }

    /**
     * Captura todas as operações selecionadas para usar no jogo.
     *
     * @param operacoes traz os valores que foram passados em
     * ConfiguraçãoDoJogo.
     *
     */
    public void setOperacoes(ArrayList<String> operacoes) {
        operacoesMatematicas = new ArrayList<>();
        operacoesMatematicas = operacoes;

        for (String op : operacoesMatematicas) {
            System.out.println("Operações capturadas pela fabrica: " + op);
        }

    }

    
    
    public void gerarTabuadasSoma(ArrayList<JButton> botoes) {
        
        resultadoSoma = 0;
        int n2 = (int) (Math.random() * 11);
        int n1 = (int) (Math.random() * numeroTabuada.size());
        
        setN1((int) numeroTabuada.get(n1));
        setN2(n2);
        setOp("+");

        if (valorSorteadoSoma.contains(resultadoSoma) == false) {

            resultadoSoma = (int) numeroTabuada.get(n1) + n2;
            setResultadoSoma(resultadoSoma);
            
            //Mostra na tela os valores.
            selecionarBotaocorreto(resultadoSoma, botoes);
            mostrarOpcoesErradas(botoes, resultadoSoma);
            
            valorSorteadoSoma.add(resultadoSoma);
            
            System.out.println(numeroTabuada.get(n1) + "+" + n2 + "=" + resultadoSoma);
            
            
        } else {
            gerarTabuadasSoma(botoes);
        }
    }
    
    public void gerarTabuadasSubtracao(ArrayList<JButton> botoes) {
        
        resultadoSubtracao = 0;
        int n2 = (int) (Math.random() * 11);
        int n1 = (int) (Math.random() * numeroTabuada.size());
        
        setN1((int) numeroTabuada.get(n1));
        setN2(n2);
        setOp("-");

        if (valorSorteadoSoma.contains(resultadoSubtracao) == false) {

            resultadoSubtracao = (int) numeroTabuada.get(n1) - n2;
            setResultadoSubtracao(resultadoSubtracao);
            
            //Mostra na tela os valores.
            selecionarBotaocorreto(resultadoSubtracao, botoes);
            mostrarOpcoesErradas(botoes, resultadoSubtracao);
            
            valorSorteadoSoma.add(resultadoSubtracao);
            
            System.out.println(numeroTabuada.get(n1) + "+" + n2 + "=" + resultadoSubtracao);
            
            
        } else {
            gerarTabuadasSubtracao(botoes);
        }
    }

    // escreve as respostas erradas em três botões.
    /**
     * os valores aleatorios nao podem ser igual ao resultado correto os
     * resultado errados nao podem se repetir.
     *
     */
    public void mostrarOpcoesErradas(ArrayList<JButton> botao, int resultado) {
        int numAleatorio = (int) (Math.random() * 20);
        int anterior=30;
        
        for (int j = 0; j < 4; j++) {
            
            //se botao x nao for = resultado
            
            for (int i = 0; i < 4; i++) {  
                numAleatorio = (int) (Math.random() * 20);
                if (!botao.get(j).getText().equals(String.valueOf(resultado)) 
                        && !botao.get(j).getText().equals(botao.get(i).getText())) {

                    botao.get(j).setText(String.valueOf(numAleatorio));
                    anterior = numAleatorio;

                    System.out.println("Val BT:" + botao.get(j).getText());////

                }
            }
        }
    }

    public void selecionarBotaocorreto(int resposta, ArrayList<JButton> button) {
        // seleciona um botao aleatorio com a opção correta;

        int btAleatorio = (int) (Math.random() * 4);
        button.get(btAleatorio).setText(String.valueOf(resposta));
    }
    
    public void limpaBotoes(ArrayList<JButton> botoes, int qtdBotoes){
        for (int i = 0; i < qtdBotoes; i++) {
            botoes.get(i).setText("");
        }
    }

}


//--------- exemplo
// if (jRNao.isSelected() == true) 
//        {
//            while (sorteado.size() <= maximo) 
//            {
//                if (sorteado.contains(numeroSorteado) == false) 
//                {
//                    jTANumeroSorteado.setText(jTANumeroSorteado.getText() + numeroSorteado + " ,");
//                    sorteado.add(numeroSorteado);
//                    return numeroSorteado;
//                } 
//                else 
//                {
//                    numeroSorteado = String.valueOf((int) (Math.random() * maximo + 1));
//                }
//            }
//        }
