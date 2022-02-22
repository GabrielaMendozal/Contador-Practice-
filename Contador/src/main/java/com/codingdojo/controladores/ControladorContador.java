package com.codingdojo.controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.codingdojo.modelos.Contador;


@Controller
public class ControladorContador {
	
	public static ArrayList<Contador> contadores = new ArrayList<Contador>();
	
	@RequestMapping( value="/", method = RequestMethod.GET)
	public String index( HttpSession session) {
		
		if (session.getAttribute("count") == null) {
			session.setAttribute( "count", 0);			// Usa setAttribute para inicializar el conteo en la sesión
			}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			session.setAttribute( "count", currentCount  + 1); // incrementa el conteo en 1 usando getAttribute y setAttribute
			}
		
			return "index.jsp";
		}
	
	@RequestMapping( value="/2", method = RequestMethod.GET)
	public String index2( HttpSession session) {
		
		if (session.getAttribute("count") == null) {
			session.setAttribute( "count", 0);			// Usa setAttribute para inicializar el conteo en la sesión
			}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			session.setAttribute( "count", currentCount  + 2); // incrementa el conteo en 1 usando getAttribute y setAttribute
			}
		
			return "counter2.jsp";
		}
	
	@RequestMapping(value = "/counter", method = RequestMethod.GET)
	public String showCount(HttpSession session) {
				
		return "showCount.jsp";
	}
	
	@RequestMapping("/reset")
	public RedirectView reset(HttpSession session) {
		session.setAttribute("count", 0);
		return new RedirectView("counter");
	}
}
	



