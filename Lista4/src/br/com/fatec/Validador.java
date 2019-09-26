package br.com.fatec;

public class Validador {
	private static String formataCpf(String cpf) 
	{
		
		
		cpf=cpf.substring(0,3)+"."+cpf.substring(3,6)+"."+cpf.substring(6,9)+"-"+cpf.substring(9,11);

		return cpf;
	}
	
	//metodo responsavel por verificar se o cpf e valido
	public static boolean validaCpf(String cpf)
	{	boolean verifica=true;
		cpf = formataCpf(cpf);
		while(true)
		{
			
			try
			{
				//verifica se o cpf e invalido(formado por numeros repetitivos ou fora do tamanho)
				if(cpf.equals("00000000000")||cpf.equals("11111111111")||cpf.equals("22222222222")||cpf.equals("33333333333")||cpf.equals("44444444444")||cpf.equals("55555555555")||cpf.equals("66666666666")||cpf.equals("77777777777")||cpf.equals("88888888888")||cpf.equals("99999999999")||cpf.length()!=14)
				{
					System.out.println("CPF invalido");
				}
				else
				{
					char dig10, dig11;
					int soma=0,i,resto,peso=10, num;
					
					//calcula do primeiro digito verificador
					for(i=0;i<13;i++)
					{				
						//verifica se o próximo caracter e um . ou - para pula-lo
						if((String.valueOf(cpf.charAt(i+1)).equals(".")||(String.valueOf(cpf.charAt(i+1)).equals("-"))))
						{
							num=(int)(cpf.charAt(i)-48);
							soma=soma+(num*peso);
							peso-=1;
					
							i+=1;	
						}
						else
						{
							num=(int)(cpf.charAt(i)-48);
							soma=soma+(num*peso);
							peso-=1;
						}
					}
					
					//calcula o resto da soma
					resto=11-(soma%11);
					if(resto==10 ||resto==11)
					{
						dig10='0';
					}
					else
					{
						dig10=(char)(resto+48);
					}
					
					soma=0;
					peso=11;
					
					
					//calcula o segundo digito verificador
					for(i=0;i<13;i++)
					{
						//soma os valores do cpf para gerar o verificador
						
						//verifica se o próximo caracter e um . ou - para pula-lo
						if((String.valueOf(cpf.charAt(i+1)).equals(".")||(String.valueOf(cpf.charAt(i+1)).equals("-"))))
						{
							num=(int)(cpf.charAt(i)-48);
							soma=soma+(num*peso);
							peso-=1;//
							i+=1;
						}
						else 
						{
							num = (int) (cpf.charAt(i) - 48);
							soma = soma + (num * peso);
							peso -= 1;
						}
					}
					
					//calcula o resto da soma
					resto=11-(soma%11);
					
					//se o resto for 10 ou 11 o verificar sera 0 se nao sera o numero que o calculo gerou
					if(resto==10 ||resto==11)
					{
						dig11='0';
					}
					else
					{
						dig11=(char)(resto+48);
					}
					//verifica se o verificador comparado e igual ao digitado
					if(dig10==cpf.charAt(12)&&dig11==cpf.charAt(13))
					{
						break;
					}
					else
					{	
						verifica=false;
//						System.out.println("O cpf digitado nao tem os verificadores corretos");
						break;
					}
				
				}
				
			}
			catch(NullPointerException erro)
			{
				System.out.println("O sistema sera desligado");
				System.exit(0);
			}
			catch(NumberFormatException erro)
			{
				System.out.println("Digite apenas números");
			}
		
		}
		
		
		return verifica;
	}
}
