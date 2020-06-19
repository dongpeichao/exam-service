DROP TABLE IF EXISTS `t_examination`;
CREATE TABLE `t_examination` (
   `id` varchar2(255) NOT NULL,
   `paper_id` varchar2(255) NOT NULL,
   `teacher_id` varchar2(255) NOT NULL,
   `blank_quizzes` blob NOT NULL,
   `started_time` TIMESTAMP NULL,
   PRIMARY KEY (`id`)
);