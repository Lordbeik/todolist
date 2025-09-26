package br.com.carlos.todolist.user;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* 
 * modificadores
 * public - acessivel a todos 
 * private - acessivel apenas na propria classe
 * protected - acessivel na propria classe e nas classes filhas
 */
@RestController
@RequestMapping("/users")
public class UserController {
        /**
         * String  (texto)
         * Integer (int) numeros inteiros
         *double numeros com casas decimais 0.000
         *float numeros com casas decimais 0.000 mais digitos
         *char (A C) 
         *Date (data)
         *void (sem retorno) pra executar alguma logica no metodo.
         */

         /**
          * body
          */
    @PostMapping("/")
    public void create( @RequestBody UserModel userModel){
        //logica de negocio
            System.out.println(userModel.name);
    }
}
