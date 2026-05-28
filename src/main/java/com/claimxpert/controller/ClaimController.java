
package com.claimxpert.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.claimxpert.entity.Claim;
import com.claimxpert.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/claims")
@CrossOrigin
public class ClaimController {

    @Autowired
    private ClaimService service;

    @GetMapping
    public List<Claim> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}/approve")
    public Claim approve(@PathVariable String id) {
        return service.updateStatus(id, "Approved");
    }

    @PutMapping("/{id}/reject")
    public Claim reject(@PathVariable String id) {
        return service.updateStatus(id, "Rejected");
    }
    
    @PostMapping
public Claim addClaim(@RequestBody Claim claim) {
    return service.createClaim(claim);
}
}