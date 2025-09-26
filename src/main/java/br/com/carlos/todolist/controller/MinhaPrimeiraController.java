package br.com.carlos.todolist.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
@RequestMapping("/primeiraRota")
// http://localhost:8080/primeiraRota
public class MinhaPrimeiraController {

        /**
         * Método de acesso de requisição HTTP
         * Anotações:
         * GET - Busca um informação/Dado
         * POST - Adiciona uma informação/Dado
         * PUT - Altera uma informação/Dado
         * DELETE -  Remove uma informação/Dado
         * PATCH - Alterar somente uma parte de uma informação/Dado
         */

         //Método (funcionalidade) de uma classe
         @GetMapping("/primeiroMetodo")
        public String primeiraMensagem()   {   
            return "Funcionou!";

        }
}
