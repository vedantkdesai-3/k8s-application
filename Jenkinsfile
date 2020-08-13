pipeline {
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

    stage('Test-Suit') {
      parallel {
        stage('Testing') {
          steps {
            echo 'Testing'
            sh 'mvn test'
          }
        }

        stage('Perf-Testing') {
          steps {
            sh 'echo \'Perf-Testing\''
          }
        }

        stage('Integration-Testing') {
          steps {
            sh 'echo \'Integration Testing\''
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying'
      }
    }

  }
  environment {
    JAVA_TOOL_OPTIONS = '-Duser.home=/home/jenkins/maven'
  }
  post {
    always {
      junit 'target/surefire-reports/**/*.xml'
    }

  }
}