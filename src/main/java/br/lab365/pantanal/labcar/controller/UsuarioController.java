package br.lab365.pantanal.labcar.controller;

import br.lab365.pantanal.labcar.model.UsuarioModel;
import br.lab365.pantanal.labcar.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity post(@RequestBody UsuarioModel usuario) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvar(usuario));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/existe/{email}")
    public Boolean existeEmail(@PathVariable String email) {
        return usuarioService.existe(email);
    }

}
