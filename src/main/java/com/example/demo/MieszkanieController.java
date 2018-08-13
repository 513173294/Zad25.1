package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class MieszkanieController {

    private MieszkanieRepository mieszkanieRepository;
    private  WspolnotaRepository wspolnotaRepository;

    public MieszkanieController(MieszkanieRepository mieszkanieRepository, WspolnotaRepository wspolnotaRepository) {
        this.mieszkanieRepository = mieszkanieRepository;
        this.wspolnotaRepository = wspolnotaRepository;
    }









}
