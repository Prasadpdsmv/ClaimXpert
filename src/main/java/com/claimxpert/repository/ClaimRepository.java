
package com.claimxpert.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.claimxpert.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim,Long>{}
