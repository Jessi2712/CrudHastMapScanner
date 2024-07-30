import java.util.HashMap;

public class Implementacion implements Metodos{
	
	//Declarar el hashMap
	HashMap<String, Ropa> hashMapReg = new HashMap<String, Ropa>();

	@Override
	public void guardar(Ropa ropa) {
		// TODO Auto-generated method stub
		hashMapReg.put(ropa.getMarca(), ropa);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hashMapReg);
	}

	@Override
	public Ropa buscar(Ropa ropa) {
		// TODO Auto-generated method stub
		Ropa ropaEn=hashMapReg.get(ropa.getMarca());
		return ropaEn;
	}

	@Override
	public void editar(Ropa ropa) {
		// TODO Auto-generated method stub
		hashMapReg.put(ropa.getMarca(), ropa);
	}

	@Override
	public void eliminar(String ropa) {
		// TODO Auto-generated method stub
		hashMapReg.remove(ropa);
	}
	
}
