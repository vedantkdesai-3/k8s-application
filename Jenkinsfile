pipeline {
  environment {
    JAVA_TOOL_OPTIONS="-Duser.home=/home/jenkins/maven"
  }
  agent {
    dockerfile {
      args '-v /tmp/maven:/home/jenkins/.m2 -e MAVEN_CONFIG=/home/jenkins/.m2'
    }
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        sh 'mvn -version'
        sh 'mvn clean compile'
      }
    }
    stage('Testing') {
      setps {
        echo 'Testing'
        sh 'mvn test'
      }
    }
  }
  post {
    always {
        junit 'target/surefire-reports/**/*.xml'
    }
  }
}