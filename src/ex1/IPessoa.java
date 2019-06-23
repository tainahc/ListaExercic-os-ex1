/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Tainah e Leo
 */
public class IPessoa {
     public static void main(String[] args) {
    Aluno alunoVariavel = new Aluno();
    alunoVariavel.setNome("Jonathan");
    
    Pessoa pessoaVariavel = new Pessoa(); 
    pessoaVariavel.setNome("Tainah");
    
    Professor professorVariavel = new Professor(); 
    professorVariavel.setNome("Pazzinato");
    
         System.out.println("O professor eh: "+professorVariavel.getNome());
         System.out.println("O aluno eh: "+alunoVariavel.getNome());
         System.out.println("A pessoa eh: "+pessoaVariavel.getNome());
         
         
         //Exclusão
        // alunoVariavel.setNome("");
        // pessoaVariavel.setNome("");
        // professorVariavel.setNome("");
         
     }
}
