pipeline {
  enviroment {
    JAVA_TOOL_OPTIONS="-Duser.home=/home/jenkins/maven"
  }
  agent {
    dockerfile {
      args '-v /repository/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2'
    }
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        sh 'mvn -version'
        sh 'mvn clean install'
      }
    }
  }
}