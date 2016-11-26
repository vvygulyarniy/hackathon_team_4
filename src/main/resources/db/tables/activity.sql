CREATE TABLE company_activity (
  id                  NUMBER PRIMARY KEY AUTO_INCREMENT NOT NULL,
  company_value       VARCHAR2(50)                      NOT NULL,
  activity_type       VARCHAR2(50)                      NOT NULL,
  title               VARCHAR2(100)                     NOT NULL,
  description         VARCHAR2(255)                     NOT NULL,
  organizer_id        NUMBER,
  start_date          DATE,
  finish_date         DATE,
  available_for_group NUMBER,
);
