package com.lolimprove.controllers;

import com.google.common.base.Preconditions;
import com.lolimprove.dto.masteries.MasteryPagesDTO;
import com.lolimprove.services.URICreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

/**
 * Created by Lennart Van Damme on 28/06/2017.
 */
@RestController
class MasteriesController extends RiotAPIController {

    @Autowired
    @Qualifier("rootURIService")
    private URICreatorService uriCreatorService;

    @RequestMapping("/masteries/{summonerId}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public MasteryPagesDTO getMasteryPagesForSummoner(@PathVariable final Long summonerId) {
        Preconditions.checkNotNull(summonerId);
        URI uri = uriCreatorService.createURIForMasteries(summonerId);
        Preconditions.checkNotNull(uri);
        ResponseEntity<MasteryPagesDTO> response = super.getRestTemplate().exchange(
                uri,
                HttpMethod.GET,
                super.createHttpEntity(),
                MasteryPagesDTO.class
        );
        return response.getBody();
    }



}
