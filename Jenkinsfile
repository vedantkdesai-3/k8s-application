pipeline {
  agent {
    docker {
      image 'maven:3.6.0-jdk-14'
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