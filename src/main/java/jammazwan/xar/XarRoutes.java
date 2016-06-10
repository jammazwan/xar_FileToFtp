package jammazwan.xar;

import org.apache.camel.builder.RouteBuilder;

public class XarRoutes extends RouteBuilder {

	/*
	 * You will need to adjust the uri of the ftp server to match your own
	 * 
	 * see NOTES.md
	 */
	@Override
	public void configure() throws Exception {
		from("direct:xar").to("ftp://192.168.99.100/?username=fred&password=frog");
	}
}
