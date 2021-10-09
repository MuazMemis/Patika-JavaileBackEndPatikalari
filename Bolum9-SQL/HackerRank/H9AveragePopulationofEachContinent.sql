SELECT o.CONTINENT, FLOOR(AVG(i.POPULATION)) FROM CITY AS i 
JOIN COUNTRY AS o ON i.COUNTRYCODE=o.CODE GROUP BY o.CONTINENT;

-- OR

SELECT Country.Continent, FLOOR(AVG(City.Population))
FROM Country, City 
WHERE Country.Code = City.CountryCode 
GROUP BY Country.Continent ;