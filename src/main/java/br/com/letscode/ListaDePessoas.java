package br.com.letscode;

import java.util.Arrays;
import java.util.Objects;

public class ListaDePessoas implements EstruturaDados {

    private Pessoa[] pessoas = new Pessoa[3];
    private int index = 0;
    @Override
    public void adicionar(Pessoa pessoa) {
        if(index <= this.pessoas.length){
            Pessoa[] aux = Arrays.copyOf(pessoas, pessoas.length);
            this.pessoas = new Pessoa[(pessoas.length + (pessoas.length / 2))];
            System.arraycopy(aux, 0, this.pessoas, 0, this.index);
        }
        this.pessoas[this.index] = pessoa;
        this.index++;
    }

    @Override
    public Pessoa buscar(String nome) {
        for (int i = 0; i < this.index; i++) {
            if (Objects.equals(this.pessoas[i].getNome(), nome)) return this.pessoas[i];
        }
        throw new  RuntimeException( nome + "não encontrado");
    }

    @Override
    public void remover(Pessoa pessoa) {
        for (int i = 0; i < this.index; i++) {
            if (Objects.equals(this.pessoas[i].getNome(), pessoa.getNome())){
                System.arraycopy(this.pessoas, i + 1, this.pessoas, i, this.index - (i + 1));
                index--;
            }
        }
    }

    @Override
    public void remover(int index) {
        if(index <= this.index){
            System.arraycopy(this.pessoas, index + 1, this.pessoas, index, this.index - (index + 1));
            this.index --;
        }
    }

    @Override
    public void listarTodos() {
        for (int i = 0; i < this.index; i++) {
            System.out.println(this.pessoas[i].getNome());
        }
        System.out.println("----------------");
    }

    @Override
    public Pessoa getPessoa(int index) {
            if (this.pessoas[index] != null){
                return this.pessoas[index];
            }
        throw new RuntimeException("não encontrado");
    }
}
