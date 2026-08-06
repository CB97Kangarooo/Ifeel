package ru.cb97.Ifeel.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cb97.Ifeel.DTO.PeriodDTO;
import ru.cb97.Ifeel.services.PeriodEntryService;
import ru.cb97.Ifeel.tracking.PeriodEntry;

@RestController
@RequestMapping("/periods")
public class PeriodEntryController {
    private final PeriodEntryService service;
    public PeriodEntryController(PeriodEntryService service) {
        this.service = service;
    }
    @PostMapping
    public PeriodEntry addPeriodEntry(@RequestBody PeriodDTO request) {
        return service.createPeriodEntry(request);
    }
}
