package st.streaming;

public class MobilePlayer implements IPlayer,IDownload{

    @Override
    public void reproduzir(){
        System.out.println("Reproduzindo via Mobile...");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando via Mobile...");
    }

    @Override
    public void parar(){
        System.out.println("Parando via Mobile...");
    }

    @Override
    public void download(){
        System.out.println("Baixando via Mobile...");
    }

}
