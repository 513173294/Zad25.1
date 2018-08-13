package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MieszkanieController {

    private MieszkanieRepository mieszkanieRepository;
    private  WspolnotaRepository wspolnotaRepository;

    public MieszkanieController(MieszkanieRepository mieszkanieRepository, WspolnotaRepository wspolnotaRepository) {
        this.mieszkanieRepository = mieszkanieRepository;
        this.wspolnotaRepository = wspolnotaRepository;
    }











}
