package com.example.convert_money;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
@GetMapping("/")
    public String showForm(){
    return "list";
}

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("exchangeRate") String exchangeRateStr,
                                  @RequestParam("usdAmount") String usdAmountStr,
                                  Model model) {
        double exchangeRate = Double.parseDouble(exchangeRateStr);
        double usdAmount = Double.parseDouble(usdAmountStr);
        double vndAmount = usdAmount * exchangeRate;
        model.addAttribute("result", vndAmount);
        return "list";
    }

}
