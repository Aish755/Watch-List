package com.example.Aishwary.watchlist.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Aishwary.watchlist.entity.Movie;

@RestController
public class MovieController{
	
	@GetMapping("/watchlistItemForm")
	public ModelAndView showWatchListForm() {
		
		String viewName="watchlistItemForm";
		
		Map<String,Object>model=new HashMap<>();
		model.put("watchlistItem", new Movie());
		return new ModelAndView(viewName,model);
	}
}