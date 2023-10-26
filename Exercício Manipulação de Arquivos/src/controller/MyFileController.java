package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFileController extends ArquivosController{

	public MyFileController() {
		super();
	}
	@Override
	public void readFile(String path, String name) throws IOException {
		
		File file = new File(path, name);

		if (file.exists() && file.isFile()) {
			FileInputStream fluxo = new FileInputStream(file);
			InputStreamReader fluxoString = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(fluxoString);
			String linha = buffer.readLine();

			while (linha != null) {
				String[] propriedadeAlimento = linha.split(",");
				
				if(propriedadeAlimento[2].equals("Fruits")) {
					System.out.println(propriedadeAlimento[0]+"\t\t"+propriedadeAlimento[1]+"\t\t"+propriedadeAlimento[3]);
				}
				
				linha = buffer.readLine();
			}
			buffer.close();
			fluxoString.close();
			fluxo.close();

		} else {
			throw new IOException("Arquivo Inválido");
		}
	}
	
}
