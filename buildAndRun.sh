#!/bin/sh
mvn clean package && docker build -t com.mycompany/Emr2 .
docker rm -f Emr2 || true && docker run -d -p 9080:9080 -p 9443:9443 --name Emr2 com.mycompany/Emr2