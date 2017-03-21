#! /bin/bash
mvn clean install
cd webapp
mvn jetty:run
