package com.luxoft.team4.values_tracker.app.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by vadim.vygulyarniy
 */
@Controller
@RequestMapping(value = "/**")
public final class IndexController {

	@RequestMapping(method = GET)
	public String getIndexFile() {
		return "index";
	}
}
