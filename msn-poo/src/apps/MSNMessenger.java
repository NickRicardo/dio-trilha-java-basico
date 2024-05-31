package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Mensagem salva no servidor próprio do MSN");
    }

}