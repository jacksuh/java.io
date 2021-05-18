import java.io.*;

public class TesteEscritaFileWrite {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        //FileOutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw =  new BufferedWriter(osw);

        FileWriter fw = new FileWriter("lorem4.txt");

        //linheSeparator "Fazer nova linha"
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("asfasdfsafdas dfs sdf asf assdß");

        fw.close();
    }
}
