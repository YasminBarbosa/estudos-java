import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //PENDENTE CRIAÇÃO NA MAIN E TESTE
    }
}

/**
 * Exercício 2: Cadastro de produto com validação
 *
 * Objetivo: usar setters para garantir que o objeto nunca fique em estado inválido.
 *
 * Crie a classe Produto com:
 *
 * Atributos privados: nome, preco, quantidadeEstoque e codigo.
 * Getters e setters para todos, com estas regras:
 * nome: mínimo de 3 caracteres.
 * preco: deve ser maior que zero.
 * quantidadeEstoque: não pode ser negativa.
 * codigo: só pode ser definido uma vez (no construtor), sem setter.
 * Um método getPrecoComDesconto(double percentual) que retorna o preço com desconto sem alterar o preço original.
 * Use o construtor chamando os próprios setters, para não duplicar a validação.
 *
 * Teste na main: tente criar produtos com dados inválidos e veja o que acontece (lance uma exceção como IllegalArgumentException).
 *
 * O que você pratica: validação em setters, atributo imutável, getter que calcula um valor derivado.
 */