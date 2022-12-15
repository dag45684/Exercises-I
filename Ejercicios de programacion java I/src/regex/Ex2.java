package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
	String data = "James,Butt,\"Benton, John B Jr\",6649 N Blue Gum St,New Orleans,Orleans,LA,70116,504-621-8927,504-845-1427,jbutt@gmail.com\r\n"
			+ "Josephine,Darakjy,\"Chanay, Jeffrey A Esq\",4 B Blue Ridge Blvd,Brighton,Livingston,MI,48116,810-292-9388,810-374-9840,josephine_darakjy@darakjy.org\r\n"
			+ "Art,Venere,\"Chemel, James L Cpa\",8 W Cerritos Ave #54,Bridgeport,Gloucester,NJ,8014,856-636-8749,856-264-4130,art@venere.org\r\n"
			+ "Lenna,Paprocki,Feltz Printing Service,639 Main St,Anchorage,Anchorage,AK,99501,907-385-4412,907-921-2010,lpaprocki@hotmail.com\r\n"
			+ "Donette,Foller,Printing Dimensions,34 Center St,Hamilton,Butler,OH,45011,513-570-1893,513-549-4561,donette.foller@cox.net\r\n"
			+ "Simona,Morasca,\"Chapman, Ross E Esq\",3 Mcauley Dr,Ashland,Ashland,OH,44805,419-503-2484,419-800-6759,simona@morasca.com\r\n"
			+ "Mitsue,Tollner,Morlong Associates,7 Eads St,Chicago,Cook,IL,60632,773-573-6914,773-924-8565,mitsue_tollner@yahoo.com\r\n"
			+ "Leota,Dilliard,Commercial Press,7 W Jackson Blvd,San Jose,Santa Clara,CA,95111,408-752-3500,408-813-1105,leota@hotmail.com\r\n"
			+ "Sage,Wieser,Truhlar And Truhlar Attys,5 Boston Ave #88,Sioux Falls,Minnehaha,SD,57105,605-414-2147,605-794-4895,sage_wieser@cox.net\r\n";
			
	Pattern rx = Pattern.compile("[a-zA-Z._]{5,25}@[a-zA-Z]{3,10}[.][a-zA-Z]{2,4}");
	Matcher m = rx.matcher(data);
	while (m.find()) {
		System.out.println("Full email: " + m.group());
		System.out.println("Username: " + m.group().substring(0, m.group().indexOf("@")));
		System.out.println();
	}

	}

}
