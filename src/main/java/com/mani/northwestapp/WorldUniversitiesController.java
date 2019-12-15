package com.mani.northwestapp;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(maxAge = -1)
@RestController
@RequestMapping("/universitylist")
public class WorldUniversitiesController {
private org.slf4j.Logger logger = LoggerFactory.getLogger(WorldUniversitiesController.class);

@Autowired
private WorldUniversitiesService worldUniversitiesService;

@GetMapping("retrieve")
public String worldUniversityList() {
logger.debug("inside the method worldUniversityList");
return worldUniversitiesService.worldUniversityConsumedList();

}
}


