-- 有効なパスワードを持つロールを作成
-- ロールとは自身でデータベースオブジェクトを所有し、データベース権限を持てる
CREATE ROLE appuser WITH LOGIN PASSWORD 'apppass';
-- appuserロールにpublicスキーマの全てのテーブルに対してSELECT、UPDATE、INSERT、DELETE権限を持つ
GRANT SELECT,UPDATE,INSERT,DELETE ON ALL TABLES IN SCHEMA public TO appuser;
-- publicスキーマの全てのシーケンスへのアクセスを許可及びSELECT付与
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO appuser;
