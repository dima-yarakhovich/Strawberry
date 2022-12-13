package pro.sky.strawberry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipteController {
    @GetMapping
    public String startWeb() {
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public String recipte(@RequestParam String name, String progectName, String date, String description) {
        return "Имя ученика: " + name +
                ", Название  проекта: " + progectName +
                ", Дата создания проекта: " + date +
                ", Описание проекта: " + description;
    }
    // ССылка на Get запрос в браузере см. ниже:
    // localhost:8080/info?name=%D0%94%D0%B8%D0%BC%D0%B0%20%D0%AF%D1%80%D0%BE%D1%85%D0%BE%D0%B2%D0%B8%D1%87&progectName=Strawberry&date=13.12.2022&description=%D0%9F%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5%20%D0%B4%D0%BB%D1%8F%20%D0%BA%D0%BE%D0%BD%D0%B4%D0%B8%D1%82%D0%B5%D1%80%D1%81%D0%BA%D0%B8%D1%85%20%D1%80%D0%B5%D1%86%D0%B5%D0%BF%D1%82%D0%BE%D0%B2
}
