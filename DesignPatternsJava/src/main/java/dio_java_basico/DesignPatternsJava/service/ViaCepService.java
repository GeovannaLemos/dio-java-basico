package dio_java_basico.DesignPatternsJava.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dio_java_basico.DesignPatternsJava.model.Endereco;

@FeignClient (name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @RequestMapping (method = RequestMethod.GET, value= "/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
