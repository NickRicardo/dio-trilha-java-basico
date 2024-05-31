package apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectandoInternet();
        System.out.println("Enviando mensagem pelo apps.Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo apps.Telegram");
    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Mensagem salva no servidor próprio do apps.Telegram");
    }

}
