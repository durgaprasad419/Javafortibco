package tutorial1;

public class Stringformat {

	public static void main(String[] args) {
		
		String info = "";
		info += "My name is Prasad";
		info += "  ";
		info += "I am a software engineer";
		System.out.println(info);
		
		StringBuilder sb =  new StringBuilder();
		
		sb.append("My name is Prameela");
		sb.append(" ");
		sb.append("I am a cloud architect");
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Aashritha")
		.append("  ")
		.append("I am a Doctor");
		System.out.println(s.toString());
		
		StringBuilder su = new StringBuilder();
		
		su.append("My name is Lathik")
		.append("  ")
        .append("I am a Mechanical Engineer");	
		System.out.println(su.toString());

	}

}
