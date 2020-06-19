DROP TABLE IF EXISTS `t_quiz`;
CREATE TABLE `t_quiz` (
   `id` varchar2(255) NOT NULL,
   `question` varchar2(255) NOT NULL,
   `reference_answer` varchar2(255) NOT NULL,
   `score` int NOT NULL,
   `teacher_id` varchar2(255) NOT NULL,
   PRIMARY KEY (`id`)
);