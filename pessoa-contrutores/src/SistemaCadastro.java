public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("06724506716","MARCOS SILVA");


        System.out.println(marcos.getNome() + " CPF: " + marcos.getCpf());
    }
}