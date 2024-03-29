package edu.rafael.consumoviacep.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ViaCepResponse {
//    {
//        "cep": "01001-000",
//        "logradouro": "Praça da Sé",
//        "complemento": "lado ímpar",
//        "bairro": "Sé",
//        "localidade": "São Paulo",
//        "uf": "SP",
//        "ibge": "3550308",
//        "gia": "1004",
//        "ddd": "11",
//        "siafi": "7107"
//    }

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;
}
