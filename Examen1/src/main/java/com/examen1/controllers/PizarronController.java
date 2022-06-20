package com.examen1.controllers;

import com.examen1.models.Pizarron;
import com.examen1.services.PizarronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Scanner;

@Controller
@RequestMapping("/index")
public class PizarronController {

    @Autowired
    PizarronService pizarronService;

    @RequestMapping("/")
    public String index(@ModelAttribute("pizarron") Pizarron pizarron){
        return "index.jsp";

    }

    @PostMapping("/registrar")
    public String registroPizarra(@Valid @ModelAttribute("pizarron") Pizarron pizarron,
                                  BindingResult result,
                                  Model model){

        if (result.hasErrors()){
            model.addAttribute("msgError", "Debe ingresar los datos correctamente");
            return"index.jsp";


        }else {
            pizarronService.guardarPizarra(pizarron);

            List<Pizarron> listaPizarra = pizarronService.findAll();
            model.addAttribute("pizarrasCapturadas", listaPizarra);

            return "mostrarPizarras.jsp";


        }


    }

   


    @RequestMapping("/editar/{id}")
    public String editarPizarra(@PathVariable("id")Long id,
                                Model model){

        Pizarron pizarron = pizarronService.buscarID(id);
        model.addAttribute("pizarron", pizarron);

        return "editarPizarra.jsp";

    }


    @PostMapping("/actualizar/{id}")
    public String actualizarPizarra(@PathVariable("id")Long id,
                                    @Valid @ModelAttribute("pizarron")Pizarron pizarron,
                                    BindingResult result,
                                    Model model){

        if (result.hasErrors()){
            model.addAttribute("msgError","Debe ingresar los datos correctamente");
            return "editarPizarra.jsp";
        }else{
            pizarron.setId(id);
            pizarronService.guardarPizarra(pizarron);

            List<Pizarron> listaPizarra = pizarronService.findAll();
            model.addAttribute("pizarrasCapturadas", listaPizarra);

            return "mostrarPizarras.jsp";


        }

    }






}
