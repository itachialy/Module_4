//package com.example.declaration;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//public class DeclarationController {
//    // Mảng triệu chứng
//    private static final String[] SYMPTOM_NAMES = {
//            "Sốt", "Ho", "Khó thở", "Đau họng",
//            "Nôn/buồn nôn", "Tiêu chảy", "Xuất huyết ngoài da", "Nổi ban ngoài da"
//    };
//
//    // Mảng chứa tên các phơi nhiễm
//    private static final String[] EXPOSURE_NAMES = {
//            "Đến trang trại chăn nuôi / chợ buôn bán động vật sống / cơ sở giết mổ động vật / tiếp xúc động vật",
//            "Tiếp xúc gần (<2m) với người mắc bệnh viêm đường hô hấp do nCoV"
//    };
//
//    @GetMapping("")
//    public String findAll(Model model) {
//        model.addAttribute("declaration", new Declaration());
//        return "list";
//    }
//
//    @PostMapping("show")
//    public String showResult(@ModelAttribute("declaration") Declaration declaration,
//                             @RequestParam Map<String, String> symptoms,
//                             @RequestParam Map<String, String> exposure,
//                             Model model) {
//        List<String> selectedSymptoms = new ArrayList<>();
//
//        for (int i = 0; i < SYMPTOM_NAMES.length; i++) {
//            String symptomKey = "symptoms[" + i + "]"; // Tạo key cho triệu chứng
//            String symptomValue = symptoms.get(symptomKey); // Lấy value triệu chứng từ Map
//            if ("yes".equals(symptomValue)) { // Kiểm tra nếu triệu chứng được chọn
//                selectedSymptoms.add(SYMPTOM_NAMES[i]);  // Thêm triệu chứng vào danh sách
//            }
//        }
//
//        List<String> selectedExposure = new ArrayList<>();
//
//        for (int i = 0; i < EXPOSURE_NAMES.length; i++) {
//            String exposureKey = "exposure[" + i + "]";
//            String exposureValue = exposure.get(exposureKey);
//            if ("yes".equals(exposureValue)) {
//                selectedExposure.add(EXPOSURE_NAMES[i]);
//            }
//        }
//
//        // Thêm đối tượng vào model để hiển thị trên trang kết quả
//        model.addAttribute("declaration", declaration);
//        model.addAttribute("selectedSymptoms", selectedSymptoms);
//        model.addAttribute("selectedExposure", selectedExposure);
//        return "result"; // Trả về trang JSP kết quả
//
//
//
//    }
//
//
//}
