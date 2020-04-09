CREATE DATABASE economic;
USE economic;

CREATE TABLE system_type (
	system_type_id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL
);

INSERT INTO system_type (name) VALUES("Сложная система реального времени");
INSERT INTO system_type (name) VALUES("Информационно-поисковая система");
INSERT INTO system_type (name) VALUES("Пакет прикладных программ");

CREATE TABLE coefficient_a (
	coef_a_id INT AUTO_INCREMENT PRIMARY KEY,
	value_a FLOAT
);

INSERT INTO coefficient_a (value_a) VALUES(2.8);
INSERT INTO coefficient_a (value_a) VALUES(3.0);
INSERT INTO coefficient_a (value_a) VALUES(2.4);

CREATE TABLE system_type_coefficient_a (
	system_type_coef_a_id INT AUTO_INCREMENT PRIMARY KEY,
	system_type_id INT,
	coef_a_id INT,
	FOREIGN KEY (system_type_id) REFERENCES system_type (system_type_id),
	FOREIGN KEY (coef_a_id) REFERENCES coefficient_a (coef_a_id)
);

INSERT INTO system_type_coefficient_a (system_type_id, coef_a_id)
VALUES (1,1);
INSERT INTO system_type_coefficient_a (system_type_id, coef_a_id)
VALUES (2,2);
INSERT INTO system_type_coefficient_a (system_type_id, coef_a_id)
VALUES (3,3);

CREATE TABLE coefficient_e (
	coef_e_id INT AUTO_INCREMENT PRIMARY KEY,
	value_e FLOAT
);

INSERT INTO coefficient_e (value_e) VALUES(1.2);
INSERT INTO coefficient_e (value_e) VALUES(1.12);
INSERT INTO coefficient_e (value_e) VALUES(1.05);

CREATE TABLE system_type_coefficient_e (
	system_type_coef_e_id INT AUTO_INCREMENT PRIMARY KEY,
	system_type_id INT,
	coef_e_id INT,
	FOREIGN KEY (system_type_id) REFERENCES system_type (system_type_id),
	FOREIGN KEY (coef_e_id) REFERENCES coefficient_e (coef_e_id)
);

INSERT INTO system_type_coefficient_e (system_type_id, coef_e_id)
VALUES (1,1);
INSERT INTO system_type_coefficient_e (system_type_id, coef_e_id)
VALUES (2,2);
INSERT INTO system_type_coefficient_e (system_type_id, coef_e_id)
VALUES (3,3);

CREATE TABLE coefficient_g (
	coef_g_id INT AUTO_INCREMENT PRIMARY KEY,
	value_g FLOAT
);

INSERT INTO coefficient_g (value_g) VALUES(2.5);
INSERT INTO coefficient_g (value_g) VALUES(2.5);
INSERT INTO coefficient_g (value_g) VALUES(2.5);

CREATE TABLE system_type_coefficient_g (
	system_type_coef_g_id INT AUTO_INCREMENT PRIMARY KEY,
	system_type_id INT,
	coef_g_id INT,
	FOREIGN KEY (system_type_id) REFERENCES system_type (system_type_id),
	FOREIGN KEY (coef_g_id) REFERENCES coefficient_g (coef_g_id)
);

INSERT INTO system_type_coefficient_g (system_type_id, coef_g_id)
VALUES (1,1);
INSERT INTO system_type_coefficient_g (system_type_id, coef_g_id)
VALUES (2,2);
INSERT INTO system_type_coefficient_g (system_type_id, coef_g_id)
VALUES (3,3);

CREATE TABLE coefficient_h (
	coef_h_id INT AUTO_INCREMENT PRIMARY KEY,
	value_h FLOAT
);

INSERT INTO coefficient_h (value_h) VALUES(0.38);
INSERT INTO coefficient_h (value_h) VALUES(0.35);
INSERT INTO coefficient_h (value_h) VALUES(0.32);

CREATE TABLE system_type_coefficient_h (
	system_type_coef_h_id INT AUTO_INCREMENT PRIMARY KEY,
	system_type_id INT,
	coef_h_id INT,
	FOREIGN KEY (system_type_id) REFERENCES system_type (system_type_id),
	FOREIGN KEY (coef_h_id) REFERENCES coefficient_h (coef_h_id)
);

