import java.util.Scanner;

public class Questao2 {

	static Scanner sc = new Scanner(System.in);
	  static String digitos = "0123456789";
	  static String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	  static String alfabetoMaiusculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	  static String especial = "!@#$%^&*()-+";

	  public static boolean digitos(String s){
	    
	    for(int i = 0; i<s.length(); i++){
	      for(int j = 0; j<digitos.length(); j++){
	        if((s.charAt(i)) == (digitos.charAt(j))){
	          return true;
	        }
	      }
	    }
	    return false;
	  }

	  public static boolean minusculo(String s){
	    for(int i = 0; i<s.length(); i++){
	      for(int j = 0; j<alfabeto.length(); j++){
	        if((s.charAt(i)) == (alfabeto.charAt(j))){
	          return true;
	        }
	      }
	    }
	    return false;
	  }  

	 public static boolean maiusculo(String s){   
	    for(int i = 0; i<s.length(); i++){
	      for(int j = 0; j<alfabeto.length(); j++){
	        if((s.charAt(i)) == (alfabetoMaiusculo.charAt(j))){
	          return true;
	        }
	      }
	    }
	    return false;
	  }

	  public static boolean caracterEspecial(String s){
	    for(int i = 0; i<s.length(); i++){
	      for(int j = 0; j<especial.length(); j++){
	        if((s.charAt(i)) == (especial.charAt(j))){
	          return true;
	        }
	      }
	    }
	    return false;
	  }

	  public static int senhaSegura(String s){
	    int falta = 0;
	    boolean digito = digitos(s), minusculo = minusculo(s), maiusculo = maiusculo(s), caracterEspecial = caracterEspecial(s);

	    if((s.length()) < 6){
	      falta = 6 - (s.length());
	    }else{ 
	      if(!digito){
	        falta = falta + 1;
	        System.out.println("A senha precisa conter no mínimo 1 digito.");
	      }
	      if(!minusculo){
	        falta = falta + 1;
	        System.out.println("A senha precisa conter no mínimo 1 letra em minúsculo.");
	      }
	      if(!maiusculo){
	        falta = falta + 1;
	        System.out.println("A senha precisa conter no mínimo 1 letra em maiúsculo.");
	      }
	      if(!caracterEspecial){
	        falta = falta + 1;
	        System.out.println("A senha precisa conter  no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
	      }
	    }
	    return falta;
	  }

	  public static void main(String[] args) {
	    System.out.print("Digite senha :");
	    String senha = sc.nextLine();
	    
	    System.out.println("Para uma senha segura, você deve incluir mais " + senhaSegura (senha) + " caracter (es)!"); 
	    
	  }
		}
	


	
