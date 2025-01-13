package gr.hua.lab.syst.totallab.service;

import gr.hua.lab.syst.totallab.entities.Case;
import gr.hua.lab.syst.totallab.entities.Client;
import gr.hua.lab.syst.totallab.entities.Lawyer;
import gr.hua.lab.syst.totallab.repositories.CaseRepository;
import gr.hua.lab.syst.totallab.repositories.LawyerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseService {

    private CaseRepository caseRepository;

    private LawyerRepository lawyerRepository;

    public CaseService(CaseRepository caseRepository, LawyerRepository lawyerRepository) {
        this.caseRepository = caseRepository;
        this.lawyerRepository = lawyerRepository;
    }

    @Transactional
    public List<Case> getCases(){
        return caseRepository.findAll();
    }

    @Transactional
    public void saveCase(Case case_) {
        caseRepository.save(case_);
    }

    @Transactional
    public Case getCase(Integer caseId) {
        return caseRepository.findById(caseId).orElse(null);
    }

    @Transactional
    public void assignLawyerToCase(int caseId, Lawyer lawyer) {
        Case case_ = caseRepository.findById(caseId).orElseThrow();
        System.out.println(case_);
        System.out.println(case_.getLawyer());
        // case_.setLawyer(lawyer); // todo pairnei String alla pername Lawyer. Fix it.
        System.out.println(case_.getLawyer());
        caseRepository.save(case_);
    }

    @Transactional
    public void unassignLawyerFromCase(int caseId) {
        Case case_ = caseRepository.findById(caseId).orElseThrow();
        case_.setLawyer(null);
        caseRepository.save(case_);
    }

    @Transactional
    public void assignClientToCase(int caseId, Client client) {
        Case case_ = caseRepository.findById(caseId).orElseThrow();
        // case_.addClient(client); // todo den yparxei tetoia methodos. Create it.
        // System.out.println("Case clients: ");
        // System.out.println(case_.getClients()); // TODO den yparxei getClients.
        caseRepository.save(case_);
    }
}
