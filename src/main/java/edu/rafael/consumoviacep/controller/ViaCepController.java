package edu.rafael.consumoviacep.controller;

import edu.rafael.consumoviacep.dto.ViaCepRequest;
import edu.rafael.consumoviacep.dto.ViaCepResponse;
import edu.rafael.consumoviacep.service.ViaCepService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ViaCepController {

    private final ViaCepService viaCepService;

    public ViaCepController(ViaCepService viaCepService) {
        this.viaCepService = viaCepService;
    }

    @GetMapping()
    public String home(){
        return "Bem vindo a api de buscar CEP!!!";
    }

    @GetMapping("/cep")
    public ResponseEntity<ViaCepResponse> buscaCep(@RequestBody ViaCepRequest viaCepRequest){
        return ResponseEntity.ok(viaCepService.buscarCep(viaCepRequest));
    }
}