INSERT INTO system_type_coefficient_h (system_type_id, coef_h_id)
VALUES (1,1);
INSERT INTO system_type_coefficient_h (system_type_id, coef_h_id)
VALUES (2,2);
INSERT INTO system_type_coefficient_h (system_type_id, coef_h_id)
VALUES (3,3);

CREATE TABLE system_complexity (
	complexity_id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL
);

INSERT INTO system_complexity (name) VALUES ("B1");
INSERT INTO system_complexity (name) VALUES ("B2");

CREATE TABLE complexity_kloc_capacity_system_type (
	complexity_capacity_system_type_id INT AUTO_INCREMENT PRIMARY KEY,
	system_type_id INT,
	complexity_id INT,
    capacity INT,
	FOREIGN KEY (system_type_id) REFERENCES system_type (system_type_id),
	FOREIGN KEY (complexity_id) REFERENCES system_complexity (complexity_id)
);

INSERT INTO complexity_kloc_capacity_system_type (system_type_id, complexity_id, capacity) VALUES (1,1, 300);
INSERT INTO complexity_kloc_capacity_system_type (system_type_id, complexity_id, capacity) VALUES (1,2, 500);
INSERT INTO complexity_kloc_capacity_system_type (system_type_id, complexity_id, capacity) VALUES (2,1, 100);
INSERT INTO complexity_kloc_capacity_system_type (system_type_id, complexity_id, capacity) VALUES (2,2, 200);
INSERT INTO complexity_kloc_capacity_system_type (system_type_id, complexity_id, capacity) VALUES (3,1, 35);
INSERT INTO complexity_kloc_capacity_system_type (system_type_id, complexity_id, capacity) VALUES (3,2, 50);

CREATE TABLE type_grade (
	type_grade_id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL
);

INSERT INTO type_grade (name) VALUES ("Низкий");
INSERT INTO type_grade (name) VALUES ("Номинальный");
INSERT INTO type_grade (name) VALUES ("Высокий");
INSERT INTO type_grade (name) VALUES ("Очень высокий");
INSERT INTO type_grade (name) VALUES ("Сверх высовий");

CREATE TABLE factor_changing_complexity_intensity (
	factor_id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255) NOT NULL,
	content_factor VARCHAR(255) NOT NULL
);

INSERT INTO factor_changing_complexity_intensity (name, content_factor) VALUES ("M1", "Сложность и надежность программного продукта");
INSERT INTO factor_changing_complexity_intensity (name, content_factor) VALUES ("M2", "Требование повторного использования компонентов");
INSERT INTO factor_changing_complexity_intensity (name, content_factor) VALUES ("M3", "Ограничения аппаратной платформы производства применения продукта");
INSERT INTO factor_changing_complexity_intensity (name, content_factor) VALUES ("M4", "Квалификация и стабильность коллектива");
INSERT INTO factor_changing_complexity_intensity (name, content_factor) VALUES ("M5", "Опыт работы по тематике");
INSERT INTO factor_changing_complexity_intensity (name, content_factor) VALUES ("M6", "Уровень инструментальной поддержки и необходимость распределения производства");
INSERT INTO factor_changing_complexity_intensity (name, content_factor) VALUES ("M7", "Ограничение длительности производства");

CREATE TABLE coefficient_changing_complexity_production_pc (
	coefficient_complexity_id INT AUTO_INCREMENT PRIMARY KEY,
	factor_id INT,
	type_grade_id INT,
	value FLOAT NOT NULL,
	FOREIGN KEY (factor_id) REFERENCES factor_changing_complexity_intensity (factor_id),
	FOREIGN KEY (type_grade_id) REFERENCES type_grade (type_grade_id)
);

INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (1,1,0.83);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (1,2,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (1,3,1.33);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (1,4,1.91);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (1,5,2.72);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (2,1,0.95);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (2,2,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (2,3,1.07);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (2,4,1.15);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (2,5,1.24);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (3,1,0.87);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (3,2,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (3,3,1.29);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (3,4,1.81);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (3,5,2.61);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (4,1,1.26);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (4,2,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (4,3,0.83);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (4,4,0.63);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (4,5,0.50);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (5,1,1.12);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (5,2,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (5,3,0.87);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (5,4,0.74);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (5,5,0.62);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (6,1,1.10);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (6,2,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (6,3,0.87);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (6,4,0.73);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (6,5,0.62);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (7,1,1.14);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (7,2,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (7,3,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (7,4,1.00);
INSERT INTO coefficient_changing_complexity_production_pc (factor_id, type_grade_id, value) VALUES (7,5,1.00);