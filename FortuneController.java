package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {

	@Autowired
	HttpSession session;

	@RequestMapping("/")
	public String index() {
		session.invalidate();
		return "fortune";
	}

	@RequestMapping(value = "/fortune", method = RequestMethod.GET)
	public ModelAndView apply(
			@RequestParam("month") int month,
			ModelAndView mv) {

		//月を入力しているか確認する処理
		if (month < 1 && month > 12) {
			mv.addObject("message", "占いたい月を入力してください");
			mv.setViewName("index");
			return mv;
		}

		//占うメソッドを使用する
		String item = "鞄";
		String color = "白";
		int rank = 3;

		FortuneGenerator FG = new FortuneGenerator(month, item, color, 3);

		session.setAttribute("month", month);

		mv.addObject("item", item);
		mv.addObject("color", color);
		mv.addObject("rank", rank);

		mv.addObject("month", month);
		mv.addObject("slectMonth", month);

		//ボタンを押した後に移動する先のファイルを指定
		//mv.setViewName("result");
		return mv;
	}
}
