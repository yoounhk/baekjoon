package archive.P16170;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Main {
	public static void main(String args[]) {
		ZonedDateTime now = ZonedDateTime.now();
		ZonedDateTime utc = now.withZoneSameInstant(ZoneOffset.UTC);
		String str = utc.toString();
		System.out.println(str.substring(0, 4));
		System.out.println(str.substring(5, 7));
		System.out.println(str.substring(8, 10));
	}
}
