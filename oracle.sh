docker volume create oracle-volume
docker run -d -v oracle-volume:/opt/oracle/oradata --name oracleXe -p 1522:1521 -e ORACLE_PASSWORD=admin gvenzl/oracle-xe
docker container logs oracleXe