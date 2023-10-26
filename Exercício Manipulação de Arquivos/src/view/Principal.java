package view;

import java.io.IOException;

//import controller.ArquivosController;
import controller.IArquivosController;
import controller.MyFileController;

public class Principal {

	public static void main(String[] args) {
//		IArquivosController arqController = new ArquivosController();
		IArquivosController myArqController = new MyFileController();
		String caminho = "C:\\Códigos\\Eclipse\\SO I\\";//\\generic_food.csv";
		String nome = "generic_food.csv";

		try {
//			arqController.readDir(caminho);
//			arqController.openFile(caminho, nome);
//			arqController.readFile(caminho, nome);
			myArqController.readFile(caminho, nome);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
