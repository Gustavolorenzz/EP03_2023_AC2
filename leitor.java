import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
  *programa:  'inicio:' ... 'fim.' 
  *intrução: ';'
  *identificador: 'X' , 'Y' , 'W'
  *operador: 'n' 'e' 'o' 'x' 'copia'
*/
public class leitor{
        /*
        *variaveis globais pois somente um metodo que modifica seus valores
        */
        static String valorX= "";
        static String valorY= "";
        static Path path = Paths.get("../AC2/testeula.hex");//seleciona o local que sera escrito
        public static void main(String[] args){
            initializeFile();
            
            try{
            File lt = new File("../AC2/testeula.ula");//seleciona o local que sera lido
            Scanner sc = new Scanner(lt);
            String comando = sc.nextLine();
            if(comando.length() == 7 && comando.equals("inicio:")){//programa:  'inicio:' ... 'fim.' 
                do{
                    comando=sc.nextLine();
                    if(comando.charAt(0) == 'X' || comando.charAt(0) == 'Y'){
                        leitura(comando);
                    }else if(comando.charAt(0) == 'W'){
                        escrita(comando);
                    }
                }while(!(comando.length() == 4 && comando.equals("fim.")));
            }
            }catch(FileNotFoundException e){
                System.out.println("ERRO-nao encontrado");
            }
        } 
        /*
        *metodo que gera as saidas do programa
        *
        *nele nao ocorre nenhuma atribuicao de valor(X,Y,W), somente escrita em arquivo
        */
        public static void  escrita(String comando){
            String convert="";
            String result="";
            byte[] result_arq;
            int length = comando.length();
            for(int i = 2; i<=length-2;i++){
                convert = convert + comando.charAt(i);
            }
            try{
                RandomAccessFile arq = new RandomAccessFile("testeula.hex", "rw"); // Cria o arquivo
                arq.seek(arq.length());
                switch(convert){
                    case "An"://0
                        System.out.println(valorX + "" + valorY +"" + '0');//print para teste
                        result = valorX + "" + valorY +"" + '0';//gera a string com os valores que seram enviados para o arquivo
                        result_arq=result.getBytes();//converte a string em um vetor de bytes
                        arq.write(result_arq);//escrever no arquivo
                        arq.writeBytes("\n");//pular uma linha no arquivo
                        break;
                    case "Bn"://1
                        System.out.println(valorX + "" + valorY +"" + '1');
                        result = valorX + "" + valorY +"" + '1';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "umL"://2
                        System.out.println(valorX + "" + valorY +"" + '2');
                        result = valorX + "" + valorY +"" + '2';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "zeroL"://3
                        System.out.println(valorX + "" + valorY +"" + '3');
                        result = valorX + "" + valorY +"" + '3';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "nAeB"://4
                        System.out.println(valorX + "" + valorY +"" + '4');
                        result = valorX + "" + valorY +"" + '4';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "nAoB"://5
                        System.out.println(valorX + "" + valorY +"" + '5');
                        result = valorX + "" + valorY +"" + '5';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "AxB"://6
                        System.out.println(valorX + "" + valorY +"" + '6');
                        result = valorX + "" + valorY +"" + '6';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "AeBn"://7
                        System.out.println(valorX + "" + valorY +"" + '7');
                        result = valorX + "" + valorY +"" + '7';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "AnoB"://8
                        System.out.println(valorX + "" + valorY +"" + '8');
                        result = valorX + "" + valorY +"" + '8';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "nAxB"://9
                        System.out.println(valorX + "" + valorY +"" + '9');
                        result = valorX + "" + valorY +"" + '9';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "AoB"://A
                        System.out.println(valorX + "" + valorY +"" + 'A');
                        result = valorX + "" + valorY +"" + 'A';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "AeB"://B
                        System.out.println(valorX + "" + valorY +"" + 'B');
                        result = valorX + "" + valorY +"" + 'B';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "AneB"://C
                        System.out.println(valorX + "" + valorY +"" + 'C');
                        result = valorX + "" + valorY +"" + 'C';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "AoBn"://D
                        System.out.println(valorX + "" + valorY +"" + 'D');
                        result = valorX + "" + valorY +"" + 'D';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "copiaB"://E
                        System.out.println(valorX + "" + valorY +"" + 'E');
                        result = valorX + "" + valorY +"" + 'E';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    case "copiaA"://F
                        System.out.println(valorX + "" + valorY +"" + 'F');
                        result = valorX + "" + valorY +"" + 'F';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        arq.writeBytes("\n");
                        break;
                    default:
                    System.out.println("ERRO.");
                    break;
                }
                arq.close();
            }catch(IOException e){
                System.out.println("ERRO-nao aberto");
            }
        }
        /*
        *metodo para atribuir os valores recebidos
        *
        *tambem mantem a formatacao com todas as letras maiusculas
        *
        *OBS: nao gera nenhuma saida, somente efetua a troca de valores
        */
        public static void leitura(String comando){
            String convert="";
            String a="";
            int num=-1;
            int length = comando.length();
            for(int i = 2; i<=length-2; i++){//X=1; comando0 + =1 + valor2/3 + ;3/4           X   =    1    ;
                    convert = convert + comando.charAt(i);
            }
            
            if(comando.charAt(0)=='X'){
                num = Integer.parseInt(convert);
                valorX = Integer.toHexString(num);
                if(valorX.charAt(0)>='a' && valorX.charAt(0)<='f'){
                    valorX = valorX.toUpperCase();
                }

            }else{
                num = Integer.parseInt(convert);
                valorY = Integer.toHexString(num);
                if(valorY.charAt(0)>='a' && valorY.charAt(0)<='f'){
                    valorY = valorY.toUpperCase();
                }
            }
        }
        /*
        *testa no inicio do programa se o arquivo testeula.hex
        *ja existe. se existir, exclui lo
        */
        public boolean alreadyExists() {
            try {
                return path.toFile().exists();
                } catch (Exception e) {
                return false;
                }
            }

        static public void initializeFile() {
            if (path.toFile().exists()) {
                path.toFile().delete();
            }
        }
}