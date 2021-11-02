pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q flightadmin"
                bat "git clone https://github.com/wondyfraw/flightadmin.git"
                bat "mvn clean -f flightadmin"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f flightadmin"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f flightadmin"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f flightadmin"
            }
        }
    }
}