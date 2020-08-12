pipeline {
  enviroment {
    JAVA_TOOL_OPTIONS="-Duser.home=/tmp/maven"
  }
  agent {
    docker {
      image 'maven:latest'
      args '-v /tmp/maven:/var/maven/.m2 -e MAVEN_CONFIG=/var/maven/.m2'
    }
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        sh 'mvn clean install'
      }
    }
  }
}