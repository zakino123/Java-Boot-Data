CREATE TABLE users (
  -- SERIALで整数列を作成し、連番ジェネレーターが割り当てられる
  id SERIAL,
  -- 最大255文字、NULLは拒絶
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);
