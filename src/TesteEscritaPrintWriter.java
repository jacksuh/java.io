import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
        //FileOutputStream fos = new FileOutputStream("lorem2.txt");
        //Writer osw = new OutputStreamWriter(fos);
        //BufferedWriter bw =  new BufferedWriter(osw);
        //FileWriter fw = new FileWriter("lorem4.txt");
        //caso foi utilizar o Buffered podemos voltar a utilizar o bw.newline.
        //BufferedWriter bw = new BufferedWriter(fw);

        //PrintStream ps = new PrintStream(new File("lorem2.txt"));

        //linheSeparator "Fazer nova linha"

        PrintWriter ps = new PrintWriter("lorem5.txt", "UTF-8");

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();

        ps.println("asfasdfsafdas dfs sdf asf assdß");

        ps.close();

    }
}
