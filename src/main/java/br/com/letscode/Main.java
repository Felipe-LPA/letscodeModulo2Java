package br.com.letscode;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        VETORES = SEQUENCIA DE DADOS/INFORMAÇÔES
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(16);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Jorge");
        pessoa2.setIdade(17);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Maria");
        pessoa3.setIdade(20);

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Jessica");
        pessoa4.setIdade(20);


        ListaDePessoas listaDePessoas = new ListaDePessoas();
        listaDePessoas.adicionar(pessoa1);
        listaDePessoas.adicionar(pessoa2);
        listaDePessoas.adicionar(pessoa3);
        listaDePessoas.adicionar(pessoa4);

        listaDePessoas.listarTodos();


//        System.out.println(listaDePessoas.buscar("Fernando"));
//        System.out.println(listaDePessoas.buscar("Jorge").getNome());

        listaDePessoas.remover(1);

        listaDePessoas.listarTodos();
    }

}
