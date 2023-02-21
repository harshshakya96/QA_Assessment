package com.ecommerce.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\ecommerce\\config\\config.properties");

		Properties p = new Properties();
		p.load(fr);


	}

}
