CREATE TRIGGER before_book_update
BEFORE UPDATE ON book
FOR EACH ROW
INSERT INTO republish
SET republish.id_book = OLD.id, republish.oldyear_pulish = OLD.year_republish, republish.update_date = NOW();


DELIMITER $$
CREATE  PROCEDURE countPosts(IN category_name TEXT)
BEGIN 
	SELECT COUNT(p.id)
    FROM post p
	INNER JOIN category c ON p.id_category = c.id
    WHERE c.name = category_name;
END$$
DELIMITER ;

CREATE  PROCEDURE countComment(IN id_post INT)
BEGIN 
	SELECT JSON_ARRAYAGG(JSON_OBJECT('author name',a.name,'comment',d.comment,'date',d.create_at))
    FROM post p
	INNER JOIN discuss d ON d.id_post = p.id
    INNER JOIN author a ON a.id = d.id_author
    WHERE p.id = id_post;
END$$
DELIMITER ;