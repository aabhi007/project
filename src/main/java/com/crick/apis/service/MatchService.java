package com.crick.apis.service;

import com.crick.apis.entity.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get all matches

    List<Match> getAllMatches();

    //get live matches

    List<Match> getLiveMatches();

    //get point table

    List<List<String>> getPointTable();
}
