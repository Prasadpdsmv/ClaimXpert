
package com.claimxpert.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.claimxpert.entity.Claim;
import com.claimxpert.repository.ClaimRepository;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository repo;

    public List<Claim> getAll() {
        return repo.findAll();
    }

    public Claim getByClaimId(String claimId) {
        return repo.findAll().stream()
                .filter(c -> c.getClaimId().equals(claimId))
                .findFirst()
                .orElseThrow();
    }

    public Claim updateStatus(String claimId, String status) {
        Claim c = getByClaimId(claimId);
        c.setStatus(status);
        return repo.save(c);
    }
    public Claim createClaim(Claim claim) {
    return repo.save(claim);
}
}