
For showing highscore record of players jdbc connection is required
To create the database here are the steps-
1) Download xampp software for mysql and phpadmin
   windows link- https://downloadsapachefriends.global.ssl.fastly.net/7.1.32/xampp-windows-x64-7.1.32-1-VC14-installer.exe?from_af=true
2) After Downloading start mysql through control panel of xampp.
3) open localhost phpadmin through your browser by typing 'localhost' in url.
4) Now create database game.
5) After creating database create table score.
   SQL Querry- create table score
               ( sno int primary key
                 playername varchar(50) 
                 rolles int
               );