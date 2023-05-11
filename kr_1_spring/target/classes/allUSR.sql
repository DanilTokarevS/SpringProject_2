

SELECT * FROM users
UNION ALL
SELECT userId, authToken,userName, positionOnStarship, age, sex, balance, background, publicBackground, photo,
       securityBackground, medicalBackground, psychologyBackground, lastAvailable, userSettings FROM hv1sys_users;
