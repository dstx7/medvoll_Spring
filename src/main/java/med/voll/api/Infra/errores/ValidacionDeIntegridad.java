package med.voll.api.Infra.errores;

public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String idPacienteNoEncontrado) {
        super(idPacienteNoEncontrado);
    }
}
