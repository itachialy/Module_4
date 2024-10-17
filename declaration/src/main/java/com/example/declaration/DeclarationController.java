package com.example.declaration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class DeclarationController {
    // Mảng triệu chứng
    private final static String[] symptoms = {
            "Sốt", "Ho", "Khó thở", "Đau họng",
            "Nôn/buồn nôn", "Tiêu chảy", "Xuất huyết ngoài da", "Nổi ban ngoài da"
    };
    @GetMapping("")
    public String findAll(Model model) {
        // Thêm đối tượng Declaration vào mô hình
        model.addAttribute("declaration", new Declaration());
        // Thêm mảng triệu chứng vào mô hình
        model.addAttribute("symptoms", symptoms);
        return "list"; // Tên JSP cho form
    }

//    @PostMapping("show")
//    public String showResult(@ModelAttribute("declaration") Declaration declaration,
//                             @RequestParam("declaration1") String[] declaration1, Model model) {
//        // Danh sách triệu chứng đã chọn
//        List<String> selectedSymptoms = new ArrayList<>();
//
//        // Kiểm tra mảng declaration1 để thêm triệu chứng vào danh sách
//        if (declaration1 != null) {
//            selectedSymptoms.addAll(Arrays.asList(declaration1));
//        }
//
//        // Thêm đối tượng declaration và danh sách triệu chứng đã chọn vào mô hình
//        model.addAttribute("declaration", declaration); // Thêm đối tượng Declaration
//        model.addAttribute("selectedSymptoms", selectedSymptoms); // Thêm danh sách triệu chứng đã chọn vào mô hình
//        return "result"; // Tên JSP cho kết quả
//    }

    @PostMapping("show")
    public String showResult(@ModelAttribute("declaration") Declaration declaration,
                             @RequestParam(name = "symptom", required = false) String[] symptoms, Model model) {
        List<String> selectedSymptoms = new ArrayList<>();

        if (symptoms != null) {
            for (String symptom : symptoms) {
                // Chỉ thêm triệu chứng có giá trị "yes"
                if ("yes".equals(symptom)) {
                    selectedSymptoms.add(symptom);
                }
            }
        }

        // Thêm đối tượng declaration và danh sách triệu chứng đã chọn vào mô hình
        model.addAttribute("declaration", declaration); // Thêm đối tượng Declaration
        model.addAttribute("selectedSymptoms", selectedSymptoms); // Thêm danh sách triệu chứng đã chọn vào mô hình
        return "result"; // Tên JSP cho kết quả
    }

}
