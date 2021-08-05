@echo off
call mvn clean package
call docker build -t com.mycompany/Emr2 .
call docker rm -f Emr2
call docker run -d -p 9080:9080 -p 9443:9443 --name Emr2 com.mycompany/Emr2