package ProjetoSuaCesta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finalize-account")
public class FinalizeAccountController {

    @GetMapping
    public String getFinalizeAccount(Model model) {
        // Adicione informações, como URLs de imagens ou qualquer outro dado
        model.addAttribute("finalizeText", "Finalizar no Whatsapp.");
        model.addAttribute("whatsappLink", "https://wa.me/55791527744"); // Substitua pelo número real
        return "fragments/finalize-account";
    }
}