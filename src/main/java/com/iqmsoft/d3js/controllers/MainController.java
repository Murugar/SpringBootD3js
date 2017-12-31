package com.iqmsoft.d3js.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;


@RestController
public class MainController {

  @RequestMapping("/api/data")
  public String data() {
    final ThreadLocalRandom random = ThreadLocalRandom.current();
    return String.format(
        "[%d, %d, %d, %d, %d]",
        random.nextInt(200),
        random.nextInt(200),
        random.nextInt(200),
        random.nextInt(200),
        random.nextInt(200)
    );
  }

}
