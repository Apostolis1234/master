package gr.hua.lab.syst.totallab.controllers;

import gr.hua.lab.syst.totallab.entities.Case;
import gr.hua.lab.syst.totallab.service.CaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/case")
public class CaseRestController {
    CaseService caseService;

    public CaseRestController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping("")
    public List<Case> getCases(){
        return caseService.getCases();
    }
}
