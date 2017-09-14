CREATE TABLE IF NOT EXISTS `asorepo` (
  asorepo_number BIGINT AUTO_INCREMENT,
  PRIMARY KEY (asorepo_number)
);

CREATE TABLE IF NOT EXISTS `asorepo_details` (
  asorepo_detail_number BIGINT       NOT NULL AUTO_INCREMENT,
  asorepo_number        BIGINT       NOT NULL,
  text                  VARCHAR(150) NOT NULL,
  member_id             INTEGER      NOT NULL,
  posted_at             DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  base_number           INTEGER      NOT NULL,
  PRIMARY KEY (asorepo_detail_number),
  CONSTRAINT `fk_asorepo_detail_to_asorepo` FOREIGN KEY (asorepo_number) REFERENCES asorepo (asorepo_number)
);

CREATE TABLE IF NOT EXISTS `active_asorepo` (
  asorepo_detail_number BIGINT NOT NULL,
  asorepo_number        BIGINT NOT NULL,
  PRIMARY KEY (asorepo_detail_number),
  CONSTRAINT `uq_active_asorepo_asorepo_number` UNIQUE (asorepo_number),
  CONSTRAINT `fk_active_asorepo_to_asorepo_detail` FOREIGN KEY (asorepo_detail_number) REFERENCES asorepo_details (asorepo_detail_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_active_asorepo_to_asorepo` FOREIGN KEY (asorepo_number) REFERENCES asorepo_details (asorepo_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `asorepo_images` (
  asorepo_detail_number BIGINT               NOT NULL,
  image_path            VARCHAR(300)
                        CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (asorepo_detail_number, image_path),
  CONSTRAINT `fk_asorepo_image_to_asorepo` FOREIGN KEY (asorepo_detail_number) REFERENCES asorepo_details (asorepo_detail_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `asorepo_experienced_dates` (
  asorepo_detail_number BIGINT NOT NULL,
  experienced_date      DATE   NOT NULL,
  CONSTRAINT `fk_asorepo_experienced_dates_to_asorepo` FOREIGN KEY (asorepo_detail_number) REFERENCES asorepo_details (asorepo_detail_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `asorepo_x_plan` (
  asorepo_number BIGINT      NOT NULL,
  plan_code      VARCHAR(13) NOT NULL,
  PRIMARY KEY (asorepo_number, plan_code),
  CONSTRAINT `fk_asorepo_x_plan_to_asorepo` FOREIGN KEY (asorepo_number) REFERENCES asorepo (asorepo_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `asorepo_x_reservation` (
  asorepo_number     BIGINT NOT NULL,
  reservation_number BIGINT NOT NULL,
  PRIMARY KEY (asorepo_number),
  CONSTRAINT `fk_asorepo_x_reservation_to_asorepo` FOREIGN KEY (asorepo_number) REFERENCES asorepo (asorepo_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `asorepo_x_ticket` (
  asorepo_number   BIGINT      NOT NULL,
  ticket_type_code VARCHAR(16) NOT NULL,
  PRIMARY KEY (asorepo_number, ticket_type_code),
  CONSTRAINT `fk_asorepo_x_ticket_to_asorepo` FOREIGN KEY (asorepo_number) REFERENCES asorepo (asorepo_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `asorepo_x_ticket_book` (
  asorepo_number   BIGINT      NOT NULL,
  ticket_book_code VARCHAR(12) NOT NULL,
  PRIMARY KEY (asorepo_number, ticket_book_code),
  CONSTRAINT `fk_asorepo_x_ticket_book_to_asorepo` FOREIGN KEY (asorepo_number) REFERENCES asorepo (asorepo_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `asorepo_x_base` (
  asorepo_number BIGINT  NOT NULL,
  base_number    INTEGER NOT NULL,
  PRIMARY KEY (asorepo_number, base_number),
  CONSTRAINT `fk_asorepo_x_base_to_asorepo` FOREIGN KEY (asorepo_number) REFERENCES asorepo (asorepo_number)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS `report_less_reservation` (
  reservation_number BIGINT NOT NULL,
  member_id      INTEGER NOT NULL,
  PRIMARY KEY (reservation_number, member_id)
);

CREATE TABLE IF NOT EXISTS `report_less_ticket_book` (
  ticket_book_code VARCHAR(12) NOT NULL,
  member_id      INTEGER NOT NULL,
  PRIMARY KEY (ticket_book_code, member_id)
);