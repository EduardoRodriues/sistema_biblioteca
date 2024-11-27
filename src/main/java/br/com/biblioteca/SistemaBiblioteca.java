package br.com.biblioteca;

import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Biblioteca!");
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if ("ADMIN".equals(usuario) && "admin123".equals(senha)) {
            System.out.println("Login bem-sucedido!");

            int opcao;

            do {
                System.out.println("--- Menu Principal ---");
                System.out.println("1. ......");
                System.out.println("2. ......");
                System.out.println("3. ......");
                System.out.println("4. ......");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("...");
                        break;
                    case 2:
                        System.out.println("...");
                        break;
                    case 3:
                        System.out.println("...");
                        break;
                    case 4:
                        System.out.println("...");
                        break;
                    case 5:
                        System.out.println("...");
                        break;
                    default:
                        System.out.println("Opção inválida, Tente novamente!");
                }
            } while (opcao != 5);

        } else {
            System.out.println("Usuário ou senha incorretos.");
            System.out.println("Login falhou, Sistema encerrado.");
        }

        scanner.close();
    }
}
