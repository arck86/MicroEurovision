package com.arck.eurovision.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arck.eurovision.models.entity.Axis;
import com.arck.eurovision.models.entity.ChartOption;
import com.arck.eurovision.models.entity.Grid;
import com.arck.eurovision.models.entity.Legend;
import com.arck.eurovision.models.entity.Resultados;
import com.arck.eurovision.models.entity.Series;
import com.arck.eurovision.models.entity.Title;
import com.arck.eurovision.models.entity.Toolbox;
import com.arck.eurovision.models.entity.Tooltip;
import com.arck.eurovision.models.entity.Voto;
import com.arck.eurovision.service.VotoService;
import com.fasterxml.jackson.core.JsonProcessingException;

@CrossOrigin(origins = "http://localhost:4321") 
@RestController 
public class VotoController {
	
	@Autowired
	VotoService votoService;

	@PostMapping(value = "/votos/save")
	public ResponseEntity<?> save(@RequestBody List<Voto> votos){
		System.out.println("En el controlador");
		votoService.save(votos.stream().filter(c -> c.getVoto()>0).toList());
		return ResponseEntity.ok().build();
	}

	@ResponseBody
	@GetMapping(value = "/grafica/votos")
	public ChartOption getVotos() throws JsonProcessingException {
		ChartOption option = new ChartOption();
		option.setTitle(new Title("Votos"));
		option.setTooltip(new Tooltip("axis"));
		option.setLegend(new Legend(List.of("Email", "Union Ads", "Video Ads", "Direct", "Search Engine")));
		option.setGrid(new Grid("3%", "4%", "3%", true));
		option.setToolbox(new Toolbox(Map.of("saveAsImage", "")));
		option.setxAxis(new Axis("category", false, List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")));
		option.setyAxis(new Axis("value", false, null));
		option.setSeries(List.of(new Series("Estonia", "line", "Total", List.of(120, 132, 101, 134, 90, 230, 210)),
				new Series("Union Ads", "line", "Total", List.of(220, 182, 191, 234, 290, 330, 310)),
				new Series("Video Ads", "line", "Total", List.of(150, 232, 201, 154, 190, 330, 410)),
				new Series("Direct", "line", "Total", List.of(320, 332, 301, 334, 390, 330, 320)),
				new Series("Search Engine", "line", "Total", List.of(820, 932, 901, 934, 1290, 1330, 1320))));
		
		return option;
		
	}
	
	@GetMapping(value = "/tabla")
	public ResponseEntity<?> save(){
		List<Resultados> list = votoService.findVotosWithInfo();
		return ResponseEntity.ok(list);
	}

}
