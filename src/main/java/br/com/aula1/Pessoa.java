package br.com.aula1;

public class Pessoa {
    String nome;
    int idade;
    Animal animal;

    Pessoa(String nome, int idade, Animal animal) {
       this.nome = nome;
       this.idade = idade;
       this.animal = animal;
    }

    public Boolean podeVotar(int idadeLimite) {
        System.err.println("Idade minima exigida: " + idadeLimite);
        if(idade >= idadeLimite) {
            System.err.println("Idade permitida: " + idade);
            return true;
        }
        System.err.println("Idade não permitida: " + idade);
        return false;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Dilma");
//        animal.setNome("Dilma");

        Animal animal2 = new Animal("TRex");
//        animal2.setNome("TRex");

        Pessoa pessoa1 = new Pessoa("Ulisse", 30, animal2); // Instanciando um novo objeto da classe Pessoa
        Pessoa pessoa2 = new Pessoa("Guga", 19, animal);

        System.err.println("Pessoa 1: " + pessoa1.nome);
        Boolean podePessoa1 = pessoa1.podeVotar(20);
        System.err.println(podePessoa1);
        System.err.println(pessoa1.animal.nome);

        System.err.println("Pessoa 2: " + pessoa2.nome);
        Boolean podePessoa2 = pessoa2.podeVotar(20);
        System.err.println(podePessoa2);
        System.err.println(pessoa2.animal.nome);

    }
}
