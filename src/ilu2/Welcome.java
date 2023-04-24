package ilu2;

public class Welcome {


	public static String welcome(String input) {
		String reponse = null;
		String reponse3= null;
		String[] part;
		String part1;
		if(" ".equals(input)||input==null||"".equals(input)){
			 StringBuilder str2 = new StringBuilder("Hello, my friend");
			 reponse=str2.toString();
			 return reponse;
		}
		part=input.split(",");
		int [] nomMaj=new int [part.length];
		if(!part[0].equals(input)) {
			int o=0;
			StringBuilder str4 = new StringBuilder("Hello");
			for(int i=0;i<part.length;i++) {
			if(!part[i].equals(part[i].toUpperCase())) {
				part1=part[i].substring(0, 1).toUpperCase() + part[i].substring(1);
				str4.append(", ");
				str4.append(part1);
			}
			else if(part[i].equals(part[i].toUpperCase())){
				nomMaj[o]=i;
				o++;
			}
			}
			reponse=str4.toString();
			if(nomMaj[0]!=0) {
				String reponse2;
				StringBuilder str6 = new StringBuilder(". AND HELLO, ");
				part1=part[nomMaj[0]];
				str6.append(part1);
				str6.append(" !"); 
				reponse2=str6.toString();
				reponse=reponse+reponse2.toUpperCase()
;			}
			
		}
		else{
			if(!input.equals(input.toUpperCase())){
				reponse = input.substring(0, 1).toUpperCase() + input.substring(1);
				StringBuilder str = new StringBuilder("Hello, ");
				str.append(reponse);
				reponse= str.toString();
			}
			if(input.equals(input.toUpperCase())) {
				reponse = input.substring(0, 1).toUpperCase() + input.substring(1);
				StringBuilder str3 = new StringBuilder("Hello, ");
				str3.append(reponse);
				str3.append(" !");
				reponse3= str3.toString();
				reponse=reponse3.toUpperCase();
			}
			
		} 
		return reponse;
	}
}