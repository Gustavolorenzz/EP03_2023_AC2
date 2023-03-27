import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
/*
inicio:
X=12;
Y=6;
W=AeB;
X=10;
Y=3;
W=AoB;
W=nAeB;
X=13;
W=Bn;
fim.

saida:
C6B
A3A
A34
D31
*/
/*
  *programa:  'inicio:' ... 'fim.' 
  *intrução: ';'
  *identificador: 'X' , 'Y' , 'W'
  *operador: 'n' 'e' 'o' 'x' 'copia'
*/
public class leitor{
        
        static String valorX= "";
        static String valorY= "";
        public static void main(String[] args){
            
            try{
            File lt = new File("../AC2/testeula.ula");
            Scanner sc = new Scanner(lt);
            String comando = sc.nextLine();
            if(comando.length() == 7 && comando.equals("inicio:")){
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
                        System.out.println(valorX + "" + valorY +"" + '0');
                        result = valorX + "" + valorY +"" + '0';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "Bn"://1
                        System.out.println(valorX + "" + valorY +"" + '1');
                        result = valorX + "" + valorY +"" + '1';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "umL"://2
                        System.out.println(valorX + "" + valorY +"" + '2');
                        result = valorX + "" + valorY +"" + '2';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "zeroL"://3
                        System.out.println(valorX + "" + valorY +"" + '3');
                        result = valorX + "" + valorY +"" + '3';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "nAeB"://4
                        System.out.println(valorX + "" + valorY +"" + '4');
                        result = valorX + "" + valorY +"" + '4';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "nAoB"://5
                        System.out.println(valorX + "" + valorY +"" + '5');
                        result = valorX + "" + valorY +"" + '5';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "AxB"://6
                        System.out.println(valorX + "" + valorY +"" + '6');
                        result = valorX + "" + valorY +"" + '6';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "AeBn"://7
                        System.out.println(valorX + "" + valorY +"" + '7');
                        result = valorX + "" + valorY +"" + '7';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "AnoB"://8
                        System.out.println(valorX + "" + valorY +"" + '8');
                        result = valorX + "" + valorY +"" + '8';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "nAxB"://9
                        System.out.println(valorX + "" + valorY +"" + '9');
                        result = valorX + "" + valorY +"" + '9';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "AoB"://A
                        System.out.println(valorX + "" + valorY +"" + 'A');
                        result = valorX + "" + valorY +"" + 'A';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "AeB"://B
                        System.out.println(valorX + "" + valorY +"" + 'B');
                        result = valorX + "" + valorY +"" + 'B';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "AneB"://C
                        System.out.println(valorX + "" + valorY +"" + 'C');
                        result = valorX + "" + valorY +"" + 'C';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "AoBn"://D
                        System.out.println(valorX + "" + valorY +"" + 'D');
                        result = valorX + "" + valorY +"" + 'D';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "copiaB"://E
                        System.out.println(valorX + "" + valorY +"" + 'E');
                        result = valorX + "" + valorY +"" + 'E';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
                        break;
                    case "copiaA"://F
                        System.out.println(valorX + "" + valorY +"" + 'F');
                        result = valorX + "" + valorY +"" + 'F';
                        result_arq=result.getBytes();
                        arq.write(result_arq);
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
        public static void leitura(String comando){
            String convert="";
            int num=-1;
            int length = comando.length();
            for(int i = 2; i<=length-2; i++){//X=1; comando0 + =1 + valor2/3 + ;3/4           X   =    1    ;
                convert = convert + comando.charAt(i);
            }
            if(comando.charAt(0)=='X'){
                num = Integer.parseInt(convert);
                valorX = Integer.toHexString(num);
            }else{
                num = Integer.parseInt(convert);
                valorY = Integer.toHexString(num);
            }
        }
}