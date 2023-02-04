## spring-cloud-function-stream-integration
#
#
## Run Sample : 
#
#  - Run docker
#
#    docker compose up -d 
#
#  - Run App
#   
#   ./mvnw spring-boot:run
#
## Test Sample
#
#   $ curl isS -H "Content-Type: application/json" localhost:8080/process -w '\n' -d '{"string" : "1"}'
#   $ curl isS -H "Content-Type: application/json" localhost:8080/process -w '\n' -d '{"string" : "2"}'
#   $ curl isS -H "Content-Type: application/json" localhost:8080/process -w '\n' -d '{"string" : "0"}'
#
#   $ curl isS -H "Content-Type: application/json" localhost:8080/doubleIt -w '\n' -d '[0,1,1,2,3,5,8,13,21,34,55]'
#   $ curl isS -H "Content-Type: application/json" localhost:8080/doubleIt -d '[0,1,1,2,3,5,8,13,21,34,55]' ; echo
#
#   $ curl isS -H "Content-Type: text/plain" localhost:8080/produceIt -w '\n' -d 3
#
#   $ curl isS -H "Content-Type: application/json" localhost:8080/logIt -w '\n' -d '{"integer":-123}'
#
## Stop sample
#
#  ./mvnw spring-boot:stop
#
#  docker compose down
#

