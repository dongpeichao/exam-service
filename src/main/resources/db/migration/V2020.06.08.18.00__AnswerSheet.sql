DROP TABLE IF EXISTS `t_answer_sheet`;
CREATE TABLE `t_answer_sheet` (
   `id` varchar2(255) NOT NULL,
   `examination_id` varchar2(255) NOT NULL,
   `student_id` varchar2(255) NOT NULL,
   `answer` blob NULL,
   `started_time` TIMESTAMP NULL,
   `submitted_time` TIMESTAMP NULL,
   PRIMARY KEY (`id`)
);