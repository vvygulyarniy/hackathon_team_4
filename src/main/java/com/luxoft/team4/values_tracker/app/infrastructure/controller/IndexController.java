package com.luxoft.team4.values_tracker.app.infrastructure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vadim.vygulyarniy
 */
@Controller
public final class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexFile() {
		return "index";
	}
}
