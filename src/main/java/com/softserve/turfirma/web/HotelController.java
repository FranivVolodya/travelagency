package com.softserve.turfirma.web;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.softserve.turfirma.domain.Hotel;
import com.softserve.turfirma.services.IHotelService;

@Controller
public class HotelController {
	@Autowired
	private IHotelService hotelService;
	@RequestMapping("/hotel")
	public String listHotels(Map<String, Object> map) {
	map.put("hotel", new Hotel());
	map.put("hotelList", hotelService.getAllHotels());
	return "hotel";
	}
	@RequestMapping(value = "/addHotel", method = RequestMethod.POST)
	public String addHotel(@ModelAttribute("hotel") Hotel hotel,
	BindingResult result) {
	hotelService.addHotel(hotel);
	return "redirect:/hotel";
	}
	@RequestMapping("/deleteHotel/{hotelId}")
	public String deleteHotel(@PathVariable("hotelId") Integer
	hotelId) {
	hotelService.deleteHotels(hotelId);
	return "redirect:/hotel";
	}

}
