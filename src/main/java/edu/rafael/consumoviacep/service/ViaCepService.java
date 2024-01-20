package edu.rafael.consumoviacep.service;

import edu.rafael.consumoviacep.client.ViaCepClient;
import edu.rafael.consumoviacep.dto.ViaCepRequest;
import edu.rafael.consumoviacep.dto.ViaCepResponse;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {

    private final ViaCepClient viaCepClient;

    public ViaCepService(ViaCepClient viaCepClient) {
        this.viaCepClient = viaCepClient;
    }

    public ViaCepResponse buscarCep(ViaCepRequest viaCepRequest){
        return viaCepClient.buscaCep(viaCepRequest.getCep());
    }
}
