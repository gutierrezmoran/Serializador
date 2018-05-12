package modelo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Esta es una clase que hereda de ObjectOutputStream cuyo objetivo es
 * sobreescribir el método writerStreamHeader() para evitar que escriba una
 * nueva cabecera en un archivo que ya almacena una y de esta manera poder
 * leerlo sin ningun tipo de conflictos en futuras ejecuciones del programa.
 * Para ello, el método writerStreamHeader() no debe hacer nada.
 */

public class BlockHeaderObjectOutputStream extends ObjectOutputStream {

	public BlockHeaderObjectOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
	}
}
