package com.example.demo.controlador;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class UrbanStyle {

    @GetMapping("/Archivos")
    public String Archivos() {
        return "Archivos";
    }

    @GetMapping("/CarritoCompras")
    public String CarritoCompras() {
        return "CarritoCompras";
    }

    @GetMapping("/CatAccesorios")
    public String CatAccesorios() {
        return "CatAccesorios";
    }

    @GetMapping("/CatPantalones")
    public String CatPantalones() {
        return "CatPantalones";
    }

    @GetMapping("/CatPantalonesM")
    public String CatPantalonesM() {
        return "CatPantalonesM";
    }

    @GetMapping("/CatPolera")
    public String CatPolera() {
        return "CatPolera";
    }

    @GetMapping("/CatPoleraM")
    public String CatPoleraM() {
        return "CatPoleraM";
    }

    @GetMapping("/CatPolos")
    public String CatPolos() {
        return "CatPolos";
    }

    @GetMapping("/CatPolosM")
    public String CatPolosM() {
        return "CatPolosM";
    }

    @GetMapping("/Deshboard")
    public String Deshboard() {
        return "Deshboard";
    }

    @GetMapping("/DetalleProducto")
    public String DetalleProducto() {
        return "DetalleProducto";
    }

    @GetMapping("/FinalizarCompra")
    public String FinalizarCompra() {
        return "FinalizarCompra";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/Intranet")
    public String Intranet() {
        return "Intranet";
    }

    @GetMapping("/Mensajeria")
    public String Mensajeria() {
        return "Mensajeria";
    }

    @GetMapping("/Nosotros")
    public String Nosotros() {
        return "Nosotros";
    }

    @GetMapping("/Pedidos")
    public String Pedidos() {
        return "Pedidos";
    }

    @GetMapping("/Usuario")
    public String Usuario() {
        return "Usuario";
    }
}
 
