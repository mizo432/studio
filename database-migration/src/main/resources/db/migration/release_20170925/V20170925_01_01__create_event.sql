/**
  スタジオ
 */
DROP TABLE IF EXISTS `studios`;

CREATE TABLE IF NOT EXISTS `studios` (
  studio_id VARCHAR(26) COMMENT 'スタジオID',
  studio_name_prefix VARCHAR(255) COMMENT 'スタジオ名称接頭',
  studio_name VARCHAR(255) NOT NULL COMMENT 'スタジオ名称',
  studio_name_postfix VARCHAR(255) COMMENT 'スタジオ名称接尾',
  studio_short_description TEXT COMMENT 'スタジオ短詳細',
  studio_description TEXT COMMENT 'スタジオ詳細',
  studio_twitter VARCHAR(255) COMMENT 'スタジオtwitter',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (studio_id)
);


DROP TABLE IF EXISTS `players`;

/**
  プレイヤー
 */
CREATE TABLE IF NOT EXISTS `players` (
  player_id VARCHAR(26) COMMENT 'プレイヤーID',
  topic_name VARCHAR(255) NOT NULL COMMENT 'トピック名称',
  topic_record_date DATETIME NOT NULL COMMENT 'トピック日時',
  topic_publish_date DATETIME NOT NULL COMMENT 'トピック公開日時',
  topic_description TEXT COMMENT 'トピック詳細',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (player_id)
);

DROP TABLE IF EXISTS `studio_player_x_members`;
/**
  スタジオプレイヤー
 */
DROP TABLE IF EXISTS `studio_players`;
CREATE TABLE IF NOT EXISTS `studio_players` (
  studio_player_id VARCHAR(26) COMMENT 'スタジオプレイヤーID',
  player_id VARCHAR(26) NOT NULL COMMENT 'プレイヤーID',
  studio_name_prefix VARCHAR(255) COMMENT 'プレイヤー名称接頭',
  studio_name_postfix VARCHAR(255) COMMENT 'プレイヤー名称接尾',
  studio_player_path VARCHAR(255) NOT NULL COMMENT 'プレイヤーページパス',
  studio_player_name_postfix VARCHAR(255) COMMENT 'プレイヤー名称接尾',
  studio_player_short_description TEXT NOT NULL COMMENT 'プレイヤー短詳細',
  studio_player_description TEXT NOT NULL COMMENT 'プレイヤー詳細',
  display_order_number INTEGER NOT NULL COMMENT '表示順',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (studio_player_id)
);

/**
  スタジオプレイヤーメンバー
 */
DROP TABLE IF EXISTS `studio_player_x_members`;

CREATE TABLE IF NOT EXISTS `studio_player_members` (
  studio_player_member_id VARCHAR(26) COMMENT 'スタジオプレイヤーID',
  studio_player_member_name VARCHAR(255) NOT NULL COMMENT 'プレイヤーメンバー名称',
  display_order_number INTEGER NOT NULL COMMENT '表示順',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (studio_player_member_id)
);

/**
　　スタジオプレーヤーメンバー所属
*/
CREATE TABLE IF NOT EXISTS `studio_player_x_members` (
  studio_player_id VARCHAR(26) NOT NULL COMMENT 'プレイヤーID',
  studio_player_member_id VARCHAR(26) COMMENT 'スタジオプレイヤーID',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (studio_player_id, studio_player_member_id)
);


/**
  イベント
 */
DROP TABLE IF EXISTS `events`;

CREATE TABLE IF NOT EXISTS `events` (
  event_id INTEGER AUTO_INCREMENT COMMENT 'イベントID',
  event_name_prefix VARCHAR(255) COMMENT 'イベント名称接頭',
  event_name VARCHAR(255) NOT NULL COMMENT 'イベント名称',
  event_name_postfix VARCHAR(255) COMMENT 'イベント名称接尾',
  event_description TEXT NOT NULL COMMENT 'イベント詳細',
  event_open_datetime DATETIME NOT NULL COMMENT 'イベント開場日時',
  event_start_datetime DATETIME NOT NULL COMMENT 'イベント開始日時',
  event_end_datetime DATETIME COMMENT 'イベント終了日時',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (event_id)
);

/**
  会場
 */
DROP TABLE IF EXISTS `venues`;

CREATE TABLE IF NOT EXISTS `venues` (
  venue_id INTEGER AUTO_INCREMENT COMMENT '会場ID',
  venue_name_prefix VARCHAR(255) COMMENT '会場名称接頭',
  venue_name VARCHAR(255) NOT NULL COMMENT '会場名称',
  venue_name_postfix VARCHAR(255) COMMENT '会場名称接尾',
  venue_description TEXT COMMENT '会場詳細',
  venue_address VARCHAR(255) COMMENT '会場住所',
  venue_latitude VARCHAR(255) COMMENT '会場緯度',
  venue_longitude VARCHAR(255) COMMENT '会場経度',
  venue_tel_no VARCHAR(30) COMMENT '会場電話番号',
  venue_twitter VARCHAR(255) COMMENT '会場twitter',
  venue_email VARCHAR(255) COMMENT '会場メール',
  venue_url VARCHAR(255) COMMENT '会場URL',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (venue_id)
);

/**
  スタジオプレイヤーメンバー
 */
DROP TABLE IF EXISTS `studio_player_x_news`;

/**
  ニュース
 */
DROP TABLE IF EXISTS `news`;

CREATE TABLE IF NOT EXISTS `news` (
  topic_id INTEGER AUTO_INCREMENT COMMENT 'トピックID',
  topic_name VARCHAR(255) NOT NULL COMMENT 'トピック名称',
  topic_record_date DATETIME NOT NULL COMMENT 'トピック日時',
  topic_publish_date DATETIME NOT NULL COMMENT 'トピック公開日時',
  topic_description TEXT COMMENT 'トピック詳細',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (topic_id)
);

/**
  スタジオプレイヤーニュース
 */
CREATE TABLE IF NOT EXISTS `studio_player_x_news` (
  studio_player_id VARCHAR(26) NOT NULL COMMENT 'プレイヤーID',
  topic_id INTEGER COMMENT 'トピックID',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (studio_player_id, topic_id)
);

/**
  リンク
 */
DROP TABLE IF EXISTS `links`;

CREATE TABLE IF NOT EXISTS `links` (
  link_id INTEGER AUTO_INCREMENT COMMENT 'リンクID',
  link_name VARCHAR(255) NOT NULL COMMENT 'リンク名称',
  link_uri VARCHAR(255) COMMENT 'リンクURI',
  link_kind VARCHAR(255) COMMENT 'リンク種類',
  created_at DATETIME NOT NULL COMMENT 'データ作成日時',
  created_by VARCHAR(26) NOT NULL COMMENT 'データ作成者ID',
  PRIMARY KEY (link_id)
);


