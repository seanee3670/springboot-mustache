package com.mustache.springbootmustache.controller;

import com.mustache.springbootmustache.domain.entity.Hospital;
import com.mustache.springbootmustache.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hospitals")
@RequiredArgsConstructor
@Slf4j
public class HospitalController {

    private final HospitalRepository repository;

    @GetMapping("")
    public String list(Model model, Pageable pageable) {
        Page<Hospital> hospitals = repository.findAll(pageable);
        log.info("hospitals.size={}", hospitals.getSize());
        model.addAttribute("hospitals", hospitals);
        model.addAttribute("previous", pageable.previousOrFirst().getPageNumber());
        model.addAttribute("next", pageable.next().getPageNumber());
        model.addAttribute("hasPrevious", hospitals.hasPrevious());
        model.addAttribute("hasNext", hospitals.hasNext());
        return "hospitals/list";
    }
}