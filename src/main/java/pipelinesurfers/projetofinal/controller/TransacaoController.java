package pipelinesurfers.projetofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pipelinesurfers.projetofinal.dao.TransacaoDAO;

@RestController
@CrossOrigin("*")
@RequestMapping("/transacao")
public class TransacaoController {
    
    @Autowired 
    private TransacaoDAO dao;

    @GetMapping("/id/{id}")
    public ResponseEntity<Object> buscarUserPersonalizado(@PathVariable int id){
        Object userFinded = dao.countStatusByAgent(id);

        if(userFinded != null){
            return ResponseEntity.ok(userFinded);

        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/idtotal/{id}")
    public ResponseEntity<Object> buscarAgFinanceiroPersonalizado(@PathVariable int id) {
        Object agFinanceiroFinded = dao.buscarAgFinanceirosPorId(id);

        if(agFinanceiroFinded != null){
            return ResponseEntity.ok(agFinanceiroFinded);
        }
        return ResponseEntity.notFound().build();
    }
    
}
