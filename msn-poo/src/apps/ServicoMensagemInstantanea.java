package apps;

//a classe apps.MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
   public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistoricoMensagem();

    protected void validarConectandoInternet(){
        System.out.println("Validando se está conectado a internet.");
    }
}