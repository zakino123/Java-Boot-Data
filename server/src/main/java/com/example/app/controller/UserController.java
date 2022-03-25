package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.repository.UserRepository;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {
  // final修飾子:他のControllerで使用されない
  private final UserRepository repository;

  // DIコンテナから@Autowiredを付与したフィールド変数などでインスタンスを取得
  @Autowired
  public UserController(UserRepository repository) {
    this.repository = repository;
  }

  @RequestMapping("/")
  public String user() {
    return String.valueOf(repository.findAll());
  }

  @RequestMapping("/users")
  public ModelAndView get(ModelAndView mav) {
    mav.addObject("target", "Thymeleaf");
    mav.setViewName("index");
    return mav;
  }

}
