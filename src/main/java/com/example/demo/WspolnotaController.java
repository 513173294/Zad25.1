package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WspolnotaController {

private MieszkanieRepository mieszkanieRepository;
private WspolnotaRepository wspolnotaRepository;

    public WspolnotaController(MieszkanieRepository mieszkanieRepository, WspolnotaRepository wspolnotaRepository) {
        this.mieszkanieRepository = mieszkanieRepository;
        this.wspolnotaRepository = wspolnotaRepository;
    }

@GetMapping("/")
    public String main(Model model){
    List<Wspolnota> wspolnotas;
    wspolnotas= wspolnotaRepository.findAll();

model.addAttribute("wspolnoty",wspolnotas);

    return "home";
}



}
