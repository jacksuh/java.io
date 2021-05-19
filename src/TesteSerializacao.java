import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Cliente cliente = new Cliente();
        //cliente.setNome("Jackson");
        //cliente.setProfissao("Dev");
        //cliente.setCpf("23413131");

//            String nome = "Nico Steppat";
//            ObjectOutputStream oos = new ObjectOutputStream("cliente.bin"));
//            oos.writeObject(nome);
//            oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getCpf());

    }
}
