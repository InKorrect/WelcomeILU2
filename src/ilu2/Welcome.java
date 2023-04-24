package ilu2;

public class Welcome {


	public static String welcome(String input) {
		String reponse = null;
		String reponse3= null;
//		String[] part;
		if(" ".equals(input)||input==null||"".equals(input)){
			 StringBuilder str2 = new StringBuilder("Hello, my friend");
			 reponse=str2.toString();
			 return reponse;
		}
	//	part=input.split(",");
//		if(!part[0].equals(input)) {
//			StringBuilder str4 = new StringBuilder("Hello");
//			for(int i=0;i<part.length;i++) {
//			
//			String part1=part[i].substring(0, 1).toUpperCase() + input.substring(1);
//			str4.append(", ");
//			str4.append(part1);
//			}
//			reponse=str4.toString();
//		}
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
