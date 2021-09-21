echo "------------------------ Started ------------------------";
echo "Need to : $1";

if [ "$1" == "image" ]
then
   docker build -t  .
fi

if [ "$1" == "stop" ]
then
   docker-compose -f "docker-compose.yml" down
fi

if [ "$1" == "deploy" ]
then
   mvn clean install 
   docker build --pull --rm -f "Dockerfile" -t k8sapplication:v1 "."
   docker-compose -f "docker-compose.yml" down
   docker-compose -f "docker-compose.yml" up -d --build
fi
echo "------------------------ Ended   ------------------------";
