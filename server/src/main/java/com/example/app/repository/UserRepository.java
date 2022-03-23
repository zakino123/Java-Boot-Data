package com.example.app.repository;

// CrudRepository:特定のタイプのリポジトリに対する一般的なCRUD操作のためのSpring Dataインタフェース
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.app.entity.User;

// @Repositoryはリポジトリーを構築する
@Repository
// UserRepository.javaでUserテーブルのCRUD操作ができる
public interface UserRepository extends CrudRepository<User, Long> {
}
