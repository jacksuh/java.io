import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw =  new BufferedWriter(osw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assdß");

        bw.close();
    }
}
