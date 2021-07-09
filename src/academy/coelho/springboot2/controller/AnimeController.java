package academy.coelho.springboot2.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.coelho.springboot2.domain.Anime;
import academy.coelho.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;



@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

	private final DateUtil dateUtil; 
 
	//localhost:8080/anime/list
	@GetMapping(path = "list")
	public List<Anime> list() {
		log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
		return List.of(new Anime("DBZ"), new Anime("Berserk")); 
	}

}
