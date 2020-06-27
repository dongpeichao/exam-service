DROP TABLE IF EXISTS `t_examination`;
CREATE TABLE `t_examination` (
   `id` varchar2(255) NOT NULL,
   `paper_id` varchar2(255) NOT NULL,
   `teacher_id` varchar2(255) NOT NULL,
   `duration` INT NULL DEFAULT 120,
   `quizzes` blob NOT NULL,
   PRIMARY KEY (`id`)
);