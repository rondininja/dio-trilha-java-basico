package apps;

//a classe apps.MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //somente os filhos conhecem este metodo

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }


    //herança
    //    public void enviarMensagem() {
//        //primeiro confirmar se está conectado a internet
//        validarConectadoInternet();
//        System.out.println("Enviando mensagem");
//        //depois de enviada, salva o histórico da mensagem
//        salvarHistoricoMensagem();
//    }
//
//    public void receberMensagem() {
//        System.out.println("Recebendo mensagem");
//    }
//
//    //métodos privados, visíveis somente na classe
//    private void validarConectadoInternet() {
//        System.out.println("Validando se está conectado a internet");
//    }
//
//    private void salvarHistoricoMensagem() {
//        System.out.println("Salvando o histórico da mensagem");
//    }

}
