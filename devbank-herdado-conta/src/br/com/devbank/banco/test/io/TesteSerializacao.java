package br.com.devbank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.devbank.banco.modelo.Cliente;
import br.com.devbank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("Nico Steppat");
		cliente.setProfissao("Dev");
		cliente.setCpf("1233564");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
