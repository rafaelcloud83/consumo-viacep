package edu.rafael.consumoviacep.client;

import edu.rafael.consumoviacep.dto.ViaCepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ViaCepClient", url = "https://viacep.com.br/ws")
//https://viacep.com.br/ws/01001000/json/
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    ViaCepResponse buscaCep(@PathVariable("cep") String cep);
}
