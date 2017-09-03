package uniquindio.lenguaje.aerolinea.mundo;

public interface IAerolinea extends IGeneral{

public void AgregarUsuario(Pasajero mip)throws UsuarioRepetidoException;

public void ModificarUsuario(Pasajero miP)throws UsuarioInexistenteException;
}



	

