pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
    }
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building'
        sh 'mvn clean package'
      }
    }
  }
}