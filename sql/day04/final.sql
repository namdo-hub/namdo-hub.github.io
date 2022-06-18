1.
SELECT m.title, m.description,d.full_name as 'director',JSON_ARRAYAGG(w.full_name) as 'writers',m.`length`,m.rating
FROM movie m 
INNER JOIN director d ON m .id_director = d.id 
INNER JOIN movie_writers mw ON m.id = mw.id_movie 
INNER JOIN writers w ON mw.id_writer  = w.id 
INNER JOIN title_type tt ON m.id_title_type = tt.id 
WHERE tt.name = 'Movie'
GROUP BY(m.id)
2.
SELECT m2.name as 'manufaturer' , COUNT(m3.id) as 'numbers of movie'
FROM manufacturer m2
LEFT JOIN movie_manufacturer mm ON m2.id = mm.id_manufacturer 
LEFT JOIN movie m3 ON m3.id = mm.id_movie
GROUP BY(m2.id)

3.
SELECT m.title 
FROM movie m 
INNER JOIN title_type tt ON m.id_title_type = tt.id 
WHERE m.episode = m.current_episode AND tt.name = 'TV Series'
4.
SELECT m2.title, m2.description , m2.poster, m2.`length`, m2.imdb
FROM movie m2
INNER JOIN title_type tt2 ON m2.id_title_type = tt2.id 
WHERE tt2.name = 'Movie'
ORDER BY m2.imdb DESC 
5.
SELECT m3.title, m3.description, m3.poster, m3.`length`, JSON_ARRAYAGG(g.name) as 'genres', m3.episode, m3.current_episode,m3.release_date 
FROM movie m3 
INNER JOIN movie_genres mg ON m3.id = mg.id_movie 
INNER JOIN genres g ON g.id = mg.id_genres
INNER JOIN title_type tt3 ON tt3.id  = m3.id_title_type 
WHERE tt3.name  = 'TV Mini Series'
GROUP BY(m3.id)
ORDER BY m3.release_date DESC
6.

SELECT m.title,m.description,d.full_name as 'director', m.poster, m.`length`, JSON_ARRAYAGG(g.name) as 'genres', JSON_ARRAYAGG(a.full_name) as 'actors'
FROM movie m
INNER JOIN director d ON m.id_director = d.id
INNER JOIN movie_genres mg ON mg.id_movie = m.id 
INNER JOIN genres g ON g.id = mg.id_genres
INNER JOIN movie_actor ma ON ma.id_movie = m.id
INNER JOIN actor a ON a.id = ma.id_actor 
INNER JOIN title_type tt ON tt.id =m.id_title_type 
WHERE tt.name = 'Movie'
GROUP BY(m.id)
ORDER BY m.imdb DESC
LIMIT 10