package com.lolimprove.controllers;

import com.lolimprove.dto.masteries.MasteryPagesDTO;
import com.lolimprove.services.URICreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@RestController
@CrossOrigin
public class MasteriesController extends RiotAPIController {

    private URICreatorService uriCreatorService;

    @Autowired
    public MasteriesController(URICreatorService uriCreatorService) {
        this.uriCreatorService = uriCreatorService;
    }

    @RequestMapping("/masteries/{summonerId}")
    public MasteryPagesDTO getMasteryPagesForSummoner(@PathVariable final Long summonerId) {
        ResponseEntity<MasteryPagesDTO> reponse = super.getRestTemplate().exchange(
                uriCreatorService.createURIForMasteries(summonerId),
                HttpMethod.GET,
                super.createHttpEntity(),
                MasteryPagesDTO.class
        );
        return reponse.getBody();
    }



}
