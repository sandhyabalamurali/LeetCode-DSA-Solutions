# Write your MySQL query statement below
-- select round(count(distinct player_id)/count(distinct player_id),2)  as fraction
-- from Activity 
-- where (player_id,date_sub(event_date,interval 2 day)) in
--         (select player_id,min(event_date) as first_login 
--         from activity 
--         group by player_id);
# Write your MySQL query statement below
SELECT
  ROUND(COUNT(DISTINCT player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 2) AS fraction
FROM
  Activity
WHERE
  (player_id, DATE_SUB(event_date, INTERVAL 1 DAY))
  IN (
    SELECT player_id, MIN(event_date) AS first_login FROM Activity GROUP BY player_id
)