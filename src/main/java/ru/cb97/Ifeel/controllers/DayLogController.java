package ru.cb97.Ifeel.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cb97.Ifeel.DTO.DayLogAnswer;
import ru.cb97.Ifeel.DTO.DayLogDTO;
import ru.cb97.Ifeel.services.DayLogService;

@RestController
@RequestMapping("/day_logs")
public class DayLogController {
    private final DayLogService dayLogService;
    public DayLogController(DayLogService dayLogService) {this.dayLogService = dayLogService;}
    @PostMapping
    public DayLogAnswer createDayLog(@RequestBody DayLogDTO request) {
        return dayLogService.createDayLog(request);
    }
}
