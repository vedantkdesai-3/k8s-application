echo "------------------------ Started [$1] ------------------------";

if [ "$1" == "image" ]
then
   docker build -f "Dockerfile" --tag k8s-spring-boot-application "."
   docker tag k8s-spring-boot-application:latest vedantkdesai/k8s-spring-boot-application:v1.0.0
fi

if [ "$1" == "image-push" ]
then
   docker push vedantkdesai/k8s-spring-boot-application:tagname
fi

if [ "$1" == "stop" ]
then
   docker-compose -f "docker-compose.yml" down
   kubectl delete -f deployment.yaml
fi

if [ "$1" == "deploy" ]
then
   mvn clean install 
   docker build -f "Dockerfile" --tag k8s-spring-boot-application "."
   docker tag k8s-spring-boot-application:latest vedantkdesai/k8s-spring-boot-application:v1.0.0
   docker-compose -f "docker-compose.yml" down
   docker-compose -f "docker-compose.yml" up -d --build
fi

if [ "$1" == "k-deploy" ]
then
   kubectl apply -f deployment.yaml
fi
echo "------------------------ Ended   [$1] ------------------------";
