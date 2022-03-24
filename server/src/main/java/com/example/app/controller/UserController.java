package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.repository.UserRepository;

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
    // valueofメソッド:String型の文字列として返す
    // findAllメソッド:リポジトリの全てのインスタンスを返す
    return String.valueOf(repository.findAll());
  }
}
