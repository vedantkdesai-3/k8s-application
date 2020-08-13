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

    stage('Testing') {
      parallel {
        stage('Testing') {
          steps {
            echo 'Testing'
            sh 'mvn test'
          }
        }

        stage('Perf-Testing') {
          steps {
            sh '''echo \'Perf Testing\'

sh \'\'\' sleep 30'''
          }
        }

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