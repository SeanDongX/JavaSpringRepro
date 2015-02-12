CREATE  TABLE `springdemo`.`books` (
  `id` BIGINT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(256) NULL ,
  `year` int NULL ,
  `author` VARCHAR(256) NULL ,
`publisher` VARCHAR(256) NULL ,  
  PRIMARY KEY (`id`) );

  insert into `springdemo`.`books`  (`id`, `name`, `year`, `author`, `publisher`) values (1, 'A book', 1990, 'An author', 'A publisher');
  insert into `springdemo`.`books`  (`id`, `name`, `year`, `author`, `publisher`) values (2, 'B book', 1990, 'B author',  'A publisher');
  insert into `springdemo`.`books`  (`id`, `name`, `year`, `author`, `publisher`) values (3, 'C book', 1990, 'C author', 'B publisher');
  insert into `springdemo`.`books`  (`id`, `name`, `year`, `author`, `publisher`) values (4, 'D book', 1990, 'D author', 'B publisher');