package st.streaming;

public class SessaoStreaming {

    //Recebe um objeto de qualquer classe Player
    public SessaoStreaming(IPlayer player){
        player.reproduzir();
        player.pausar();
        player.parar();

        //trate player como uma instancia de Download
        if(player instanceof IDownload){
            ((IDownload) player).download();
        }

    }

}
