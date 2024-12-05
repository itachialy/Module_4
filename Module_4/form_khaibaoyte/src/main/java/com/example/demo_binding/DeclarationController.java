
package com.example.demo_binding;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;
@Controller
public class DeclarationController {

    @GetMapping("")
    public String findAll(Model model) {
        Declaration declaration = new Declaration();
        model.addAttribute("declaration", declaration);
        return "form";
    }


    @PostMapping("show")
    public String showResult(@ModelAttribute("declaration") Declaration declaration,
                             Model model) {

        String[] symptomsList = {"Sốt", "Ho", "Khó thở", "Đau họng", "Nôn/buồn nôn", "Tiêu chảy", "Xuất huyết ngoài da", "Nổi ban ngoài da"};
        String[] exposureList = {"Đến trang trại chăn nuôi / chợ buôn bán động vật sống / cơ sở giết mổ động vật / tiếp xúc động vật",
                "Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV"};

        List<String> selectedSymptoms = new ArrayList<>();
        List<String> selectedExposure = new ArrayList<>();

        if (declaration.getSymptoms() != null) {
            for (int i = 0; i < declaration.getSymptoms().length; i++) {
                if ("yes".equals(declaration.getSymptoms()[i])) {
                    selectedSymptoms.add(symptomsList[i]);
                }
            }
        }

        if (declaration.getExposure() != null) {
            for (int i = 0; i < declaration.getExposure().length; i++) {
                if ("yes".equals(declaration.getExposure()[i])) {
                    selectedExposure.add(exposureList[i]);
                }
            }
        }
        model.addAttribute("declaration", declaration);
        model.addAttribute("selectedSymptoms", selectedSymptoms);
        model.addAttribute("selectedExposure", selectedExposure);
        return "result";

    }


}

