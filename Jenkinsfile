pipeline {
  agent {
    docker {
      image 'maven:latest'
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