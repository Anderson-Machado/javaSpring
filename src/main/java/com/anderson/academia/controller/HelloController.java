package com.anderson.academia.controller;
import java.util.ArrayList;
import com.anderson.academia.model.Aluno;
import com.anderson.academia.model.Endereco;
import com.anderson.academia.model.EnderecoCompleto;
import com.anderson.academia.model.SemanaEnum;
import com.anderson.academia.model.ViaCep;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    /**
     *
     */


    @GetMapping(value = "/aluno")
    @ResponseStatus(code = HttpStatus.OK)

    public Aluno getMethodNAme() {

        var endereco1 = new Endereco();
        endereco1.setRua("Celso queiroz, 304");
        endereco1.setBairro("Barro Vermlehor");
        endereco1.setCidade("Niterói");

        var endereco2 = new Endereco();
        endereco2.setRua("Celso queiroz, 304");
        endereco2.setBairro("Barro Vermlehor");
        endereco2.setCidade("Niterói");

        var listEndereco = new ArrayList<Endereco>();
        listEndereco.add(endereco1);
        listEndereco.add(endereco2);

        var aluno = new Aluno("Anderson Machado", "08807123762", "machado.analista@gmail.com", "21-27184069",
                "Sistema da Informação", listEndereco);

        return aluno;
    }

    @GetMapping(value = "/")
    public String getNAme() {
        return "aluno bom é outra coisa";
    }

    // **Exemplo de consulta externa usando path params */

    @RequestMapping(value = "/cep/{cep}", method = RequestMethod.GET)
    public EnderecoCompleto getCep(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        var url = "https://viacep.com.br/ws/" + cep + "/json/";
        var response = restTemplate.getForObject(url, ViaCep.class);
        
        //**Mapenando o objeto que vem do via cep para outro formato de BODY*/
        var endereco = new EnderecoCompleto();
        endereco.GenerateEnderecoCompleto(response);

        return endereco;
    }

    // **Usando exemplo de consulta com querystring */
    @GetMapping(value = "/cepp")
    public String getCep2(@RequestParam String cep) {
        RestTemplate restTemplate = new RestTemplate();
        var url = "https://viacep.com.br/ws/" + cep + "/json/";
        var response = restTemplate.getForEntity(url, String.class);
        return response.getBody();
    }

    @GetMapping(value = "/semana")
    public String getDiaSemana() {
    
        SemanaEnum semana = SemanaEnum.DOMINGO;
       
        return semana.name();
    }

}
