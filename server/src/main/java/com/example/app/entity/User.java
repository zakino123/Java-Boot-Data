package com.example.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// クラスがデータとして管理したい対象
@Entity
// エンティティクラスにプライマリーテーブルを指定
@Table(name = "users")
public class User {

  // エンティティクラスのプライマリキーのプロパティ，またはフィールドであることを指定
  @Id
  // プライマリキーカラムにユニークな値を自動で生成，付与する方法を指定
  // strategy属性:プライマリキー値を生成する方法を指定する属性
  // GenerationType.IDENTITY:データベースのID列を使用して主キー値を生成する
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // 64ビットの整数を格納できる型
  private Long id;
  private String name;

  protected User() {}

  public User(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  // Override:継承した親クラスのメソッドの内容を子クラスで再定義すること
  @Override
  public String toString() {
    return String.format("{id:%d,name:%s}", id, name);
  }
}
