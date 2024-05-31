package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Mensagem salva no servidor próprio do Facebook");

    }

}