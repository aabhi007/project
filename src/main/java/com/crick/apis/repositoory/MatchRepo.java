package com.crick.apis.repositoory;

import com.crick.apis.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
//match fetch karna chahta ho by team heading
    Optional<Match> findByTeamHeading(String teamHeading);
}
